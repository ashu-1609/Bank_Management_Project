package com.exponent.BA.Controller;

import java.util.Scanner;

import com.exponent.BA.Service.RBI;
import com.exponent.BA.ServiceIMPL.SBI;

public class homeController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		RBI r = new SBI();

		boolean flag = true;

		while (flag) {
			System.out.println("1.CreateAccount");
			System.out.println("2.DisplayAccount");
			System.out.println("3.DisplayBalance");
			System.out.println("4.withdrawMoney");
			System.out.println("5.depositeMoney");
			System.out.println("6.UpdateAccount");
			System.out.println("7.Exit");
			System.out.println("Enter the Choice :- ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				r.createAccount();
				break;

			case 2:
				r.displayAccount();
				break;
			case 3:
				r.displayBalance();
				break;
			case 4:
				r.withdrawMoney();
				break;
			case 5:
				r.depositeMoney();
				break;
			case 6:
				r.updateAccount();
				break;

			case 7:

				flag = false;
				break;
			default:
				System.out.println("Invalid value entered!!");
				break;
			}
		}

	}

}
