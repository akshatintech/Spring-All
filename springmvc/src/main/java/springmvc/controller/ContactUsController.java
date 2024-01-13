package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactUsController {
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header"  , "Akshat in Tech");
		model.addAttribute("Desc" , "Deploying Project");
		
	}
	
	
	@RequestMapping("contactus")
	public String showform() {
		return "contactus";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST) // This handler will only work when the
																		// processform is called and Method is POST
	public String handleform(@ModelAttribute User user , Model model) {
		/* Model attribute fetched the data and created the object of the User class and then set the a */
		
		return "success";
	}

}
