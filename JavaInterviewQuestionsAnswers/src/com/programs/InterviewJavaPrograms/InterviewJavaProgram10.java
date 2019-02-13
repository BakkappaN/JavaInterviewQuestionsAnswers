package com.programs.InterviewJavaPrograms;

import java.util.Arrays;

public class InterviewJavaProgram10 
{
	public static void main(String[] args)
	{
		int[] numbers={100,10,200,20,300};

		Arrays.sort(numbers);
		
		System.out.println("After sorting in Ascending order");
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		
		System.out.println("After sorting in Descending order");
		for(int j=numbers.length-1;j>=0;j--)
		{
			System.out.println(numbers[j]);
		}
		
	}

}
