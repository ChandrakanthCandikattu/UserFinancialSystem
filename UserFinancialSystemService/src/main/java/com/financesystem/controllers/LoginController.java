package com.financesystem.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chandrakanth.financesystem.entity.dto.UserCredentialsTO;

@Controller
public class LoginController {

	private static final Logger LOGGER = Logger.getLogger(LoginController.class);

	/**
	 * This method's request mapping is the root entry to the application
	 * @param model
	 * @return
	 */
	@GetMapping("/")
	public String displayLogin(Model model) {
		model.addAttribute("login", new UserCredentialsTO());
		return "Login";
	}

	
	@PostMapping("/req")
	public ModelAndView returnAnotherView(@ModelAttribute("login") UserCredentialsTO uCTO, 
			BindingResult bResult) {
		LOGGER.info("Active status " + uCTO.getActiveStatus());
		LOGGER.info("User ID " + uCTO.getUserId());
		return new ModelAndView("Login2", "uC", uCTO);
	}
}
