//Write a Junit test where you will enter email and password, and if data is matched with database then test will true, else false.
package com.yash.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class User {
	private String email;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

public class DatabaseClass {
	Connection connection = null;

	public boolean checkUser(String email, String password) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2", "root", "root");

		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from user where email= '" + email + "' and password='" + password+"'");
		if (rs.next()) {
			return true;
		} else
			return false;
	}


}
