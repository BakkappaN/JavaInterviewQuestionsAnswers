package com.programs.InterviewJavaPrograms;

public class InterviewJavaProgram04 
{
	public static void main(String[] args) 
	{
		String inputString="InterviewJavaPrograms";
		String reverseString="";
		
		for(int i=inputString.length()-1;i>=0;i--)
		{
			reverseString=reverseString+inputString.charAt(i);			
		}
		System.out.println(reverseString);
		
		String reverseString2=new StringBuffer(inputString).reverse().toString();
		System.out.println(reverseString2);
	}

}
