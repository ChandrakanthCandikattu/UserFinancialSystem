package com.financesystem.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chandrakanth.financesystem.entity.dto.UserCredentialsDTO;
import com.chandrakanth.financesystem.entity.dto.UserProfileDTO;
//import com.chandrakanth.financesystem.utils.DataSourceConfiguration;
import com.chandrakanth.financesystem.utils.DataSourceConfiguration;
import com.financesystem.api.SubmitAPI;

@Controller
public class LoginController {

	@Autowired
	public SubmitAPI submitAPI;

	private static final Logger LOGGER = Logger.getLogger(LoginController.class);

	/**
	 * This method's request mapping is the root entry to the application
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/")
	public String displayLogin(Model model) {
		model.addAttribute("login", new UserCredentialsDTO());
		return "Login";
	}

	@PostMapping("/req")
	public ModelAndView returnAnotherView(@ModelAttribute("login") UserCredentialsDTO uCTO, 
			@ModelAttribute("userProfile")UserProfileDTO userProfile, BindingResult bResult) {

		submitAPI.checkForLoginUsers(uCTO);

		LOGGER.info("Active status " + uCTO.getActiveStatus());
		LOGGER.info("User ID " + uCTO.getUserId());
		LOGGER.info(new DataSourceConfiguration());
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new ModelAndView("Login2", "uC", uCTO);
	}
}
