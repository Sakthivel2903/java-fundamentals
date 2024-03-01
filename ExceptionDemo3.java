/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sakthivel
 */
public class ExceptionDemo3 {
    static void fun() throws IllegalAccessException {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) {
        try{
            fun();
        }
        catch(IllegalAccessException e){
            System.out.println("caught in main.");  
        }
    }
    
}
