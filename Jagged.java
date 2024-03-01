/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sakthivel
 */
public class Jagged {
    public static void main(String[] args) {	
	// Declaring 2-D array with 4 rows
	int arr[][] = new int[4][];
	// Making the above array Jagged
	// First row has 3 columns
	arr[0] = new int[3];
	// Second row has 2 columns
	arr[1] = new int[2];
	arr[2] = new int[1];
	arr[3] = new int[4];
	// Initializing array
	int count = 5;
	for (int i = 0; i < arr.length; i++)
	    for (int j = 0; j < arr[i].length; j++) {
		arr[i][j] = count;
		count+=5; 	
	    }
	 // Displaying the values of 2D Jagged array
	 System.out.println("Contents of 2D Jagged Array");
	 for (int i = 0; i < arr.length; i++)	{
	    for (int j = 0; j < arr[i].length; j++)
		System.out.print(arr[i][j] + " ");
		System.out.println();  	
	    } 
	} 
}
    

