package com.programs.InterviewJavaPrograms;

import java.util.HashSet;

public class InterviewJavaProgram05 
{
	public static void main(String[] args)
	{
		String inputString="Java12Programs12";
		char[] ch=inputString.toCharArray();
		
		HashSet hashset=new HashSet(); 
		StringBuffer removeDuplicateChars=new StringBuffer();
		
		for (char character : ch) 
		{
			if(hashset.add(character))
			{
				removeDuplicateChars.append(character);
			}			
		}
		System.out.println(removeDuplicateChars);
		

	}

}
