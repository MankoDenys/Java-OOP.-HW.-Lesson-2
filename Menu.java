package com.gmail.manjko;

import java.util.ArrayList;

public class Menu {
	private final String name;
	private final ArrayList<Dish> dishes = new ArrayList<>();

	public Menu(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addDish(Dish dish) {
		dishes.add(dish);
	}
	
	public Dish getCheapestDish() {
		double cheap = dishes.get(0).getPrice();
		Dish min = dishes.get(0);
		for(Dish i:dishes) {
			if(i.getPrice()<cheap) {
				min=i;
			}
		}
		return min;
	}
	
	public String toString() {
		return "Menu [name=" + name + "]";
	}

	

	
	
	
	

}
