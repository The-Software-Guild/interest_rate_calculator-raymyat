/*
 * a program that receives an integer value from a user and then calculates and 
 * prints out a list that includes all of the factors of that number, 
 * whether or not the number is perfect, 
 * and whether or not the number is prime.
 * */
import java.util.Scanner;
public class Factorizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer value:");
		int userInput = sc.nextInt();
		int index = 0;
		int[] factors = new int[userInput];
		int totalFactor = 0;
		System.out.println("Orginal Number: "+ userInput);
		
		//print factors of the number excluding the number 
		System.out.println("The factors of "+ userInput+": ");
		for (int i = 1; i < userInput; i++) {
			if(userInput % i == 0) {
				System.out.println(i + " ");
				factors[index] = i;
				index += 1;
			}
		}
		//total number of factors
		for(int i : factors) {
			totalFactor += i;
		}
		System.out.println("Total number of factors: " + totalFactor);
		
		//check perfect number
		if(totalFactor == userInput) 
			System.out.println(userInput + " is a perfect number.");
		else
			System.out.println(userInput + " is not a perfect number.");
		
		//check prime number
		if(checkPrime(userInput))
			System.out.println(userInput + " is a prime number.");
		else
			System.out.println(userInput + " is not a prime number.");
		

	}
	
	public static boolean checkPrime(int totalNum) {
		if(totalNum <= 1) {
			return false;  
	    }
		for(int i = 2; i <= totalNum/2;++i){   
			if(totalNum%i == 0)
				return false;
		}    
		return true;
	}

}
