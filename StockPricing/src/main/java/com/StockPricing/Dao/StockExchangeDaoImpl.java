package com.StockPricing.Dao;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.StockPricing.model.Company;
import com.StockPricing.model.StockExchange;
@Repository
public class StockExchangeDaoImpl implements StockExchangeDao {

	@Override
	public void insertStock(StockExchange stockExchange) throws SQLException {
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
					"insert into stock_exchange (stockexchange_id,stockexchange_name,brief,contact_address,remarks) value(?,?,?,?,?)");
			ps.setInt(1,stockExchange.getStockExchangeId());
			ps.setString(2, stockExchange.getStockExchangeName());
			ps.setString(3, stockExchange.getBrief());
			ps.setString(4, stockExchange.getContactAddress());
			ps.setString(5, stockExchange.getRemarks());
			int i = ps.executeUpdate();
			if (i == 1)
				System.out.println("Inserted Successfully");
			conn.close();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
	}

	@Override
	public StockExchange updateStockExchange(StockExchange stockExchange) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StockExchange> getStockExchangeList() throws SQLException {
		List<StockExchange> stockExchangeList = new ArrayList<StockExchange>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock?useSSL=false", "root",
					"root");
			if (conn != null) {
				System.out.println("Connected to the database!");
			} else {
				System.out.println("Failed to make connection!");
			}

			PreparedStatement ps = conn.prepareStatement("select * from stock_exchange");
			ResultSet rs = ps.executeQuery();
			StockExchange stockExchange = null;
			while (rs.next()) {
				stockExchange = new StockExchange();
				stockExchange.setStockExchangeId(rs.getInt("stockexchange_id"));
				stockExchange.setStockExchangeName(rs.getString("stockexchange_name"));
				stockExchange.setBrief(rs.getString("brief"));
				stockExchange.setContactAddress(rs.getString("contact_address"));
				stockExchange.setRemarks(rs.getString("remarks"));
				stockExchangeList.add(stockExchange);
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e);
			throw e;
		}
		return stockExchangeList;
	}

}
*/