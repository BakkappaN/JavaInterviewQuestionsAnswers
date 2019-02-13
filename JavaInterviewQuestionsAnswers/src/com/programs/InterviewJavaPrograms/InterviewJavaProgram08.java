package com.programs.InterviewJavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterviewJavaProgram08 
{
	public static void main(String[] args) 
	{
		//int[] number={10,20,30,40,50};
		String[] languages={"java","c#","c++","python"};
		System.out.println("Before reversing array of String values are:");
		for (String i : languages) 
		{
			System.out.println(i);
		}
		
		List list=new ArrayList();
		list.add(languages[0]);
		list.add(languages[1]);
		list.add(languages[2]);
		list.add(languages[3]);
		
		
		Collections.reverse(list);
		
		System.out.println("After reversing array of String values are: ");
		for (Object object : list) 
		{
			System.out.println(object);
		}
		
		
		
	}

}
