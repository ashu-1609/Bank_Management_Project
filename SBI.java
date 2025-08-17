package com.exponent.BA.ServiceIMPL;

import java.util.Scanner;

import com.exponent.BA.Model.Account;
import com.exponent.BA.Service.RBI;
import com.exponent.BA.Validations.Validations;

public class SBI implements RBI {

	Account ac = new Account();

	@Override
	public void createAccount() {

		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your Name :- ");
		ac.setAccHolderName(Validations.validateAccountHolderName());

		System.out.println("Enter Account Number :- ");
		ac.setAccNo(sc.nextLong());

		System.out.println("Enter phoneNumber :- ");
		ac.setPhoneNumber(sc.nextLong());

		System.out.println("ENter the PanCard Number:- ");
		ac.setPanCardNumber(sc.next());

		System.out.println("Enter the AdharNumber :- ");
		ac.setAdharNumber(sc.nextLong());

		System.out.println("Enter the Account opening Balance :- ");
		ac.setBalance(sc.nextDouble());

	}

	@Override
	public void displayAccount() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the account number :- ");
		long acn = sc.nextLong();
		if (acn == ac.getAccNo()) {
			System.out.println(ac);
		} else {
			System.out.println("Account Doesnot Exist");
		}

	}

	@Override
	public void displayBalance() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the account number :- ");
		long acn = sc.nextLong();
		if (acn == ac.getAccNo()) {
			System.out.println("Total Balance is :- " + ac.getBalance());
		} else {
			System.out.println("Account Doesnot Exist");
		}

	}

	@Override
	public void withdrawMoney() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the account number :- ");
		long acn = sc.nextLong();
		if (acn == ac.getAccNo()) {

			double tb = ac.getBalance();

			System.out.println("Enter the Withdraw amount :- ");
			double wa = sc.nextDouble();

			if (tb > wa) {

				tb = tb - wa;
				ac.setBalance(tb);
				System.out.println("Wihtdraw Successfull!!");

			} else {
				System.out.println("Insufficient Balance");
			}

		} else {
			System.out.println("Account Doesnot Exist");
		}

	}

	@Override
	public void depositeMoney() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the account number :- ");
		long acn = sc.nextLong();
		if (acn == ac.getAccNo()) {

			System.out.println("Enter your Deposite Ammount :- ");
			double da = sc.nextDouble();

			double tb = ac.getBalance();
			tb = tb + da;

			ac.setBalance(tb);

		} else {
			System.out.println("Account Doesnot Exist");
		}

	}

	@Override
	public void updateAccount() {

		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		while (flag) {

			System.out.println("------Upddate Details-----------");
			System.out.println("1. Update Name");
			System.out.println("2. Update Phone Number");
			System.out.println("3. Exit");
			System.out.println("Enter the Choice :- ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the account number :- ");
				long acn = sc.nextLong();
				if (ac.getAccNo() == acn) {
					System.out.println("Enter the New Name :- ");
					String newName = sc.next();
					ac.setAccHolderName(newName);
					System.out.println("--------Name Updated---------");
				} else {
					System.out.println("Account Does not exist");
				}
				break;
			case 2:

				System.out.println("Enter the account number :- ");
				long acn1 = sc.nextLong();
				if (ac.getAccNo() == acn1) {
					System.out.println("Enter the New PhoneNumber :- ");
					long pho = sc.nextLong();
					ac.setPhoneNumber(pho);
					System.out.println("--------PhoneNumber Updated---------");
				} else {
					System.out.println("Account Does not exist");
				}

				break;

			case 3:
				flag = false;
				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}

		}

	}

}
