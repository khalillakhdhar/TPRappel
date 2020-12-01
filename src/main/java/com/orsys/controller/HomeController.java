package com.orsys.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping(value="/vfact")
	public ModelAndView vfact(HttpServletResponse response) throws IOException{
		return new ModelAndView("factoriel");
	}
	@RequestMapping(value="/vmax")
	public ModelAndView vmax(HttpServletResponse response) throws IOException{
		return new ModelAndView("max");
	}
	@RequestMapping(value="/vpgcd")
	public ModelAndView vpgcd(HttpServletResponse response) throws IOException{
		return new ModelAndView("pgcd");
	}
}
