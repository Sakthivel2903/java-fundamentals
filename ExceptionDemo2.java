/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sakthivel
 */
public class ExceptionDemo2 {
    static void validate(int num){
        if(num<0)
            throw new ArithmeticException("Invalid value");
        else 
            System.out.println("Valid to proceed");
    }
    public static void main(String args[]){
        try{
            validate(-10);
        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }
        System.out.println("rest of the code...");   
    }
    
}
