package com.chainsys.test;

public class SecondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1546903;

		while (number > 0) {
			int rem = number % 10;
			if (rem % 2 == 0) {
				System.out.println("Given even Numbers:" + rem);

			}

			number = number / 10;
		}
	}

}
