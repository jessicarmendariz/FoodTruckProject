package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

	private FoodTruck[] trucks;

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();
	}

	public FoodTruckApp() {
		this.trucks = new FoodTruck[5];
	}

	public void run() {
		Scanner kb = new Scanner(System.in);
		createTrucks(kb);
		while (trucks[0] != null) {
			menu();
		System.out.print("\n Menu Selection: ");
			int menuOption = kb.nextInt();
			if (menuOption == 1) {
				listTrucks();
			} else if (menuOption == 2) {
				averageTrucksRating();
			} else if (menuOption == 3) {
				listHighestRatingTruck();
			} else if (menuOption == 4) {
				break;
			} else 
				System.err.println("Invalid Entry");
		}
		exit();
	}


	public void createTrucks(Scanner input) {
		for (int i = 0; i < trucks.length; i++) {
			System.out.println("Enter Name of Food Truck " + (i + 1) + ":");
			String name = input.next();
			System.out.println("Enter Food Type " + (i + 1) + ":");
			String type = input.next();
			System.out.println("Enter Rating " + (i + 1) + ":");
			int rating = input.nextInt();
	
			trucks[i] = new FoodTruck(name, rating, type); 
			
			if (name.toLowerCase().equals("Quit")) {
				break; }
			else {
				continue; }
			}
	}

	public void menu() {
		System.out.println("              MENU");
		System.out.println("1. Your Food Trucks");
		System.out.println("2. Average Rating of Food Trucks");
		System.out.println("3. Highest Rated Food Truck");
		System.out.println("4. Exit");
	}

	public void listTrucks() {
		System.out.println("\n Your Food Trucks \n");
		for (FoodTruck truck : trucks) {
			if (truck == null) {
				break;
			}
			System.out.println(truck.toString());
		}
	}

	public void averageTrucksRating() {
		double sum = 0;
		int count = 0;
		for (FoodTruck truck : trucks) {
			if (truck == null) {
				break;
			}
			sum += truck.getRating();
			count++;
		}
		System.out.println("Average Rating: " + (Math.round((sum / count) * 10) / 10.0));
	}

	public void listHighestRatingTruck() {
		System.out.println("\n Your Highest Rated Food Truck: \n");
		int count = 0;
		int highestRating = Integer.MIN_VALUE;
		for (FoodTruck truck : trucks) {
			if (truck == null) {
				break;
			}
			if (highestRating < truck.getRating()) {
				highestRating = truck.getRating();
				count = 0;
			}
			if (highestRating == truck.getRating()) {
				count++;
			}
		}
		for (FoodTruck truck : trucks) {
			if (truck == null) {
				break;
			}
			if(truck.getRating() == highestRating) {
				System.out.println(truck.toString());
			}
		}
	}

	private void exit() {
		System.out.println("Goodbye! Stay Hungry!");
	}
}