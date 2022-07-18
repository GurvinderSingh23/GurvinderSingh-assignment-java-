// WAP in which three beans need to be created item, category and customer. Category injected in item and item injected in customer. Now print all item purchased by customer

package com.yash.itempurchasedbycustomer;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/yash/itempurchasedbycustomer/applicationContext.xml");
		Customer customer=(Customer)ctx.getBean("customer");
		List<Item> itemPurchasedByCustomer=customer.getPurchasedItem();
		System.out.println("Customer Name : "+customer.getCustomerName());
		for(Item item:itemPurchasedByCustomer) {
			System.out.println("***************************************");
			System.out.println("Item Name : "+item.getItemName()+" , Catogory : "+item.getCategory().getCategoryName());
			System.out.println("Item Description : "+item.getItemDescription());
			System.out.println("Item Price : "+item.getItemPrice());
	}
	}
}
