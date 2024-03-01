/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sakthivel
 */
public class Array{
    public static void main(String[] args) {
		int arr[] = {23,67,84,75,95,34,54,6,4,6,86};
		System.out.println("Length: "+arr.length);
		System.out.println("Elements are:");
		for (int i = arr.length-1 ;i >= 0 ; i--)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
