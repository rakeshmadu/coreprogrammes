import java.util.*;
public class Leap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean leap=false;
		
		// Get iput of year from user

		System.out.println("Enter the Year");
		int year=sc.nextInt();
		if (year % 4 == 0) {    // check year is divisible by 4
			
			if(year % 100 == 0) {   // check year is divisible by 100

				if(year % 400 == 0)  //check year is divisible by 400

					leap=true;
				else
					leap=false;
			}
			else
					leap=true;
		}
		else
			leap=false;
		if (leap)
				System.out.println(year+" is a leap year");
		else
				System.out.println(year+" is Not a leap year");

	}
}
