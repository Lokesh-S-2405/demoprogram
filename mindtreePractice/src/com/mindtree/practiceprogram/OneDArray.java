package com.mindtree.practiceprogram;
import java.util.Scanner;
/*-----------------------------------------------------------------------------------
 * Take two 1D arrays as user input and subtract the 1st array from 2nd array .
 Create a new array with all the negative numbers from the resultant array
 Input:
 Array 1 : {10,67,1}
 Array 2 : {16,8,90}
 Output:
 Resultant array {-6,59,-89}
 Array with negative numbers {-6,-89}
 --------------------------------------------------------------------------------------------
 *Pseudo code
 * 1.Ask user to enter input from 
 * 2.Create two array
 * 3.Call subtractTwoArray by passing arr1 and arr2 as arguments
 *   1.Declare two variable an store minimum and maximum length of two array.
 *   2.Create a resultant array of index (maximum length of two array)
 *   3.Subtract two array by using minimum length and store in resultant array
 *   4. if arr1 length greater than arr2 length 
 *      then store remaining elements of arr1 as it in resultant array starting from arr2.length.
 *   5. if arr2 length greater than arr1 length 
 *      then store remaining elements of arr2 as -value  and store it in resultant array starting from arr1.length.
 * 4.Create neg array and store all negative value of resultant array.
 *-------------------------------------------------------------------------------------------- 
 */
public class OneDArray {

	static Scanner scan=new Scanner(System.in);

	public static int[] subtractTwoArray(int[] arr1, int[] arr2) {
		int count=0;
		int noOfElements=arr1.length<=arr2.length?arr1.length:arr2.length;
		int finalCount=arr1.length>=arr2.length?arr1.length:arr2.length;
		int[] resultant=new int[finalCount];
		for(int i=0;i<noOfElements;i++) {
			resultant[i]=arr1[i]-arr2[i];
		}
		if(arr1.length>arr2.length) {
			count=arr2.length;
			while(count<arr1.length) {
				resultant[count]=arr1[count];
				count++;
			}
		}else
		{ 
			count=arr1.length;
			while(count<arr2.length) {
				resultant[count]=-arr2[count];
				count++;
			}
		}		
		return resultant;

	}
	public static void negativeValueInArray(int[] resultantArray) {

		System.out.print("Array with negative numbers : ");

		int count=0;
		for(int l=0;l<resultantArray.length;l++) {
			if(resultantArray[l]<0) {
				System.out.print(resultantArray[l]+ "  ");
				count++;
			}
		}
		if(count==0) {
			System.out.println("No Negative element");
		}
	}

	public static void main(String[] args) {
		// Taking input from user for array1
		System.out.println("Enter no of elements in an array1");
		Byte orderOfArray1= scan.nextByte();
		System.out.println("Enter the Array1 elements");
		int Arr1[]=new int[orderOfArray1];
		for(int i=0;i<orderOfArray1;i++) {
			Arr1[i]=scan.nextInt();
		}

		// Taking input from user for array2
		System.out.println("Enter no of elements in an array2");
		Byte orderOfArray2= scan.nextByte();
		System.out.println("Enter the Array2 elements");
		int Arr2[]=new int[orderOfArray2];
		for(int j=0;j<orderOfArray2;j++) {
			Arr2[j]=scan.nextInt();
		}
		// Calling subtractTwoArray method
		int[] resultantArray=subtractTwoArray(Arr1,Arr2);
		System.out.print("Resultant Array : ");
		for(int k=0;k<resultantArray.length;k++) {
			System.out.print(resultantArray[k] + "  " );
		}
		System.out.println(" ");
		//Calling negativeValueInArray method
		negativeValueInArray(resultantArray);
		scan.close();
	}
}
