package com.StockPricing.Dao;

import java.sql.SQLException;

import com.StockPricing.model.User;

public interface UserDao {
	public int registerUser(User user) throws SQLException;

	public boolean loginUser(User user) throws SQLException;
}
