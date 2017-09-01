package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*System.out.println("How many weights are you converting?: ");
		int e = input.nextInt();
		input.nextLine();	
		String [] earthWeights = new String[e];    */ // defined the earthWeights string array and it is "e" blocks long.
		
		System.out.print("Enter a series of Earth weights (space-separated): ");
		String userInput = input.nextLine();      
		String [] earthWeights = userInput.split(" ");		// 
		
		double marsW = 0;
		
		double [] earthWeightDoubleVersion = new double [earthWeights.length];		
		
		for (int i=0 ; i<earthWeights.length ; i++ ){
			earthWeightDoubleVersion[i] = Double.parseDouble(earthWeights[i]);
			marsW = earthWeightDoubleVersion[i] * 0.378;
			System.out.println(earthWeights[i] + "lbs. on Earth, is " + marsW + " lbs. on Mars.");

			}
		
		
		}
}
		
		
		
		
		
		
		
		
		
		
		
	/*Scanner input = new Scanner(System.in);
		
		System.out.print("How many weights are you converting?: ");
		double numberOfWeights = input.nextDouble();
		input.nextLine(); 
		
		System.out.print("Please enter first weight: ");
		double weight1= input.nextDouble();
		input.nextLine(); 
		
		double marsW; 
		
		System.out.println(earthW + " lbs. on Earth, is " + doWConversion(l, lengthType) ;{
		double [] array; 
		
		double i=0;
		
		for (i=0; i<array.length;i++);{
		marsW = array [i] * 0.378;
		}
		
		System.out.println( array[0] + "lbs. on Earth, is " + marsW + " lbs. on Mars.")
		{
				
	}

}*/
