package Project6;
import java.util.Scanner;

public class project6 {
	
	public static long sum(int n) {
		if (n<0) 
			return n+sum(n+1);
			//throw
		//new IllegalArgumentException("cantcalculate");
		if (n==1)
			return 1;
		else if (n==0)
			return 0;
		else if (n==0)
			return 0;
		else
			return n+sum(n-1);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Sum of what number do you want to calculate");
		int num = stdIn.nextInt();
		System.out.printf("%d = %d", num, sum(num));

	}

}
