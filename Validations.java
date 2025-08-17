package com.exponent.BA.Validations;

import java.util.Scanner;

public class Validations {

	public static String validateAccountHolderName() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name :- ");
		String name = sc.next();
		char[] ch = name.toCharArray();
		boolean flag = true;
		for (int i = 0; i < ch.length; i++) {
			if (!(name.charAt(i) >= 'a' && name.charAt(i) <= 'z')
					&& !(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z')) {

				flag = false;
			}
		}

		if (!flag) {
			System.out.println("Invalid I/p");
			return validateAccountHolderName();
		}

		return name;

	}

}
