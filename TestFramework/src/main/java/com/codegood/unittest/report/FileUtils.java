package com.codegood.unittest.report;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

    public static void create(String path, String content) {
        try {
            Path filePath = Paths.get(path);
            File file = new File(path);
            file.getParentFile().mkdirs();
//            Files.createFile(filePath);
            Files.write(filePath,content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
