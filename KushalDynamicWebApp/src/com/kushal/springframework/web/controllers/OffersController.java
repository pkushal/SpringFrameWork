package com.kushal.springframework.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kushal.springframework.web.DAO.Offers;
import com.kushal.springframework.web.service.OffersService;

@Controller
public class OffersController {
	/*
	 * @RequestMapping("/") public String showHome(HttpSession session) {
	 * session.setAttribute("name", "Kushal Prasad Pradhan"); return "home"; //
	 * this home will be converted as // /WEB-INF/jsps/home.jps using the prefix
	 * and suffix properties by the // beans }
	 */
	// @RequestMapping("/")
	/*
	 * public ModelAndView showHome() { ModelAndView mv = new
	 * ModelAndView("home"); Map<String, Object> model = mv.getModel();
	 * model.put("name", "<b>Wala<b>"); return mv; }
	 */
	/*
	 * public String showHome(Model model) { model.addAttribute("name",
	 * "<b>this name is from Spring default model</b>"); return "home"; }
	 */
	/*
	 * public String showHome(Model model) { model.addAttribute("name",
	 * "<b>this name is from Spring default model</b>"); return "home"; }
	 */
	private OffersService offersService;

	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	@RequestMapping("/offers")
	public String showOffers(Model model) {
		List<Offers> offers = offersService.getCurrent();
		model.addAttribute("offers", offers);
		return "offers";
	}
	
	@RequestMapping("/createoffer")
	public String createOffer() {
		return "createoffer";
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test(Model model, @RequestParam("id") String identity) {
		System.out.println("Id # is :"+identity);
		return "offers";
		//Run this application and go to http://localhost:8080/KushalDynamicWebApp/test?id=78 or any number
	}
}
