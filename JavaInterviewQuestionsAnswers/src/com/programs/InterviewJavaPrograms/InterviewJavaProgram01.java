package com.programs.InterviewJavaPrograms;

public class InterviewJavaProgram01 
{

	public static void main(String[] args) 
	{
		System.out.println("");
		
		String inputString="Interview01 Java234 Program567";
		String alphabets="";
		String numeric="";
		
		for(int i=0;i<inputString.length();i++)
		{
			char ch=inputString.charAt(i);
			if(Character.isDigit(ch))
			{
				numeric=numeric+ch;				
			}
			else
			{
				alphabets=alphabets+ch;				
			}			
		}
		System.out.println("Numeric values are: "+numeric);
		System.out.println("Alphabets values are: "+alphabets);

	}

}
