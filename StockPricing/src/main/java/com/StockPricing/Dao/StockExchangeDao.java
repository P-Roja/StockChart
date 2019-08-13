package com.StockPricing.Dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StockPricing.model.Company;
import com.StockPricing.model.StockExchange;

public interface StockExchangeDao extends JpaRepository<StockExchange, Integer>{
	/* public void insertStock(StockExchange stockExchange) throws SQLException;
	    public StockExchange updateStockExchange(StockExchange stockExchange);
		public List<StockExchange> getStockExchangeList() throws SQLException;*/
}
