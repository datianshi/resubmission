package com.sample.myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sample.myapp.form.CarForm;
import com.sample.myapp.form.HotelForm;
import com.sample.myapp.service.CarService;

@Controller
@RequestMapping("/resubmission-prg")
public class ResubmissionPRGController {
	
	@Autowired
	CarService carService;
	
	private final static Logger logger = LoggerFactory.getLogger(ResubmissionPRGController.class);
	
	@RequestMapping(value = "/car", method = RequestMethod.GET)
	public String getCar(Model model){
		model.addAttribute("carForm", new CarForm());
		return "prg/car";
	}
	
	@RequestMapping(value = "/confirmCar", method = RequestMethod.GET)
	public String confirmCar(@ModelAttribute("car")CarForm car, Model model){
		model.addAttribute("confirm", "Car is submitted:" + car);
		return "confirmCar";
	}
	
	@RequestMapping(value = "/confirmHotel", method = RequestMethod.GET)
	public String confirmHotel(@ModelAttribute("hotel")HotelForm hotel, Model model){
		model.addAttribute("confirm", "hotel is submitted:" + hotel);
		return "confirmHotel";
	}	
	
	@RequestMapping(value = "/car", method = RequestMethod.POST)
	public String submitCar(CarForm car, RedirectAttributes redirectAttributes){
		carService.add(car);
		redirectAttributes.addFlashAttribute("car", car);
		logger.info("Submit the Car:" + car);
		return "redirect:confirmCar";
	}

	@RequestMapping(value = "/hotel", method = RequestMethod.GET)
	public String getHotel(Model model){		
		model.addAttribute("hotelForm", new HotelForm());
		return "prg/hotel";
	}	
	@RequestMapping(value= "/hotel", method = RequestMethod.POST)
	public String submitHotel(HotelForm hotel, RedirectAttributes redirectAttributes){
		logger.info("Submit the Hotel:" + hotel);
		redirectAttributes.addFlashAttribute("hotel", hotel);
		return "redirect:confirmHotel";
	}
}
