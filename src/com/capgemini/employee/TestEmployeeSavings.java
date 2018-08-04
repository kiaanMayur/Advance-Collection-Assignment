package com.capgemini.employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//class to store EmployeeInformation and MMASavingsAccound in a same entity(HashMap)
public class TestEmployeeSavings {
	
	public static void main(String[] args) {
		
		//initialising the EmployeeInformation objects
		EmployeeInformation mayur = new EmployeeInformation(111, "Mayur", "Analyst", 17_000);
		EmployeeInformation gaurav = new EmployeeInformation(123, "Gaurav", "Analyst", 17_001);
		EmployeeInformation udit = new EmployeeInformation(222, "Udit", "Associate", 16_001);
		EmployeeInformation alok = new EmployeeInformation(333, "Alok", "A4", 13_001);
		EmployeeInformation rahul = new EmployeeInformation(444, "Rahul", "A3", 13_002);
		EmployeeInformation satyen = new EmployeeInformation(101, "Satyen", "POC expert", 80_000);
		
		//initialising the MMASavingAccount object
		MMASavingsAccount mayurSaving = new MMASavingsAccount(001, mayur.getEmpName(), 10_000, true);
		MMASavingsAccount gauravSaving = new MMASavingsAccount(021, gaurav.getEmpName(), 10_000, true);
		MMASavingsAccount alokSaving = new MMASavingsAccount(002, alok.getEmpName(), 10_000, true);
		MMASavingsAccount uditSaving = new MMASavingsAccount(032, udit.getEmpName(), 10_000, true);
		MMASavingsAccount rahulSaving = new MMASavingsAccount(045, rahul.getEmpName(), 10_000, true);
		MMASavingsAccount satyenSaving = new MMASavingsAccount(005, satyen.getEmpName(), 1_10_000, false);
		
		//creation of a HashMap with generics as EmployeeInformation = key & MMASavingAccount = value
		Map<EmployeeInformation, MMASavingsAccount> details = new HashMap<>();
		
		//adding the values in the hashmap
		details.put(mayur, mayurSaving);
		details.put(gaurav, gauravSaving);
		details.put(alok, alokSaving);
		details.put(udit, uditSaving);
		details.put(rahul, rahulSaving);
		details.put(satyen, satyenSaving);
		
		//invokation of entrySet() method
		Set<Entry<EmployeeInformation, MMASavingsAccount>> disp =  details.entrySet();
				
		//displaying the hashmap objects
		for(Entry e: disp ) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
