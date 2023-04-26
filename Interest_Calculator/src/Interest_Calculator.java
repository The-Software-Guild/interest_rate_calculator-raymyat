/*
 * John has $500 to invest. 
 * Sue knows of a mutual fund plan that pays 10% interest annually, compounded quarterly. 
 * That is, every three months, the principal is multiplied by 2.5% 
 * (the 10% annual rate divided by 4 because it is compounded 4 times per year) 
 * and the result is added to the principal.
 * */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Interest_Calculator {
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How much do you want to invest?");
		double investAmount = sc.nextDouble();
		System.out.println("What is the annual interest rate % growth?");
		double annualInterestRate = sc.nextDouble();
		System.out.println("Choose interest compound period (Enter number 1-3): ");
		System.out.println("1: daily , 2: monthly, 3: quarterly");
		int compoundPeriod = sc.nextInt();
		while(compoundPeriod > 3 || compoundPeriod == 0) {
			System.out.println("Enter 1 - 3 number only");
			compoundPeriod = sc.nextInt();
		}
		System.out.println("Calculating...");
		interestCalculate(compoundPeriod,investAmount,annualInterestRate);
	}
	
	public static void interestCalculate(int compoundPeriod, double investAmount,double annualInterestRate) {
		double interestRate = 0.0;
		int numOfCompound = 0;
		
		if(compoundPeriod == 1) { //daily > compounded 365 times per year
			interestRate = annualInterestRate /365;
			numOfCompound = 365;
		}else if(compoundPeriod == 2) { //monthly > compounded 12 times per year
			interestRate = annualInterestRate /12;
			numOfCompound = 12;
		}else { //quarterly > compounded 4 times per year
			interestRate = annualInterestRate /4;
			numOfCompound = 4;
		}
		int numOfYears = 3;
		double[] initialAmtArr = new double[numOfYears];
		initialAmtArr[0] = investAmount;
		double[] finalAmtArr = new double[numOfYears];
		
		//calculate
		for(int i = 0; i < numOfYears; i++) { 
			double finalAmount = initialAmtArr[i];
			for(int j = 0; j < numOfCompound; j++) {
				finalAmount = finalAmount * (1 + (interestRate / 100));
			}
			finalAmtArr[i] = finalAmount;
			if(i!= numOfYears -1) {
				initialAmtArr[i + 1] = finalAmount;
			}
		}
		
		//Print result
		for(int i = 0; i < numOfYears; i++) {
			double earnAmt = finalAmtArr[i] - initialAmtArr[i];
			System.out.println("Year " + (i+1) + ": Began with $" + df.format(initialAmtArr[i])
								+ " Earned $"+ df.format(earnAmt) +" Ended with $" + df.format(finalAmtArr[i]));
		}
	}
}
