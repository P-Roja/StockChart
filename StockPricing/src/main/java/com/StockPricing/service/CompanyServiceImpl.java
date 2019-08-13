package com.StockPricing.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StockPricing.Dao.CompanyDao;
import com.StockPricing.Dao.SectorDao;
import com.StockPricing.model.Company;
import com.StockPricing.model.Sector;


@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;
	
	@Autowired
	private SectorDao sectorDao;
	
	@Override
	public void insertCompany(Company company) throws SQLException {
       companyDao.save(company);
       
		//companyDao.insertCompany(company);
	}

	@Override
	public void updateCompany(Company company) throws SQLException {
		//companyDao.updateCompany(company);
		System.out.println(company.getCompanyName());
		companyDao.save(company);
	}

	@Override
	public List<Company> getCompanyList() throws SQLException {
		return companyDao.findAll();
	}

	 @Override
	    public Company fetchStockUpdate(int companyId)
	    {
	        return companyDao.getOne(companyId);
	    }

	@Override
	public List<Sector> getSectorList() throws SQLException {
		return sectorDao.findAll();
	}


}