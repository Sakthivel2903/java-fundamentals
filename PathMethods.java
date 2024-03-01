/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sakthivel
 */
import java.nio.file.Path;
import java.nio.file.Paths;
public class PathMethods {
    public static void main(String args[]) { 
        Path p1 = Paths.get ("C:\\Users\\Sakthivel\\Documents\\valueaddedcourse\\Programs\\26. File Path");
        Path normalizedPath = p1.normalize();
        var p2 = Paths.get ("C:\\Users\\Sakthivel\\Documents\\valueaddedcourse\\Programs\\26. File Path");
	System.out.println("NormalizedPath: "+ normalizedPath);
	Path subPath = p1.subpath (1, 3);
	System.out.println("SubPath: "+ subPath);
        System.out.println("getFileName: "+ p1.getFileName());
        System.out.println("getParent: "+p1.getParent());
        System.out.println("getNameCount: "+p1.getNameCount());
        System.out.println("getRoot: " + p1.getRoot());
        System.out.println("isAbsolute: "+p1.isAbsolute());
        System.out.println("toAbsolutePath: "+p1.toAbsolutePath());
        System.out.println("toURI: "+p1.toUri());
        if(p1.equals(p2))
		System.out.println("Both are equal");
	else
		System.out.println("Both are not equal");
      }
}
    

