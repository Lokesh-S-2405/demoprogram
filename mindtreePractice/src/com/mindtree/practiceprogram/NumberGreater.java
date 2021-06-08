package com.mindtree.practiceprogram;
import java.util.Scanner;
/*------------------------------------------------------------------------------------------------------
 * Write a program to find the number just higher than the user input from an array of integers
 *Example:
 *Input:
 *arr[]={84,56,33,98,196}
 *user input:45
 *output:56 
 * --------------------------------------------------------------------------------------------------
 * pseudo code
 * 1.Take input from user
 *   1.Enter the number of elements(N).
 *   2.Create array of size N.
 *   3.Enter user input from array.
 * 2.Sort the array
 * 3.In sorted array find the user input next higher number and return its index.
 * 4.Using the index find the value from sorted array.  
 * --------------------------------------------------------------------------------------------------
 */
public class NumberGreater {
	public static int[] sortArray(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
			if(array[i]>array[j]) {
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;;
			}
		 }
		}
		return array;
	}
	public static int findNumber(int[] sortedArray, int num) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < sortedArray.length; i++) {
			if(sortedArray[i]>=num ) {
				return i;
				
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);  
	      System.out.println("Enter the number of elements");
	    int N=  scan.nextInt();
		int[] array=new int[N];
	    System.out.println("Input:");
	    for (int i = 0; i < N; i++) {
			array[i]=scan.nextInt();
			}
	    System.out.println("Enter the number");
		int num=scan.nextInt();
	   int[] sortedArray= sortArray(array);
	   int number=findNumber(sortedArray,num);
//   System.out.println(number);
	   System.out.println("Output");
	   if(number==-1) {
		   System.out.println("no such number is present");
	   }else {
		   System.out.println(sortedArray[number]);   
	   }
      scan.close();
	}
}

