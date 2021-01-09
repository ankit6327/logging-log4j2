package com.clouddeploy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @author ankit
 *
 */
@Controller
public class HelloController {

	private static final Logger logger = LogManager.getLogger(HelloController.class);

	private List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);

	/**
	 * @param model
	 * @return
	 */
	@GetMapping("/")
	public String main(Model model) {
		if (logger.isDebugEnabled()) {
			logger.debug("Hello from Log4j 2 - num : {}", num);
		}
		logger.debug("Hello from Log4j 2 - num : {}", () -> num);
		model.addAttribute("tasks", num);
		return "welcome";
	}
}
