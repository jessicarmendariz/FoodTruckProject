package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

	FoodTruck[] foodTruckList = new FoodTruck[5];

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		FoodTruckApp app = new FoodTruckApp();
		app.createFoodTruck(kb);
		app.menu(kb);
		kb.close();
	}

	private void createFoodTruck(Scanner kb) {

		for (int i = 0; i < 5; i++) {

			System.out.println("Food Truck Name: ");
			System.out.println("(Type \"Quit\" for Main Menu)");

			String name = kb.nextLine();

			if (name.equals("Quit")) {
				break;
			}

			System.out.println("Food Type: ");
			String foodType = kb.nextLine();

			System.out.println("Rating: ");
			double rating = kb.nextDouble();
			kb.nextLine();
			FoodTruck newFoodTruck = new FoodTruck(name, foodType, rating);
			this.foodTruckList[i] = newFoodTruck; }
		
	}





	private void menu(Scanner kb) {
		
		System.out.println("              MENU               ");
		System.out.println("1. List Food Trucks");
		System.out.println("2. Average Ratings");
		System.out.println("3. Highest Rated Food Truck");
		System.out.println("4. Exit");
		
		int input = kb.nextInt();
		
		switch (input) {
			case 1:
				for (int i = 0; i < foodTruckList.length; i++) {
					if(foodTruckList[i] == null) {
						break; }
					System.out.println(foodTruckList[i].toString()); }
				
				
				menu(kb);
				break;
			case 2:
				double sum = 0.0;
				for (int i = 0; i < foodTruckList.length; i++) {
					if (foodTruckList[i] == null) {
						System.out.println(sum/i);
						break;
					}
					sum += foodTruckList[i].getRating(); }
				
				menu(kb);
				break;
			case 3:
				FoodTruck high = foodTruckList[0];
				
				for (int i = 0; i < foodTruckList.length; i++) {
					if (foodTruckList[i] == null){
						System.out.println(high.toString());
						break;
					}
					if (high.getRating() < foodTruckList[i].getRating()) {
						high = foodTruckList[i];
					}
				}
				
				
				menu(kb);
				break;
			case 4:
				System.out.println("Thank for stopping by!");
				break;

	}
	}
	}
