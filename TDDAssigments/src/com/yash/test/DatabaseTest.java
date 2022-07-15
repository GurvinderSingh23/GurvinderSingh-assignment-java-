package com.yash.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.yash.main.DatabaseClass;


public class DatabaseTest {
	DatabaseClass databaseClass;
	
	@Before
	public void setUp() throws Exception {
		databaseClass=new DatabaseClass();
	}
	
	@Test
	public void checkValidUser() throws ClassNotFoundException, SQLException
	{
		assertTrue(databaseClass.checkUser("guri@yash.com","123"));
	}
	@Test
	public void checkInValidUser() throws ClassNotFoundException, SQLException
	{
		assertFalse(databaseClass.checkUser("xyz@yash.com","123"));
	}

}
