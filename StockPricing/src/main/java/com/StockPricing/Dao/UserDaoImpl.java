package com.StockPricing.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.StockPricing.model.User;
@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public int registerUser(User user) throws SQLException {
int status = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock?useSSL=false", "root",
					"root");
			if (conn != null) {
				System.out.println("Connected to the database!");
			} else {
				System.out.println("Failed to make connection!");
			}
			PreparedStatement ps = conn.prepareStatement(
					"insert into user (username,password,user_type,email,mobile_number,confirmed) values (?,?,?,?,?,?)");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getUserType());
			ps.setString(4, user.getEmail());
			ps.setLong(5, user.getMobileNumber());
			ps.setString(6, user.getConfirmed());
			status = ps.executeUpdate();
			conn.close();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		return status;

	}

	@Override
	public boolean loginUser(User user) throws SQLException {
boolean flag=false;
ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock?useSSL=false", "root",
					"root");
			if (conn != null) {
				System.out.println("Connected to the database!");
			} else {
				System.out.println("Failed to make connection!");
			}

			Statement statement = null;
			statement = conn.createStatement();
			String query = "select * from user where username='" + user.getUsername() + "'and password ='"
					+ user.getPassword() + "'";
			rs = statement.executeQuery(query);
			
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		if (rs.next()) {
			return true;
		} else
			return false;
	}
	
		
	

}
