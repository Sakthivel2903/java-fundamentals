/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sakthivel
 */
public class ContinueApp {
    public static void main (String args[]) {
        for(int count = 1;count<10;count++) {
            if(count ==5)
                continue;
            System.out.println("Count is: " + count);
        }
    }   
}
