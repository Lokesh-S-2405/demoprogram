package com.mindtree.practiceprogram;

import java.util.Scanner;

//sort primary diagonal element
//3 2 1
//7 8 9
//4 6 5
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the order of matrix");
		byte row=scan.nextByte();
		byte column=scan.nextByte();
		int[][] arr=new int[row][column];
        System.out.println("Enter the matrix elements");
        for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j]=scan.nextInt();
			}
		}
//        for (int i = 0; i < row; i++) {
//			for (int j = 0; j < column; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
////        
       int[][] sorted= sortPrimeDiagonal(arr);
       for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(sorted[i][j]+" ");
			}
			System.out.println();
		}
       scan.close();
	}

	private static int[][] sortPrimeDiagonal(int[][] arr) {
		// TODO Auto-generated method stub
                  int temp=0;
		for (int i = 0; i < arr.length-1; i++) {
			
				if(arr[i][i]>arr[temp+1][temp+1])
				{
					int temp1=arr[i][i];
					arr[i][i]=arr[temp+1][temp+1];
					arr[temp+1][temp+1]=temp1;
				}
				temp++;
			}
		return arr;
	}

}
