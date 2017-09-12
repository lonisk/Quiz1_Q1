import java.util.Scanner;

public class QB_Rating {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Number of touchdowns for quarterback
		System.out.println("Enter the number of touchdowns for the QB:");
		double TD = input.nextDouble();
		
		//Number of yards for quarterback
		System.out.println("Enter the number of yards for the QB:");
		double Yards = input.nextDouble();
		
		//Number of interceptions for quarterback
		System.out.println("Enter the number of interceptions for the QB:");
		double INT = input.nextDouble();
		
		//Number of passing attempts for quarterback
		System.out.println("Enter the number of passing attempts for the QB:");
		double ATT = input.nextDouble();
		
		//Number of completions for quarterback
		System.out.println("Enter the number of pass completions for the QB:");
		double comp = input.nextDouble();
		
		//close scanner
		input.close();
		
		//sub-calculations
		// A calculation
		double A = ((comp/ATT)-0.3)*5.0;
		if (A >=2.375 )
			A = 2.375;
		else if (A < 0)
			A = 0;
		else
			A = A;
		
		// B calculation
		double B = ((Yards/ATT)-3.0)*0.25;
		if (B >=2.375 )
			B = 2.375;
		else if (B < 0)
			B = 0;
		else
			B = B;
		
		// C calculation
		double C = (TD/ATT)*20.0;
		if (C >=2.375 )
			C = 2.375;
		else if (C < 0)
			C = 0;
		else
			C = C;
		
		// D calculation
		double D = 2.375 - ((INT/ATT)*25);
		if (D >=2.375 )
			D = 2.375;
		else if (D < 0)
			D = 0;
		else
			D = D;		
		
		//calculate initial QBrating
		double tempQBrating = ((A+B+C+D)/6.0)*100;
		
		//round QB rating
		double tempRating = tempQBrating*10;
		double NewtempRating = Math.round(tempRating);
		double QBrating = NewtempRating/10;
		
		//print passer rating
		System.out.println("QB rating is "+QBrating+".");
	}

}
