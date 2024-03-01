/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sakthivel
*/
    import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int square = calculateSquare(num);

        System.out.println("The square for " + num + " is: " + square);
    }

    public static int calculateSquare(int num) {
        if (num == 1) {
            return 1;
        }
        return num * calculateSquare(num - 1) + num;
    }
}


