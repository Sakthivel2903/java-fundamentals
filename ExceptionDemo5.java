/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sakthivel
 */
class InvalidAgeException extends Exception {  
	InvalidAgeException(String s) {  
		// Call constructor of parent Exception
		super(s);  
	}  
}
public class ExceptionDemo5 {
    static void validate(int age) throws InvalidAgeException {  
     if(age<18)  
         throw new InvalidAgeException("not eligible");  
     else  
      System.out.println("Eligible");
              }
}
