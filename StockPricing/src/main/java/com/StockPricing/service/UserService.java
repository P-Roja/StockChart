package com.StockPricing.service;

import java.sql.SQLException;

import com.StockPricing.model.User;

public interface UserService {
	public int registerUser(User user) throws SQLException;

	public boolean loginUser(User user) throws SQLException;
}
