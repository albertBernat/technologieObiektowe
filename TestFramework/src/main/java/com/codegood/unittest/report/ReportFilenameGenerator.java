package com.codegood.unittest.report;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReportFilenameGenerator {

    public static String generatePath() {
        LocalDateTime localDateTime = LocalDateTime.now();
        String now = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
        return "Reports" +"\\" + "Test_Report_" + now + ".html";
    }
}
