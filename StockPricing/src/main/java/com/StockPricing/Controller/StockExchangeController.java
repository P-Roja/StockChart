package com.StockPricing.Controller;

import java.sql.SQLException;
import java.util.ArrayList;

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
import org.springframework.web.servlet.ModelAndView;

import com.StockPricing.model.Company;
import com.StockPricing.model.StockExchange;
import com.StockPricing.service.CompanyService;
import com.StockPricing.service.StockExchangeService;
import com.StockPricing.service.UserService;
@Controller
public class StockExchangeController {
	
	@Autowired
	private StockExchangeService stockExchangeService;
	@RequestMapping("/insertStockExchange")
	public ModelAndView insertStock(ModelMap map) {
		ModelAndView mav = null;
		map.addAttribute("stockExchange", new StockExchange());
		mav = new ModelAndView("StockRegistration");
		return mav;

	} 
	
	
	@RequestMapping(value = "/insertStockExchange", method = RequestMethod.POST)
	public ModelAndView insertStockExchange( @ModelAttribute("stockExhcange") @Valid StockExchange stockExchange, BindingResult result,
			HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {
		ModelAndView mav = null;
		if (result.hasErrors()) {
			mav = new ModelAndView("StockRegistration");
			return mav;
		}
		stockExchangeService.insertStock(stockExchange);
		 ArrayList stockDetails =(ArrayList) stockExchangeService.getStockExchangeList();
		 map.addAttribute("stockExchangeList",stockDetails);
		mav = new ModelAndView("DisplayStockExchange");
		return mav;

	}
	
	
	@RequestMapping(path="/stockExchangeList")
	public ModelAndView getStockExchangeList(ModelMap map) throws Exception {
		ModelAndView mav=new ModelAndView();
		ArrayList stockDetails =(ArrayList) stockExchangeService.getStockExchangeList();
		 map.addAttribute("stockExchangeList",stockDetails);
		mav = new ModelAndView("DisplayStockExchange");
		return mav;
	}
}
