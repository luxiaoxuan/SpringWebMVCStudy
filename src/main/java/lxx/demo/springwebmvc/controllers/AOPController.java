package lxx.demo.springwebmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lxx.demo.springwebmvc.models.PangnyoService;

@RestController
public class AOPController {

	@Autowired
	private PangnyoService pangnyo;
	
	@RequestMapping("/aop")
	public String test() {
		
		pangnyo.fade();
		
		return "aop msg.";
	}
	
}
