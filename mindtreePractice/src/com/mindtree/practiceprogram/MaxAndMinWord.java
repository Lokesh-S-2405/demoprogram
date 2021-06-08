package com.mindtree.practiceprogram;
import java.util.Scanner;
/*------------------------------------------------------------------------------------------
 * Write a program to find out the largest and smallest word in the string.
 * Example
 * Input:I am good boy
 * Output:
 * Largest word is:good
 * Smallest word is:I
 * -----------------------------------------------------------------------------------------
 * pseudo code
 * 1.Take input from user
 * 2.Create a sentencesToWord method 
 *   1.Create a words array .
 *   2.Traverse the string .
 *      2a.Till character is not equal  to space.
 *      2b.If character equal to space then store the word in a words array.
 *      2c.Call minAndMaxWordInSentence to find min and max word in a given sentence.
 * 3.Create minAndMaxWordInSentence method
 *   1.Create a string variable(max and min).
 *   2.Store initial index value of words array to min and max string . 
 *   3.compare min value length with  words array.
 *     1.If min value length is smaller than words array value length 
 *      then store min as it is 
 *      else store word length in min value.
 *     2. If max value length is greater than words array value length 
 *      then store max as it is 
 *      else store word length in max value.
 *  4.Print min and max value.    
 *  -----------------------------------------------------------------------------------------
 */

public class MaxAndMinWord {
	public static void sentencesToWord(String str) {
		String[] words=new String[50];
		int temp=0;
		String word="";
	
		str=str+" ";
		// TODO Auto-generated method stub
		//
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!=' ' ) {
				word=word+str.charAt(i);
			}else {
				words[temp]=word;
				temp++;
				word="";
			}
		}
//		int j=0;
//		while(words[j]!=null) {
//			System.out.println(words[j]);
//			j++;
//		}
		// System.out.println(temp);
		minAndMaxWordInSentences(words,temp);
		
	}
 
	private static void minAndMaxWordInSentences(String[] words, int temp) {
		// TODO Auto-generated method stub
		String max=words[0],min=words[0];
		for (int i = 0; i <temp ; i++) {
			if(min.length()>words[i].length()) {
				min=words[i];
			}
			if(max.length()<words[i].length()) {
				max=words[i];
			}
		}
		System.out.println("Output:");
		System.out.println("Largest word is:"+max);
		System.out.print("Smallest word is:"+min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.print("Input : ");
      String str=scan.nextLine();
      sentencesToWord(str);
      scan.close();
		
	}

	
}
