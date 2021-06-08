package com.mindtree.practiceprogram;
import java.util.Scanner;
/*--------------------------------------------------------------------------------------------
 * Find the number of occurrence of a given string in the sentence.(Ignore the case sensitive) 
 *   Input : "Today is sunday, It's holiday"  
 *   Substring : Day  
 *   Output : 3
 *--------------------------------------------------------------------------------------------- 
 * Pseudo code
 * 
 * 1.Ask input from user.
 * 2.Create two string.
 * 3.Call convertStringToLowerCase method by passing string as argument.
 *   1.Create a string variable 's' and integer variable 'c'.  
 *   2.Store ASCII value of character in c.
 *   3.Check if ASCII value lies between 65 and 90 
 *     if yes, convert it to lower case by adding +32 and convert ASCII code value back to character and store the result in string 's' .
 *     else 
 *     if no, convert ASCII code value back to character and store the result in string 's'.
 *   4.Return string 's'.  
 *   convert both the string to lower case.
 * 4.Call convertStringToCharacter method by passing string as argument 
 *   convert both the string to character array.    
 * 5.Call checkSubstringInSentences method by passing two character array
 *   1.Declare a 'count' variable.
 *   2.compare substring2 character with string1 character if character is present increment count value
 *   3.Divide count value by substring length and display the result.   
 *   ----------------------------------------------------------------------------------------------------------------
 */
public class Repeatedstring {
 static Scanner scan=new Scanner(System.in);
 public static String convertStringToLowerCase(String str) {
	  String s=" ";	
	  int c=0;
	 for(int i=0;i<str.length();i++) {
		       c=str.charAt(i);        //primitive type casting-narrowing
			
			if(c>64 && c<91) {
				c=c+32;
				s=s+(char)c;          //primitive type casting-widening
			}else {
				s=s+(char)c;          //primitive type casting-widening
			}
		}
		return s;
	}
 public static char[] convertStringToCharacter(String str) {
		
		char[] c=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			 c[i]=str.charAt(i);
		}
		return c;
	}
 public static int checkSubstringInSentences(char[] string1, char[] subString2) {
		// TODO Auto-generated method stub
		int stringCount=string1.length;
		int subStringCount=subString2.length;
		int count=0;
		for(int i=0;i<stringCount;i++) {
			for(int j=0;j<subStringCount;j++) {
				if(subString2[j]==string1[i]) {
					count++;
				}
			}
		}
		int output=count/subStringCount;
		return output;
 }
	public static void main(String[] args) {
		
	System.out.print("Input : ");
        String string=scan.nextLine();
        System.out.print("Substring : ");
        String substring=scan.next();
        String lowercaseString= convertStringToLowerCase(string);
        String lowercaseSubstring= convertStringToLowerCase(substring);
        char string1[]= convertStringToCharacter(lowercaseString);
        char subString2[]=convertStringToCharacter(lowercaseSubstring);
//     	System.out.println(convertStringToCharacter(lowercaseString));
//     	System.out.println(convertStringToCharacter(lowercaseSubstring));
        int noOfOccurence=checkSubstringInSentences(string1,subString2);
        System.out.print("Output : "+noOfOccurence);
//      for(int i=0;i<substring2.length;i++) {
//    	  System.out.println(substring2[i]);
//      }
       scan.close();
	}
	

}
