package com.mindtree.practiceprogram;

import java.util.Scanner;
/*------------------------------------------------------
 * Write a program for transpose of a m*n matrix
 * example:
 * input:size of an array from user 3*3;
 *    1 2 3
 *    4 5 6
 *    7 8 9
 * output:
 *    1 4 7
 *    2 5 8
 *    3 6 9   
 * ------------------------------------------------------   
 * pseudo code
 * 1.Take input from user.
 *   1.Enter order of matrix.
 *   2.Create two dimension array with entered order.
 * 2.Call transpose method by passing array and order(row,column) as arguments.
 *   1.Create new two dimension array(resultant) with column and row size respectively.   
 *   2. Store the array values of row and column size  to new two dimension array(resultant).
 * 3.Return the resultant array and print it  
 * ------------------------------------------------------
 */
public class TransposeOfMatrix {

	public static int[][] transpose(int[][] twoDArray,int row,int column) {
		// TODO Auto-generated method stub

		int[][] resultant=new int[column][row];
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				resultant[i][j]=twoDArray[j][i];
			}
		}
		return resultant;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);  
		System.out.print("Enter the order of matrix:");
		int row=  scan.nextInt();
		int column=scan.nextInt();
		int twoDArray[][]=new int[row][column];
		System.out.println("Input:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				twoDArray[i][j]=scan.nextInt();
			}
		}
		int[][] output= transpose(twoDArray,row,column);
		System.out.println("Output:");
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();		
	}



}
