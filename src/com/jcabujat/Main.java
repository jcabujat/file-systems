package com.jcabujat;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {
        try {
//            // Create a blank file
////            Path fileToCreate = FileSystems.getDefault().getPath("Examples","file2.txt");
////            Files.createFile(fileToCreate);
//
//            // Create a directory
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2\\Dir3\\Dir4\\Dir5\\Dir6");
////            Files.createDirectory(dirToCreate);
//            Files.createDirectories(dirToCreate); // does not throw exception if the directory to be created already exists


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

//            // Delete file
//            Path fileToDelete = FileSystems.getDefault().getPath("Examples","Dir1", "file1copy.txt");
////            Files.delete(fileToDelete); // throws exception when file is not existing
//            Files.deleteIfExists(fileToDelete); // doesn't throw an exception when file is not existing
            // Get file size
            Path file1 = FileSystems.getDefault().getPath("Examples\\Dir1\\file1.txt");
            long size = Files.size(file1);
            System.out.println("file1 size = " + size);
            System.out.println("Last modified = " + Files.getLastModifiedTime(file1));

            BasicFileAttributes attributes = Files.readAttributes(file1, BasicFileAttributes.class);
            System.out.println("Size = " + attributes.size());
            System.out.println("Last modified = " + attributes.lastModifiedTime());
            System.out.println("Created time = " + attributes.creationTime());
            System.out.println("Is directory = " + attributes.isDirectory());
            System.out.println("Is regular file = " + attributes.isRegularFile());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
