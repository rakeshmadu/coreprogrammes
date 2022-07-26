import java.util.*;
class PowerOf2 {
	public static void main(String[] args) {

		// Get input from user

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Power of 2");
		int N=sc.nextInt();	
		int sum=1;

		while (N >= 1) {  // print powers of 2^N
			sum=sum*2;
			System.out.println("Table of the power of 2 :");
			System.out.println(sum);
			if (sum >= N) {  // check power of 2^N is >= to N
   			break;
			}
			N--;
		}
		System.out.println("sum = "+sum);
	}
}
