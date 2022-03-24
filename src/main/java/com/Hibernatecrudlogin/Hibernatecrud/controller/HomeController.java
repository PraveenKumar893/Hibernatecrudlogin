package com.Hibernatecrudlogin.Hibernatecrud.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Hibernatecrudlogin.Hibernatecrud.DaoImpl.Regdao;
import com.Hibernatecrudlogin.Hibernatecrud.Model.Modelreg;

@Controller
public class HomeController 
{
	@Autowired
	Regdao re;


	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/register")
	public ModelAndView test12(HttpServletResponse response) throws IOException{
		return new ModelAndView("Registration");
	}

	@PostMapping("/registercontroller" ) 
	
	
	public ModelAndView test123(HttpServletResponse response, HttpServletRequest request ) throws IOException
	{
		
		//System.out.println("djsbsbdvsvhsdhhdvsvhdshvsvhvhdsvhsdvhdsvhhvdhvds"+reg);
		String name = request.getParameter("namefield");
		String user = request.getParameter("Username");
		String pass = request.getParameter("Password");
		System.out.println("dsbdshgdsbdsjjbd"+pass);
		Modelreg reg = new Modelreg(name, user, pass);
	   re.saveCustomer(reg);	
		return new ModelAndView("sucess");
	}

	
}
