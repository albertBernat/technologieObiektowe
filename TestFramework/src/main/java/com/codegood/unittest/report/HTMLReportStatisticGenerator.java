package com.codegood.unittest.report;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

public class HTMLReportStatisticGenerator {


    public String generateXML(TestStatistics testStatistics) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TestStatistics.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            Writer writer = new StringWriter();
            marshaller.marshal(testStatistics, writer);
            return writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String generateTransformer(String xmlFile) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Templates template = factory.newTemplates(new StreamSource(
                    new FileInputStream("TestFramework/src/main/resources/resultTemplate.xsd")));
            Transformer xformer = template.newTransformer();
            Source source = new StreamSource(new StringReader(xmlFile));
            StringWriter writer = new StringWriter();
            Result result = new StreamResult(writer);

            xformer.transform(source, result);

            return writer.toString();
        } catch (FileNotFoundException | TransformerException e) {
            e.printStackTrace();
        }

        return null;
    }
}
