package edu.mum.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.domain.Product;
import edu.mum.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = { "product_input.action" })
	public ModelAndView displayForm(HttpServletRequest request) throws Exception {
		Cookie[] cookies = request.getCookies();
		for(Cookie coo : cookies){
			System.out.println(coo.getName() +" : " + coo.getValue());
		}
		ModelAndView mav = new ModelAndView("ProductForm");
		return mav;
	}

	@RequestMapping(value = { "product_save.action" }, method = RequestMethod.POST)
	public String handleForm(Product product, RedirectAttributes redirectAttributes) throws Exception {
		productService.save(product);
		redirectAttributes.addFlashAttribute(product);
		return "redirect:details";
	}

	@RequestMapping(value = { "details" }, method = RequestMethod.GET)
	public String handlePRG(SessionStatus status) throws Exception {
		status.setComplete();
		return "ProductDetails";
	}

}
