package com.StockPricing.Dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StockPricing.model.Company;



public interface CompanyDao extends JpaRepository<Company, Integer>{
	
}
