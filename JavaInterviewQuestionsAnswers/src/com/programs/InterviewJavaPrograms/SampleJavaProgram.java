package com.programs.InterviewJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SampleJavaProgram 
{
	public static void main(String[] args) 
	{
		
		String str="Java Interview Questions";
		String str2="java Interview Questions";
		//String str2="Selenium Interview Questions   ";
		//Concat
		String concatString=str.concat(str2);
		System.out.println(concatString);
		//Split
		String[] splitStr=str.split(" ");
		System.out.println(splitStr[2]);
		//equals
		boolean test=str.equals(str2);
		System.out.println(test);
		//equalignorecase
		boolean test2=str.equalsIgnoreCase(str2);
		System.out.println(test2);
		//startWith
		boolean test3=str.startsWith("ava");
	
		System.out.println(test3);
		//endWIth
		
		System.out.println("------------------");
		
		//trim
		String trimString=str.trim();
		System.out.println(trimString);
		//Uppercase
		String uppercase=str.toUpperCase();
		System.out.println(uppercase);
		//Lowercase
		String lowercase=str.toLowerCase();
		System.out.println(lowercase);
		//Replace chars
		String replace=str.replace("Ja", "");
		System.out.println(replace);		
		//Substring
		String subString=str.substring(0, 4);
		System.out.println(subString);
		
		
		
		
		/*int[] numbers={100,10,200,20,300};
		Arrays.sort(numbers);	
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("-------------------");
		for (int i = numbers.length-1; i >=0 ; i--) {
			System.out.println(numbers[i]);
		}
		*/
				
		/*int factorialNo=5;//5!=5		
		for (int i = (factorialNo-1); i >1; i--) 
		{
			factorialNo=factorialNo*i;
		}
		System.out.println(factorialNo);*/
		
		
		/*int[] numbers={10,20,30,40,50};	
		int max=numbers[0];
		int min=numbers[0];
		for (int i = 0; i < numbers.length; i++) 
		{
			if(max<numbers[i])
			{
				max=numbers[i];
			}
		}
		System.out.println("Max : "+max);
		
		for (int i = 0; i < numbers.length; i++) 
		{
			if(min>numbers[i])
			{
				min=numbers[i];
			}
		}
		System.out.println("Min : "+min);*/
		
		//reverse given array of strings or intergers
		/*//String[] names= {"java","c#","python"};
		int[] names={10,20,30};		
		for (int number : names) 
		{
			System.out.println(number);
		}
		
		List list=new ArrayList();	
		list.add(names[0]);
		list.add(names[1]);
		list.add(names[2]);
		System.out.println("------------------");
		
		Collections.reverse(list);
		
		for (Object  number : list) 
		{
			System.out.println(number);
		}*/
		
		
		/*
		//Swapping 2 no. without third variable
		int num1=10;
		int num2=20;
		System.out.println("Before swapping Values ");
		System.out.println(num1);
		System.out.println(num2);
		
		num1=num1+num2; //30
		num2=num1-num2; //30-20=10
		num1=num1-num2; //30-10=20
		System.out.println("After swapping Values ");
		System.out.println(num1);
		System.out.println(num2);
		
		List list=new ArrayList();
		list.add(num1);
		list.add(num2);		
		Collections.swap(list,0,1);
		num1=(Integer) list.get(0);
		num2=(Integer) list.get(1);
		System.out.println("After swapping Values ");
		System.out.println(num1);
		System.out.println(num2);*/
		
		
		//remove duplicate chars
		/*String inputString="JavaPrograms";			
		char[] chars = inputString.toCharArray();
		
		StringBuffer removeDuplicateChars = new StringBuffer();
		HashSet charSet=new HashSet();
		for (char c : chars) 
		{
		    if(charSet.add(c))
		    {
		    	removeDuplicateChars.append(c);
		    }

		}
		System.out.println(removeDuplicateChars); */		
		
		
		/*//reverse given string
		String inputString="InterviewJavaPrograms";
		String reverseString=new StringBuffer(inputString).reverse().toString();
		System.out.println(reverseString);
		
		String reverseString1="";
		for(int i=inputString.length()-1; i>=0; i--) {
			reverseString1 = reverseString1 + inputString.charAt(i);
	    }
		System.out.println(reverseString1);
*/		
		//reverse array
		/*int i,j;
		int arr[]={10,20,30,40,50};   	        
	    for(i=0; i<arr.length-1; i++)
	    {
	          System.out.println(arr[i]);
	    }
	    j = i - 1;  // now j will point to the last element
	    i=0; 		// and i will point to the first element	         
	      
	    while(i<j)
	    {
	    	int temp = arr[i];
	    	arr[i] = arr[j];
	    	arr[j] = temp;
	    	i++;
	    	j--;
	    }
		   
	       System.out.print("Now the Reverse of Array is : \n");
	       
	       for(i=0; i<arr.length-1; i++)
	       {
	           System.out.print(arr[i]+ "  ");
	       }    */
		
		// pattern 4
		/*int number;
		int length=5;
        for(int i=0; i<length; i++)
        {
        	number=1;
            for(int j=0; j<=i; j++)
            {
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }
        1 
        1 2 
        1 2 3 
        1 2 3 4 
        1 2 3 4 5 */
        
		// pattern 3
		/*int number=1;
		int length=4;
		for(int i=0; i<length; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }
		1 
		2 3 
		4 5 6 
		7 8 9 10 */
		
		// pattern 2
		/*int length=20;		
		for(int i=1; i<length; i++)
        {
			 //Print spaces first
	        for (int j = length - 1; j > i; j--) {
	            System.out.print(" ");
	        }

	        //Then print "*"
	        for (int j = 1; j <= i; j++) {
	            System.out.print("*");
	        }
            System.out.println();
        }
		 *
        **
       ***
		*/
		/*//pattern 1
		int length=5;		
		for(int i=0; i<length; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        *
        * **/
		
		//Find 2nd largest number & largest number
		/*int array[]={10,20,30,40,50};
		int largestNumber=array[0];
		int secondLargestNumber=array[0];
		
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i]>largestNumber)
			{
				secondLargestNumber=largestNumber;
				largestNumber=array[i];
			}
			else if(array[i]>secondLargestNumber)
			{
				secondLargestNumber=array[i];
			}			
		}
		System.out.println(largestNumber);*/
		
		
	/*	//Separate alphhbets and numerics
		String separatedigits="interview 01 java02 program03";
		String numbers="";
		String alphabets="";
		
		for (int i = 0; i < separatedigits.length(); i++) 
		{
			char ch=separatedigits.charAt(i);
			if(Character.isDigit(ch))
			{
				numbers=numbers+ch;				
			}
			else
			{
				alphabets=alphabets+ch;
			}				
		}
		System.out.println(numbers);
		System.out.println(alphabets);*/
	}	

}
		
		/*int count=0;
		String name = "Hello World";
		String str=null;
        char[] arr = name.toCharArray();
        for (int i = 0; i < arr.length; i++) 
        {
			if(arr[i]=='o')
			{
				count++;
			}
			if(count==2)
			{
				 //arr[i] = Character.toUpperCase(arr[i]);
				String str2=name.replace(String.valueOf(arr[i]), "");
				 str = new String(str2);
				 System.out.println(str);
				 break;
				 arr[i] = Character.toUpperCase(arr[i]);
				 str = new String(arr);
				 System.out.println(str);
				 break;
			}
		}*/

