package com.mindtree.practiceprogram;
import java.util.Scanner;
/*--------------------------------------------------------------------------------------------------------------------------------
 *Create a matrix of order 3*3 and return the average of odd numbers present in both primary and secondary diagonals of the matrix.
    Example:     
    Input:  1 2 4
            3 5 6 
            7 8 9   
   Output:  Primary diagonal odd numbers average: (1 + 5 + 9) / 3 = 5  
            Secondary diagonal odd numbers average: (5 + 7) /2 = 6 
 * --------------------------------------------------------------------------------------------------------------------------------
 *Pseudo code
 *
 *1.Take input from user
 *  Validate if the order is 3x3 else ask user to end valid order.
 *2.Create 2D array of order 3x3
 *3.Call primaryDiagonal by passing array as argument.
 *4.Find sum and average of primary diagonal and display the result in main method
 *5.Call secondaryDiagonal by passing array as argument.
 *6.Find sum  and average of secondary diagonal and display the result in main method. 
 *----------------------------------------------------------------------------------------------------------------------------------
 */
public class Averagematrix {

	public static int primaryDiagonal(int[][] array) {
		System.out.print("Primary diagonal odd numbers average: ");
		int primarySum=0;
		byte count=0;

		for(int i=0;i<array.length;i++) {
			if(array[i][i]%2!=0) {
				primarySum=primarySum+array[i][i];
				count++;
			}
		}
		int averageOfPrimarySum=primarySum/count;
		return averageOfPrimarySum;
	}
	public static int secondaryDiagonal(int[][] array) {
		System.out.print("Secondary diagonal odd numbers average: ");
		int secondarySum=0;
		byte count=0;
		int column=array.length-1;
		for(int i=0;i<array.length;i++) {
			if(array[i][column]%2!=0) {
				secondarySum=secondarySum+array[i][column];
				column--;
				count++;
			}else {
				column--;
			}
		}
		int averageOfSecondarySum=secondarySum/count;
		return averageOfSecondarySum;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the order of matrix");
		int row=0,column=0;
		int[][] array=null;
		row=scan.nextInt();
		column=scan.nextInt();
		if(row==3 && column==3) {
			array=new int[row][column];
		}else {
			System.out.println("Please!! Enter 3x3 order");
			int updatedRow = scan.nextInt();
			int  updatedColumn=scan.nextInt();
			row=updatedRow;
			column=updatedColumn;
			array=new int[row][column];

		}
		System.out.println("Input : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				array[i][j]=scan.nextInt();
			}
		}
		//		  for(int i=0;i<row;i++) {
		//			  for(int j=0;j<column;j++) {
		//				  System.out.print(array[i][j]+ " ");
		//			  }
		//			  System.out.println(" ");
		//		  }
		System.out.println(primaryDiagonal(array));
		System.out.println( secondaryDiagonal(array));
		scan.close();
	}
}
