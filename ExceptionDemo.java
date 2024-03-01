/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sakthivel
 */
public class ExceptionDemo {
    public static void main(String args[]){
        try{
            int a[]=new int[5];
            a[5]=30/0; 
        }
        catch(ArithmeticException e){
            System.out.println(e);	
        }  	
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);	}  
	catch(Exception e) 
        {	
            System.out.println(e);	}  
	System.out.println("rest of the code...");  
        }
    }
    

