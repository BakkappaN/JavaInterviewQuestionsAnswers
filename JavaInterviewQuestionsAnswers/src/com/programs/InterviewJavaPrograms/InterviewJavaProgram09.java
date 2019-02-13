package com.programs.InterviewJavaPrograms;

public class InterviewJavaProgram09 
{
	public static void main(String[] args) 
	{
		int factorialNum=5;
		
		for (int i = (factorialNum-1); i>1; i--) 
		{
			factorialNum=factorialNum*i; //5*4=20   20*3=60  60*2=120
		}
		System.out.println("Factorial of given No. is : "+ factorialNum);
	}

}
