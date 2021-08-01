package com.skilldistillery.foodtruck.app;

public class FoodTruck {

	private String name;
	private String foodType;
	private double rating;
	private int idNum;
	public String toString() {
		return "FoodTruck [name=" + name + ", foodType=" + foodType + ", rating=" + rating + ", idNum=" + idNum + "]";
	}

	private static int idCounter = 0;
		FoodTruck(String name, String foodType, double rating) {

		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.idNum = idCounter;
		FoodTruck.idCounter++;
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getFoodType() {
		return foodType;
	}

	
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	
	public double getRating() {
		return rating;
	}

	
	public void setRate(double rating) {
		this.rating = rating;
	}

	
	public int getIdNum() {
		return idNum;
	}

	
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
}