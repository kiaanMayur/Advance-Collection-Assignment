package com.capgemini.account;

import java.util.*;

// class which implements Comparator interface so compare() will be overridden
public class BankAccountArrayList implements Comparator<SavingsAccount> {

	@Override
	public int compare(SavingsAccount arg0, SavingsAccount arg1) {
		
		return arg0.getAccountId() - arg1.getAccountId();
	}
	
	public static void main(String[] args){
		
		BankAccountArrayList bank = new BankAccountArrayList();
		
		// intialising an arrayList with generic SavingAccounts
		List<SavingsAccount> savings = new ArrayList<>();
		
		//Adding the values to the arraylist
		savings.add(new SavingsAccount(10_000, 123, "Mayur", true));
		savings.add(new SavingsAccount(12_560, 116, "Udit", true));
		savings.add(new SavingsAccount(3_000, 102, "Gaurav", false));
		savings.add(new SavingsAccount(1_000, 132, "Alok", true));
		savings.add(new SavingsAccount(5_000, 100, "Rahul", false));
		savings.add(new SavingsAccount(41_000, 231, "Satyen", true));
		

		Collections.sort(savings, bank);
		//displaying the values of arraylist
		for(SavingsAccount sa : savings) {
			System.out.println(sa);
		}

	}
}
