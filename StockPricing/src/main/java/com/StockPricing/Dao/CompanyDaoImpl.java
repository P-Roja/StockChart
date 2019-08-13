package com.StockPricing.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.StockPricing.model.Company;
/*

@Repository
public class CompanyDaoImpl implements CompanyDao{

	public void insertCompany(Company company) throws SQLException  {


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock?useSSL=false", "root",
					"root");
			if (conn != null) {
				System.out.println("Connected to the database!");
			} else {
				System.out.println("Failed to make connection!");
			}
			company.setSectorId(1);
			company.setStockCode(1);
			PreparedStatement ps = conn.prepareStatement(
					"insert into company (company_code,company_name,turnover,ceo,board_of_director,sector_id,brief_writeup) value(?,?,?,?,?,?,?)");
			ps.setInt(1, company.getCompanyCode());
			ps.setString(2, company.getCompanyName());
			ps.setDouble(3, company.getTurnover());
			ps.setString(4, company.getCeo());
			ps.setString(5, company.getBoardOfDirectors());
			ps.setInt(6, company.getSectorId());
			ps.setString(7, company.getWriteUp());
			int i = ps.executeUpdate();
			if (i == 1)
				System.out.println("Inserted Successfully");
			conn.close();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

	
	public List<Company> getCompanyList() throws SQLException {
		List<Company> companyList = new ArrayList<Company>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock?useSSL=false", "root",
					"root");
			if (conn != null) {
				System.out.println("Connected to the database!");
			} else {
				System.out.println("Failed to make connection!");
			}

			PreparedStatement ps = conn.prepareStatement("select * from company");
			ResultSet rs = ps.executeQuery();
			Company company = null;
			while (rs.next()) {
				company = new Company();
				int companyId = rs.getInt("company_code");
				company.setCompanyCode(companyId);
				company.setBoardOfDirectors(rs.getString("board_of_director"));
				company.setCompanyName(rs.getString("company_name"));
				company.setTurnover(rs.getDouble("turnover"));
				company.setCeo(rs.getString("ceo"));
				company.setSectorId(rs.getInt("sector_id"));
				company.setWriteUp(rs.getString("brief_writeup"));
				company.setStockCode(rs.getInt("stock_code"));

				companyList.add(company);
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e);
			throw e;
		}
		return companyList;
	}


	@Override
	public void  updateCompany(Company company) throws SQLException {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock?useSSL=false", "root",
					"root");
			if (conn != null) {
				System.out.println("Connected to the database!");
			} else {
				System.out.println("Failed to make connection!");
			}

			 String sql = "update company set company_name='" + company.getCompanyName() + "' , turnover='" + company.getTurnover() + "', ceo='" + company.getCeo() + "' , board_of_director='" + company.getBoardOfDirectors() + "',brief_writeup='" + company.getWriteUp() + "' where company_code='" + company.getCompanyCode() + "'";
			 Statement stmt = conn.createStatement();

			     int i = stmt.executeUpdate(sql);
			if (i == 1)
				System.out.println("Updated Successfully");
			conn.close();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}


	@Override
	public Company fetchStockUpdate(int companyId) throws SQLException, ClassNotFoundException {
		Company company = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock?useSSL=false", "root",
					"root");
			if (conn != null) {
				System.out.println("Connected to the database!");
			} else {
				System.out.println("Failed to make connection!");
			}

			PreparedStatement ps = conn.prepareStatement("select * from company where company_code='" + companyId + "'");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				company = new Company();
				company.setCompanyCode(rs.getInt("company_code"));
				company.setCompanyName(rs.getString("company_name"));
				company.setTurnover(rs.getDouble("turnover"));
				company.setCeo(rs.getString("ceo"));
				company.setBoardOfDirectors(rs.getString("board_of_director"));
				company.setWriteUp(rs.getString("brief_writeup"));
			}
		}
				catch (SQLException e) {
					System.out.println(e);
					throw e;
				}
		
		return company;
	}
	
	

}

*/