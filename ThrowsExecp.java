/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sakthivel
 */
public class ThrowsExecp {
    public static void main(String args[]){
        try{
            String str = null;
            System.out.println(str.length());
            }
        catch(NullPointerException e){
            System.out.println(e);
            }
        System.out.println("rest of the code");
        }
    }
    

