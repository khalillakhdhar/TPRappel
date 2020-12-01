package com.orsys.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.orsys.model.Math;

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
	@RequestMapping(value="/max" , method=RequestMethod.POST)
	public String cmax(HttpServletRequest req,Model m)
	{
	//read the provided form data
		String v1=req.getParameter("v1");
		String v2=req.getParameter("v2");
		int valeur1=Integer.parseInt(v1);
		int valeur2=Integer.parseInt(v2);
		Math ma = new Math();
		ma.setA(valeur1);
		ma.setB(valeur2);
		String res=ma.max();
		//calcule de fact
		m.addAttribute("resultat", res);
		return "resultat";
	
	}
	@RequestMapping(value="/facto" , method=RequestMethod.POST)
	public String cfact(HttpServletRequest req,Model m)
	{
	//read the provided form data
		String f=req.getParameter("fact");
		int fa=Integer.parseInt(f);
		Math ma = new Math();
		ma.setA(fa);
		
		String res=ma.factoriel();
		//calcule de fact
		m.addAttribute("resultat", res);
		return "resultat";
	
	}
	@RequestMapping(value="/pgcd" , method=RequestMethod.POST)
	public String cpgcd(HttpServletRequest req,Model m)
	{
		String v1=req.getParameter("v1");
		String v2=req.getParameter("v2");
		int valeur1=Integer.parseInt(v1);
		int valeur2=Integer.parseInt(v2);
		Math ma = new Math();
		ma.setA(valeur1);
		ma.setB(valeur2);
		String res=ma.PGCD();
		m.addAttribute("resultat",res);
		return "resultat";
		
		
	}
	
	

}
