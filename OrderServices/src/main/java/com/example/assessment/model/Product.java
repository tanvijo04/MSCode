package com.example.assessment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	@Id
	@Column
	int itemId ;
	@Column
	String itemName ;
	@Column
	int price;
	@Column
	String state;
	@Column
	String pin;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		if(itemName ==null || itemName.equals("")){
			throw new IllegalStateException("Item Name can not be Null");
		}
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price <=0){
		throw new IllegalStateException("Price can not be negative");
	}
		this.price = price;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		if(itemId ==0){
			throw new IllegalStateException("Itemid can not be 0");
		}
		this.itemId = itemId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		if(state.isEmpty() || state.equals("")){
			throw new IllegalStateException("State can not be Null");
		}
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		if(pin.length()<5 ){
			throw new IllegalStateException("Pin can not be null or less than 5 digit");
		}
		this.pin = pin;
	}

	
}
