package com.yash.itempurchasedbycustomer;

public class Item {
	
	private String itemName;
	private String itemDescription;
	private double itemPrice;
	private Category category;
	
	
	public Item() {
		
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemDescription=" + itemDescription + ", itemPrice=" + itemPrice
				+ ", category=" + category + "]";
	}
	
	
}
