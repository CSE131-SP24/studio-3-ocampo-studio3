package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Find prime numbers up to: ");
		int n = in.nextInt();

		boolean primes[] = new boolean[n + 1]; //primes up to 10, we want 11 spaces because of 0
		//boolean arrays values are false by default
		
		for(int i = 0; i < primes.length; i++) {
			primes[i] = true;
		}
		
		for(int j = 2; j <= n; j++) { //iterates through numbers up to n
			if(primes[j]) { // if j is a prime, then compute multiples
				for(int i = j + j; i <= n; i = i + j) { //calculates multiples, set them as false if not a prime (mark as not prime)
					primes[i] = false; // this means its not a prime value
				}
			} 
		}
		System.out.println("Prime numbers: ");
		for(int i = 2; i <= n; i++) {
			if(primes[i]) { //if it's a prime, then it should print
				System.out.println(i);
			}
		}
	}

}
