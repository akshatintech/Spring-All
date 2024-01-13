package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
			
	@RequestMapping("/home")		//Home method will run only when home is fired
	public String home(Model model ){
		System.out.println(" This is home url ");
		model.addAttribute("name","Akshat");
		
		
		List<Integer> friends = new ArrayList<Integer>();
		friends.add(23);
		friends.add(2);
		model.addAttribute("f",friends);
		return "index";
		
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller");
		return "about";	
	}
	
	
	@RequestMapping("/help")
	public ModelAndView help(Model model ) {
		System.out.println("This is help controller");
		ModelAndView modelandview = new ModelAndView();		//Creating Model and View Object
		modelandview.addObject("name" , "Akshat Hole");		//Setting the date
		modelandview.addObject("rollno", 123212);
		
		modelandview.setViewName("help");		//Setting the VIew Name
		
		
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(12);
//		list.add(23);
//		list.add(45);
//		list.add(43);
//		modelandview.addObject("marks", list);
		return modelandview;
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact(Model model , String name) {
		System.out.println("This is contact controller");
		ModelAndView modelandview = new ModelAndView();	
		modelandview.addObject("name" , "Akshat Hole");		//Setting the date
		
		modelandview.setViewName("contact");
		return modelandview;
	}

}
