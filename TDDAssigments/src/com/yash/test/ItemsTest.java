package com.yash.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.yash.main.Items;

class ItemsTest {

	@Test
	public void whenItemIdIsLessThanThree() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			Items item = new Items();
			item.setItemid(13);
		});
		assertEquals("itemid should have 3 digits at least", exception.getMessage());
	}

	@Test
	public void whenItemNameDoesNotContainAlphabates() {

		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			Items item = new Items();
			item.setItemname("mobile123");
		});
		assertEquals("item name must contain only alphabates", exception.getMessage());
	}

	@Test
	public void whenItemCostPriceIsNegative() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			Items item = new Items();
			item.setCost_price(-23000);
		});
		assertEquals("cost price can't be negative", exception.getMessage());
	}

	@Test
	public void WhenItemSellingPriceIsNegative() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			Items item = new Items();
			item.setSell_price(-2456);
		});
		assertEquals("selling price can't be negative", exception.getMessage());
	}

	@Test
	public void WhenCostPriceAndSellingPriceAreSame() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			Items item = new Items();
			item.setCost_price(23000);
			item.setSell_price(23000);

		});
		assertEquals("cost price and selling price can't be same", exception.getMessage());
	}

	@Test
	public void whenItemExpiringDateIsToday() {
		LocalDate todaydate = LocalDate.now();
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			Items item = new Items();
			item.setExpiringDate(todaydate.toString());
		});
		assertEquals("expiringDate can't be today", exception.getMessage());
	}

	

}
