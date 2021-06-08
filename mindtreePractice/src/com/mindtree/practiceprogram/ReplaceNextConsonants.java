package com.mindtree.practiceprogram;
import java.util.Scanner;
/*------------------------------------------------------------------------------------------------------
 * Take sentence as an user input and find the vowels in the sentence
 *  and replace the next consonant letter of the vowels with its next ASCII character.
    Example1: 
    Input: I am good boy
    Output: I an gooe boz
    Example2: 
    Input: I an gooe boz
    Output: I ao gooe boa
 * ------------------------------------------------------------------------------------------------
 * Pseudo Code
 * 1.Take input from user.
 * 2.Convert string to lowercase.
 * 3.Passing string to nextConsonants method
 *   1.Check the vowels in the sentences 
 *   2.Replacing next consonant with next ASCII character only if previous character is vowel and print the character.
 *   3.Else print the character as it is.
 * ------------------------------------------------------------------------------------------------
 */

public class ReplaceNextConsonants {
	static Scanner scan=new Scanner(System.in);

	public  static void nextConsonants(String str) {

		System.out.print("Output :");
		for (int i = 0; i <=str.length()-1; i++)
		{
			if(str.charAt(i)==' ')
			{
				System.out.print(" ");
			}else
				if( str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
				||str.charAt(i)=='o'||str.charAt(i)=='u' )
				{
					System.out.print(str.charAt(i));
					if( (str.charAt(i+1)=='a'||str.charAt(i+1)=='e'|| 
							str.charAt(i+1)=='i'||str.charAt(i+1)=='o'||
							str.charAt(i+1)=='u' ||str.charAt(i+1)==' ' ))
					{
						System.out.print(str.charAt(i+1));
						i++;

					}else 
					{
						if(str.charAt(i+1)=='z')
						{
							System.out.print('a');
							i++;
						}else
						{
							int c=(int)(str.charAt(i+1));
							System.out.print((char) (c+1));
							i++;
						}
					}

				} else
				{
					if(i!=0) {
						if(str.charAt(i-1)=='a'||str.charAt(i-1)=='e'||str.charAt(i-1)=='i'
								||str.charAt(i-1)=='o'||str.charAt(i-1)=='u' )
						{
							int c1=(int)(str.charAt(i));
							System.out.print((char)(c1+1));
						}
						else
						{
							System.out.print(str.charAt(i));	
						}
					}else
					{
						System.out.print(str.charAt(i));
					}
				}
		}
	}
	public static String convertStringToLowerCase(String str) {
		String s="";	
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input  :");
		String str=scan.nextLine();
		String string= convertStringToLowerCase(str);
		// System.out.println(string);
		nextConsonants(string);
		scan.close();
	}
}
