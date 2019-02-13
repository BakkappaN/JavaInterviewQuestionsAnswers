package com.programs.InterviewJavaPrograms;

public class InterviewJavaProgram03 
{
	public static void main(String[] args) 
	{
		int array[]={10,20,30,40,50};
		int largestNumber=array[0];
		int secondlargestNumber=array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>largestNumber)
			{
				secondlargestNumber=largestNumber;
				largestNumber=array[i];
			}
			else if(array[i]>secondlargestNumber)
			{
				secondlargestNumber=array[i];
				
			}			
		}
		System.out.println("Second largest no. is :"+secondlargestNumber);
		System.out.println("Largest no. is :"+largestNumber);

	}

}
