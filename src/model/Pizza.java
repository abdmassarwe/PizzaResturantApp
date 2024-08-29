package model;

import java.util.ArrayList;

public class Pizza {
	private PizzaSize size; //Small, medium, large,...
	private CrustType crustType; // Thin, Thick, Stuffed, etc.
	private ArrayList<Toppings> toppings;// pizza toppings - Green Olive, Corn...
	public Pizza(PizzaSize size, CrustType crustType, ArrayList<Toppings> toppings) {
		super();
		this.size = size;
		this.crustType = crustType;
		this.toppings = toppings;
	}
	public PizzaSize getSize() {
		return size;
	}
	public void setSize(PizzaSize size) {
		this.size = size;
	}
	public CrustType getCrustType() {
		return crustType;
	}
	public void setCrustType(CrustType crustType) {
		this.crustType = crustType;
	}
	public ArrayList<Toppings> getToppings() {
		return toppings;
	}
	public void setToppings(ArrayList<Toppings> toppings) {
		this.toppings = toppings;
	}
	@Override
	public String toString() {
		return "Pizza [size=" + size + ", crustType=" + crustType + ", toppings=" + toppings + "]";
	}
	
	
}
