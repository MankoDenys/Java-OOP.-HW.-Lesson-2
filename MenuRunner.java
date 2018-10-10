package com.gmail.manjko;

public class MenuRunner {

	public static void main(String[] args) {
		Menu a = new Menu("Cold dishes");
		Menu b = new Menu("Drinks");
		
		Dish one = new Dish("Olivje","salat",50.00);
		Dish two = new Dish("Caesar","salat",85.50);
		Dish three = new Dish("Rainbow","salat",45.20);
		
		Dish four = new Dish("Cola","soda water",15.00);
		Dish five = new Dish("Orange","juice",33.40);
		Dish six = new Dish("Blue lagoon","cocktail",55.00);
		
		a.addDish(one);
		a.addDish(two);
		a.addDish(three);
		b.addDish(four);
		b.addDish(five);
		b.addDish(six);
		
		System.out.println(a.getCheapestDish().getName());
		System.out.println(b.getCheapestDish());

	}

}
