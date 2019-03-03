package math.problems;


import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int n;
		int status = 1;
		int num = 3;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n = scanner.nextInt();
		if (n >= 1)
		{
			System.out.println("First "+n+" prime numbers are:");
			System.out.println(2);
		}

		for ( int i = 2 ; i <=n ;  )
		{
			for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
			{
				if ( num%j == 0 )
				{
					status = 0;
					break;
				}
			}
			if ( status != 0 )
			{
				System.out.println(num);
				i++;
			}
			status = 1;
			num++;
		}
	}
}