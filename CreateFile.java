/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sakthivel
 */
    import java.nio.file.*;
    import java.io.*;

public class CreateFile {
    public static void main(String args[]) { 
        try {
            Path path1 = Paths.get("C:\\Users\\Sakthivel\\Documents\\valueaddedcourse\\SampleDirectory\\Sample.txt");
            if (!Files.exists(path1)) {
                Files.createFile(path1);
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        } catch(IOException e) {
            System.out.println(e); // Exception details
        }
    }
}

