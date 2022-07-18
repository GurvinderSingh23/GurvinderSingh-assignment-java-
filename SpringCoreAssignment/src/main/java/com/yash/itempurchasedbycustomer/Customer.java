package com.yash.itempurchasedbycustomer;

import java.util.List;

public class Customer {
	
	private String customerName;
	private List<Item> purchasedItem;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<Item> getPurchasedItem() {
		return purchasedItem;
	}
	public void setPurchasedItem(List<Item> purchasedItem) {
		this.purchasedItem = purchasedItem;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", purchasedItem=" + purchasedItem + "]";
	}
	
	
}
