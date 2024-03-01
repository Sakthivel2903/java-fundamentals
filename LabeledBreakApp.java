/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sakthivel
 */
public class LabeledBreakApp {
    public static void main(String args[]){
        first:
        for (int i = 0; i < 3; i++) {
            second:
            for (int j = 0; j < 3; j++) {
                if (1== i && 1 == j) {
                    break first;
                }
                System.out.println(i + " " + j);
            }
        }
    }  
}
