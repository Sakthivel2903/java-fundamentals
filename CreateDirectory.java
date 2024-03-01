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

public class CreateDirectory {
    public static void main(String args[]) { 
        try {
            Path path = Paths.get("C:\\Users\\Sakthivel\\Documents\\valueaddedcourse\\SampleDirectory");
            if (!Files.exists(path)) {
                Files.createDirectory(path);
                System.out.println("Directory created");
            } else {
                System.out.println("Directory already exists");
            }
        } catch (IOException e) {
            System.out.println(e); //Exception details
        }  
    }
}
