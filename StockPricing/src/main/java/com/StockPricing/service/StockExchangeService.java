package com.StockPricing.service;

import java.sql.SQLException;
import java.util.List;

import com.StockPricing.model.Company;
import com.StockPricing.model.StockExchange;

public interface StockExchangeService {
	 public void insertStock(StockExchange stockExchange) throws SQLException;
	    public StockExchange updateStockExchange(StockExchange stockExchange);
		public List<StockExchange> getStockExchangeList() throws SQLException;

}
