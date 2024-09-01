package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Viewexample.ViewlimitConfig;

@RestController
public class LimitController {
	
	@Autowired
	private ViewlimitConfig limitconfig;
	
	@GetMapping("/home")
	public ViewlimitConfig returnconfig() {
		
		return new ViewlimitConfig(limitconfig.getMax(),limitconfig.getMin());
	}

	

}
