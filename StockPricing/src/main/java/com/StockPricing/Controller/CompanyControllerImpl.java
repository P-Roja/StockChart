package com.StockPricing.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.StockPricing.model.Company;
import com.StockPricing.model.User;
import com.StockPricing.service.CompanyService;
import com.StockPricing.service.UserService;


@Controller
public class CompanyControllerImpl{

	
	@Autowired
	private CompanyService companyService;
	@Autowired
	private UserService userService;
	

	@RequestMapping("/")
	public ModelAndView registerCompany(ModelMap map) {
		ModelAndView mav = null;
		map.addAttribute("company", new Company());
		mav = new ModelAndView("CompanyRegistration");
		return mav;

	} 
	@RequestMapping("/registerCompany")
	public ModelAndView insertCompany(ModelMap map) throws SQLException {
		ModelAndView mav = null;
		map.addAttribute("company", new Company());
		 ArrayList sectorDetails =(ArrayList) companyService.getSectorList();
		 map.addAttribute("sectorList",sectorDetails);
		mav = new ModelAndView("CompanyRegistration");
		return mav;

	} 
	@RequestMapping("/registerUser")
	public ModelAndView insertUser(ModelMap map) throws SQLException {
		ModelAndView mav = null;
		map.addAttribute("user", new User());
		
		mav = new ModelAndView("UserRegistration");
		return mav;

	} 
	
	@RequestMapping("/loginAdmin")
	public ModelAndView loginAdmin(ModelMap map) {
		ModelAndView mav = null;
		map.addAttribute("user", new User());
		mav = new ModelAndView("Login");
		return mav;

	} 
	
	@RequestMapping(value = "/registerCompany", method = RequestMethod.POST)
	public ModelAndView registerCompany( @ModelAttribute("company") @Valid Company company, BindingResult result,
			HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {
		ModelAndView mav = null;
		if (result.hasErrors()) {
			mav = new ModelAndView("CompanyRegistration");
			return mav;
		}
		 companyService.insertCompany(company);
		 ArrayList companyDetails =(ArrayList) companyService.getCompanyList();
		 map.addAttribute("companyList",companyDetails);
		mav = new ModelAndView("ManageCompany");
		return mav;

	}
	@RequestMapping("/companyUpdate")
	public ModelAndView companyUpdation(@RequestParam("id") int companyId, ModelMap map, HttpServletRequest request,
			 @ModelAttribute("company") Company company,HttpSession session) throws ClassNotFoundException, SQLException {
		ModelAndView mav = null;
				company = companyService.fetchStockUpdate(companyId);
				ArrayList sectorDetails =(ArrayList) companyService.getSectorList();
				 map.addAttribute("sectorList",sectorDetails);
			map.addAttribute("update", company);
			mav = new ModelAndView("CompanyUpdate");
			return mav;
		
	}

	@RequestMapping(value = "/loginAdmin", method = RequestMethod.POST)
	public ModelAndView registerCompany( @ModelAttribute("user") @Valid User user, BindingResult result,
			HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {
		ModelAndView mav = null;
		if (result.hasErrors()) {
			mav = new ModelAndView("Login");
			return mav;
		}
		boolean login= userService.loginUser(user);
       if(login)
		mav = new ModelAndView("Success");
       else
    	   mav = new ModelAndView("Error");
		return mav;

	}
	
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public ModelAndView registerUSer( @ModelAttribute("user") @Valid User user, BindingResult result,
			HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {
		ModelAndView mav = null;
		if (result.hasErrors()) {
			mav = new ModelAndView("UserRegistration");
			return mav;
		}
		int status=userService.registerUser(user);
       if(status==1)
       {
		mav = new ModelAndView("Success");
		return mav;
       }else
    	   mav = new ModelAndView("UserRegistration");
		return mav;

	}
	
	@RequestMapping(path="/companyList")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("ManageCompany");
		mv.addObject("companyList",companyService.getCompanyList());
		return mv;
	}
	
	@RequestMapping("/importData")
	public ModelAndView adminRegistration(ModelMap map) {
		ModelAndView mav = null;
		mav = new ModelAndView("UserRegistration");
		return mav;
	}
	
	@RequestMapping(value = "/updateCompany", method = RequestMethod.POST)
	public ModelAndView updateCompany(HttpServletRequest request, ModelMap map, HttpSession session,
		 @ModelAttribute("company") Company company, BindingResult result) throws ClassNotFoundException, SQLException
			{
	
		ModelAndView mav = null;
			ArrayList companyDetails = null;
			int companyId = company.getCompanyCode();
			if (result.hasErrors()) {
				Company company1 = new Company();
				company1= companyService.fetchStockUpdate(companyId);
				map.addAttribute("update", company1);
				mav = new ModelAndView("CompanyUpdate");
				return mav;
			}
			  companyService.updateCompany(company);
			  System.out.println(company.getCompanyName());
			  companyDetails = (ArrayList) companyService.getCompanyList();
			map.addAttribute("companyList", companyDetails);
			mav = new ModelAndView("ManageCompany");
			return mav;
		
	}
}
