package com.programs.InterviewJavaPrograms;

public class InterviewJavaProgram07
{
	public static void main(String[] args) 
	{
		int[] array={10,20,30,40,50};
		int max=array[0];
		int min=array[0];
		for (int i = 0; i < array.length; i++) 
		{
			if(max<array[i])
			{
				max=array[i];
			}
		}
		System.out.println("Maximum no. from array is : "+max);
		System.out.println("----------------------");
		for (int i = 0; i < array.length; i++) 
		{
			if(max>array[i])
			{
				max=array[i];
			}
		}
		System.out.println("Minimum no. from array is : "+min);

	}

}
