package com.mindtree.practiceprogram;

import java.util.Scanner;
/*-------------------------------------------------------------------------------------------------
 * Write a program to read 2D array as input which contains only unique elements, then replace max
element’s position with min element’s position.
Input :
1 2 3
4 5 6
7 8 9
Output :
9 2 3
4 5 6
7 8 1
----------------------------------------------------------------------------------------------------
 * Pseudo code
 * 1.Take input from user
 * 2.Create 2d array.
 * 3.Call replaceMaxMin method by passing 2d array and order of matrix.
 * 2.Find minimum and maximum value in an two dimensional array.
 * 3.Find minimum and maximum value rowIndex and columnIndex and store it in a variable.
 * 4.Create new 2d array.
 * 5.Use the variables which contains minimum and maximum index And swap the position of minimum and maximum in a new created 2d array.
 *--------------------------------------------------------------------------------------------------- 
 */
public class MinAndMaxPosReplace {
	public static int[][] replaceMaxMin(int[][] a,int m,int n) {
		// TODO Auto-generated method stub
		int min=0,max=0;
		max=min=a[0][0];
	
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(min>a[i][j]) {
					min=a[i][j];
				}
				if(max<a[i][j]) {
					max=a[i][j];
				}
			}
		}
// Checking min and max value		
//		System.out.println(min);
//		System.out.println(max);
		int replaceArr[][]=new int[m][n];
		int minIndexRow=0,minIndexColumn=0;
		int maxIndexRow=0,maxIndexColumn=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]==min) {
			minIndexRow=i;
			minIndexColumn=j;	
			}
				if(a[i][j]==max)
			{
					maxIndexRow=i;
					maxIndexColumn=j;
			}
		}
		}
//       Checking minimum value and maximum value index 		
//		System.out.println(minIndexRow+ " "+ minIndexColumn);
//		System.out.println(maxIndexRow+ " "+ maxIndexColumn);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==minIndexRow && j==minIndexColumn) {
					replaceArr[i][j]=a[maxIndexRow][maxIndexColumn];
				}else if(i==maxIndexRow && j==maxIndexColumn)
				{
					replaceArr[i][j]=a[minIndexRow][minIndexColumn];
				}else {
					replaceArr[i][j]=a[i][j];
				}
			}
		}
		
		return replaceArr;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the order of matrix");
		  int m=scan.nextInt();
		  int n=scan.nextInt();
		  int[][] a=new int[m][n];
		  System.out.println("Input : ");
		  for(int i=0;i<m;i++) {
			  for(int j=0;j<n;j++) {
				  a[i][j]=scan.nextInt();
			  }
		  }
//		  for(int i=0;i<m;i++) {
//			  for(int j=0;j<n;j++) {
//				  System.out.print(a[i][j]+ " ");
//			  }
//			  System.out.println(" ");
//		  }
		  int[][] finalArray=replaceMaxMin(a,m,n);
		  System.out.println("Output: ");
		  for(int p=0;p<a.length;p++) {
				for(int q=0;q<a[p].length;q++) {
					System.out.print(finalArray[p][q]+ " ");
				}
				System.out.println(" ");
		}
      scan.close();
	}
}
