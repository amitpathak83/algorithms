package com.algo.math;

public class FindGCD {

	public static int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a % b);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(gcd(56, 40));

	}

}
