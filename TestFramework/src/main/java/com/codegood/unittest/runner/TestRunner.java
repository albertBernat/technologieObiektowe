package com.codegood.unittest.runner;

import com.codegood.unittest.core.TestCase;
import com.codegood.unittest.core.TestResult;
import com.codegood.unittest.core.TestSuite;
import com.codegood.unittest.report.FileUtils;
import com.codegood.unittest.report.ReportFilenameGenerator;
import com.codegood.unittest.report.TestStatistics;
import com.codegood.unittest.report.HTMLReportStatisticGenerator;
import org.reflections.Reflections;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;

public class TestRunner {

    private final String packageToScan;

    public TestRunner(String packageToScan) {
        this.packageToScan = packageToScan;
    }

    public void runTests() {
        Reflections reflections = new Reflections(packageToScan);
        Set<Class<? extends TestCase>> testCases = reflections.getSubTypesOf(TestCase.class);
        TestStatistics testStatistics = new TestStatistics();
        TestSuite testSuite = new TestSuite(testStatistics);
        testCases.forEach(testSuite::add);
        TestResult testResult = new TestResult();
        testSuite.run(testResult);

        HTMLReportStatisticGenerator htmlReportStatisticGenerator = new HTMLReportStatisticGenerator();
        String xmlFile = htmlReportStatisticGenerator.generateXML(testStatistics);
        String htmlReport = htmlReportStatisticGenerator.generateTransformer(xmlFile);
        String filePath = ReportFilenameGenerator.generatePath();
        FileUtils.create(filePath, htmlReport);
    }
}
