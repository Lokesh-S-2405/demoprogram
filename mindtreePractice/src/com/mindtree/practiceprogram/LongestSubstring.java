package com.mindtree.practiceprogram;

import java.util.Scanner;

/* -------------------------------------------------------------------------------------------------
 * Write a program which will accept a string and identify the
 * longest substring between two equal characters excluding the equal characters in given string.
 * Example1:
 *  input:abca
 *  output:bc
 * Example 2:
 *  input:cabbac
 *  output:abba
 * -------------------------------------------------------------------------------------------------
 * pseudo code
 * 1.Take input from user.
 * 2.Call maxSubString method by passing string as argument.
 *   1.Traverse the one loop from starting index and another loop from last index and check if the character are equal.
 *     1.if character are equal then call subString method by passing starting index, last index and string .
     2.Create empty string and start storing the value from starting index+1 to last index-1.
     3.Return the string.
 * 3.Print max substring.     
 * --------------------------------------------------------------------------------------------------
 */
public class LongestSubstring {
	public static String maxSubstring(String string) {
		// TODO Auto-generated method stub
		//From last index
		for (int i = string.length()-1; i >=0 ; i--) {
			// From first index
			for (int j = 0; j+i < string.length(); j++) {
				//compare first index and last index value
				if(string.charAt(i+j)==string.charAt(j)) {
					return subString(string,j,i+j);
				}
			}
		}
		return null;
	}
	public static String subString(String string, int j, int i) {
		// TODO Auto-generated method stub
		String str="";
		//leaving two ends of character 
		for (int k = j+1; k <=i-1; k++) {
			str=str+string.charAt(k);
		}

		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.print("Input:");
		String string=scan.nextLine();
		System.out.print("Output:");
		String max=maxSubstring(string);
		System.out.println(max);
		scan.close();
	}



}
