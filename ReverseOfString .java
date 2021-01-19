package javaSeleniumConcepts;

import java.util.Scanner;

public class ReverseOfString {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("The input is " +input);
		char[] arr=input.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
			System.out.println("Program Exit");
			
		}
		
	}

}
