package com.programs.InterviewJavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterviewJavaProgram06 
{
	public static void main(String[] args) 
	{
		System.out.println();
		
		
		int num1 = 10;
		int num2 = 20;
		System.out.println("Before Swapping Values");
		System.out.println(num1);
		System.out.println(num2);
		
		num1=num1+num2; //10+20=30
		num2=num1-num2; //30-20=10
		num1=num1-num2; //30-10=20
		
		System.out.println("After Swapping Values");
		System.out.println(num1);
		System.out.println(num2);
		
		/*List list=new ArrayList();
		list.add(num1);
		list.add(num2);
		Collections.swap(list, 0, 1);
		
		num1=(Integer) list.get(0);
		num2=(Integer) list.get(1);
		System.out.println("After Swapping Values");
		System.out.println(num1);
		System.out.println(num2);*/
	}

}
