package com.mindtree.practiceprogram;
import java.util.Scanner;
/*--------------------------------------------------------------------------------------------------
  Write a program which takes an array of numbers from user and then sort those numbers using
  insertion sort and take out prime numbers if it’s there in array.
  Note : The prime numbers in subset should also be in sorted manner.
  Input: {9,2,89,7,15}
  Output: {2,7,9,15,89}
  Prime sorted subset array : {2,7,89}
--------------------------------------------------------------------------------------------------
  PseudoCode
  ----------
  1.Take Input from User
  2.Create an array.
  3.Sort the Array using Insertion sort technique
  3.In sorted array take out the prime number.
  4.Store the prime number present in sorted array to new array
  ---------------------------------------------------------------------------------------------------
 */
public class SortPrimeArray {
	static Scanner scan=new Scanner(System.in);

	public static int[] sortArray(int[] arr) {
		// TODO Auto-generated method stub
		//insertion sort
		int temp=0;
		int j=0;
		for(int index=1;index<arr.length;index++) {
			temp=arr[index];
			j=index-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		//		for(int i=0;i<arr.length;i++) {
		//   	   System.out.println(arr[i]);
		//        }
		return arr;
	}
	public  static int[] findPrimeNoInSortedArray(int[] sortedArray) {
		// TODO Auto-generated method stub
		int primeArray[]=new int[sortedArray.length];
		int primeArrayIndex=0;

		for(int i=0;i<sortedArray.length;i++) {
			int count=0;
			for(int j=2;j<=sortedArray[i]-1;j++) {

				if(sortedArray[i]%j==0) {
					count=count+1;
				}
			}
			if(count==0)
			{ 
				primeArray[primeArrayIndex]=	sortedArray[i];
				primeArrayIndex++;
			}
		}
		return primeArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of elements in an array1");
		Byte orderOfArray= scan.nextByte();
		System.out.print("Input : ");
		int Arr[]=new int[orderOfArray];
		for(int i=0;i<orderOfArray;i++) {
			Arr[i]=scan.nextInt();
		}
		System.out.print("Output : ");
		int[] sortedArray=sortArray(Arr);
		for(int i=0;i<sortedArray.length;i++) {
			System.out.print(sortedArray[i]+ " ");
		}
		System.out.println(" ");
		System.out.print("Prime sorted subset array : ");
		int prime[]=findPrimeNoInSortedArray(sortedArray);
		for(int i=0;i<(prime.length);i++) {
			if(prime[i]!=0) {
				System.out.print(prime[i]+ " ");
			} 
		}

		scan.close();
	}



}
