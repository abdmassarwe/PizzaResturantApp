package model;

import java.util.ArrayList;

public class Client extends Person{


	private int totalOrderNumber;
	private String perviousOrder;
	private double totalAmountSpent;
	private ArrayList<Order> ordersHistory;
	
	
	
	public Client(String id, String firstName, String lastName, String phoneNumber, String address,
			int totalOrderNumber, String perviousOrder, double totalAmountSpent, ArrayList<Order> ordersHistory) {
		super(id, firstName, lastName, phoneNumber, address);
		this.totalOrderNumber = totalOrderNumber;
		this.perviousOrder = perviousOrder;
		this.totalAmountSpent = totalAmountSpent;
		this.ordersHistory = ordersHistory;
	}

	public int getTotalOrderNumber() {
		return totalOrderNumber;
	}

	public void setTotalOrderNumber(int totalOrderNumber) {
		this.totalOrderNumber = totalOrderNumber;
	}

	public String getPerviousOrder() {
		return perviousOrder;
	}

	public void setPerviousOrder(String perviousOrder) {
		this.perviousOrder = perviousOrder;
	}

	public double getTotalAmountSpent() {
		return totalAmountSpent;
	}

	public void setTotalAmountSpent(double totalAmountSpent) {
		this.totalAmountSpent = totalAmountSpent;
	}

	public ArrayList<Order> getOrdersHistory() {
		return ordersHistory;
	}

	public void setOrdersHistory(ArrayList<Order> ordersHistory) {
		this.ordersHistory = ordersHistory;
	}

	@Override
	public String toString() {
		return "Client [totalOrderNumber=" + totalOrderNumber + ", perviousOrder=" + perviousOrder
				+ ", totalAmountSpent=" + totalAmountSpent + ", ordersHistory=" + ordersHistory + "]";
	}
	
	
	
	
	

	
	
}