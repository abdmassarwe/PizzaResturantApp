package model;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Order {
	
	private int OrderID;
	private String OrderAddress;
	private String OrderClientName;
	private String OrderClientNumber;
	private LocalDateTime orderDateAndTime;
	private Double TotalOrderPrice;
	private ArrayList<Object> items;
	private OrderStatus status;
	private String Notes;
	private boolean TakeAway;
	
	public Order(int orderID, String orderAddress, String orderClientName, String orderClientNumber,
			LocalDateTime orderDateAndTime, Double totalOrderPrice, ArrayList<Object> items, String notes,
			boolean takeAway) {
		super();
		OrderID = orderID;
		OrderAddress = orderAddress;
		OrderClientName = orderClientName;
		OrderClientNumber = orderClientNumber;
		this.orderDateAndTime = orderDateAndTime;
		TotalOrderPrice = totalOrderPrice;
		this.items = items;
		Notes = notes;
		status =OrderStatus.Added;
		TakeAway = takeAway;
	}
	
	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	public String getOrderAddress() {
		return OrderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		OrderAddress = orderAddress;
	}
	public String getOrderClientName() {
		return OrderClientName;
	}
	public void setOrderClientName(String orderClientName) {
		OrderClientName = orderClientName;
	}
	public String getOrderClientNumber() {
		return OrderClientNumber;
	}
	public void setOrderClientNumber(String orderClientNumber) {
		OrderClientNumber = orderClientNumber;
	}
	public LocalDateTime getOrderDateAndTime() {
		return orderDateAndTime;
	}
	public void setOrderDateAndTime(LocalDateTime orderDateAndTime) {
		this.orderDateAndTime = orderDateAndTime;
	}
	public Double getTotalOrderPrice() {
		return TotalOrderPrice;
	}
	public void setTotalOrderPrice(Double totalOrderPrice) {
		TotalOrderPrice = totalOrderPrice;
	}
	public ArrayList<Object> getItems() {
		return items;
	}
	public void setItems(ArrayList<Object> items) {
		this.items = items;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	public boolean isTakeAway() {
		return TakeAway;
	}
	public void setTakeAway(boolean takeAway) {
		TakeAway = takeAway;
	}
	
}
