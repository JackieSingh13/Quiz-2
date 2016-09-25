import java.util.Scanner;

public class Tuition {
	public static void main(String[] args){
		
		//This program calculates the cost of tuition for four years of college. It also calculates the monthly payment amount for a student
		
		Scanner in = new Scanner(System.in); //Create a scanner object to get input from user
		
		//Ask user to input their initial tuition cost, percentage increase for tuition, repayment APR, and term of repayment	
		System.out.println("Enter the initial cost of tuition: ");
		double IntTuit = in.nextDouble();
		
		System.out.println("Enter the percentage increase for tuition: ");
		double TuitInc = (in.nextDouble()/100);
		
		System.out.println("Enter the repayment APR (in percent ): ");
		double R = (in.nextDouble()/100);
		
		System.out.println("Enter the term of repayment (in years): ");
		double T = in.nextDouble();
		
		//Calculates the total cost of the tuition
		double TCost = IntTuit;
		for(int i=1; i!=4; i++) {
			TCost=(TCost)+((TCost/i)*(1+TuitInc));	
		}
		
		System.out.print("Total cost of tuition over four years: $");
		System.out.printf("%.2f", TCost);
		System.out.print("\n");
		
		//Calculates the monthly payment for the student
		double r = R+1;
		double t = T*12;
		
		double FCost = (((TCost*R*(Math.pow(r,t)))/((Math.pow(r,t))-1)));
		
		System.out.print("Payment per month: $");
		System.out.printf("%.2f", FCost);
	
		in.close();
	}

}
