package com.jcabujat;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        try {
            Path sourcePath = FileSystems.getDefault().getPath("Examples", "file1.txt");
            Path copyPath = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
            Files.copy(sourcePath, copyPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
