package com.StockPricing.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StockPricing.Dao.CompanyDao;
import com.StockPricing.Dao.StockExchangeDao;
import com.StockPricing.model.StockExchange;
@Service
public class StockExchangeServiceImpl implements StockExchangeService{
	@Autowired
	private StockExchangeDao stockExchangeDao;
	@Override
	public void insertStock(StockExchange stockExchange) throws SQLException {
	stockExchangeDao.save(stockExchange);
		
	}

	@Override
	public StockExchange updateStockExchange(StockExchange stockExchange) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StockExchange> getStockExchangeList() throws SQLException {
		return stockExchangeDao.findAll();
	}

}
