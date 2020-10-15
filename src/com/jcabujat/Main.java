package com.jcabujat;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        try {
//            //Copy file
//            Path sourcePath = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyPath = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Files.copy(sourcePath, copyPath, StandardCopyOption.REPLACE_EXISTING);
//
//            // Copy directory
//            sourcePath = FileSystems.getDefault().getPath("Examples","Dir1");
//            copyPath = FileSystems.getDefault().getPath("Examples","Dir4");
//            Files.copy(sourcePath, copyPath, StandardCopyOption.REPLACE_EXISTING);

//            // Move file
//            Path fileToMove = FileSystems.getDefault().getPath("Examples","file1copy.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples", "Dir1","file1copy.txt");
//            Files.move(fileToMove, destination, StandardCopyOption.REPLACE_EXISTING);

//            // Rename file - directory should be the same, you only need to change file name then use Files.move method
//            Path fileToMove = FileSystems.getDefault().getPath("Examples","file1.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples", "file1 rename.txt");
//            Files.move(fileToMove, destination, StandardCopyOption.REPLACE_EXISTING);

            // Delete file
            Path fileToDelete = FileSystems.getDefault().getPath("Examples","Dir1", "file1copy.txt");
//            Files.delete(fileToDelete); // throws exception when file is not existing
            Files.deleteIfExists(fileToDelete); // doesn't throw an exception when file is not existing

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
