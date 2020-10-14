package com.jcabujat;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);
        Path subPath = FileSystems.getDefault().getPath("file","SubdirectoryFile.txt");
        printFile(subPath);
        Path outPath = Paths.get("C:\\Users\\jonat\\IdeaProjects\\OutThere.txt.txt");
        printFile(outPath);
    }

    private static void printFile(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
