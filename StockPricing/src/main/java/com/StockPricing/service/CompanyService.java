package com.StockPricing.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.StockPricing.model.Company;
import com.StockPricing.model.Sector;


public interface CompanyService {

	
	  public void insertCompany(Company company) throws SQLException;
	    public void updateCompany(Company company)throws SQLException;
		public List<Company> getCompanyList() throws SQLException;
		public List<Sector> getSectorList() throws SQLException;
		public Company fetchStockUpdate(int companyId) throws SQLException, ClassNotFoundException ;
}