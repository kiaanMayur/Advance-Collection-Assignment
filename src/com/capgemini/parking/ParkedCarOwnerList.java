package com.capgemini.parking;

import java.util.*;
import java.util.function.*;

// creation of list of the details of the person who has parked a car
public class ParkedCarOwnerList {
	
	private static int floor = 0;
	private static int section = 0;
	private static int token = 0;
	private static int ownerToken = 0;
	
	List<ParkedCarOwnerDetails> owner = new LinkedList<>();
	
	// method to check at which section and floor a car can be parked
	public int addNewCar(ParkedCarOwnerDetails newCar) {
		
		if(floor < 3) {
			if(section < 4) {
				if(token < 20) {
					owner.add(newCar);
					System.out.println("car Added.");
					token++;
					ownerToken++;
					return token;
				}
				else {
					owner.add(newCar);
					System.out.println("car Added.");
					section++;
					token = 0;
					ownerToken++;
					return token;
				}
			}
			else {
				owner.add(newCar);
				System.out.println("car Added.");
				token++;
				section = 0;
				floor++;
				ownerToken++;
				return token;
			}
		}
		else
			return -1;
	}
		
	public void removeCar(ParkedCarOwnerDetails car) {
		owner.remove(car);
		
		if(token == 1) {
			token = 0;
			if(section == 1) {
				section = 0;
				floor--;
				ownerToken--;
			}
			else
				{
				section--;
				ownerToken--;
				}
		}
			
		else
		{
			token--;
			ownerToken--;
		}
	
		System.out.println("Car removed.");
	}
	
	public void getParkedCarLocation(int token) {
		
		if(token == ownerToken) {
			Consumer<ParkedCarOwnerDetails> disp = System.out :: println;
			owner.stream().forEach(disp);
		}
	}

}
