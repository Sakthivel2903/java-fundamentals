/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sakthivel
 */
public class BreakApp {
    public static void main (String args[])
    {  
        for(int count = 1;count<10;count++) {
            if(count ==5)
                break;    //exit from the current loop
            System.out.println("Count is: " + count);
        }
    }
}