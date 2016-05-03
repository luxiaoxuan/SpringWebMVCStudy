package lxx.demo.springwebmvc.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	// @RequestMapping("/hello")
	// public String hello(@RequestParam(name = "name", defaultValue = "Syoude")
	// String name) {
	// return String.format("Hello, %s!", name);
	// }

	@RequestMapping("/")
	public String home(Map<String, Object> model) {
		model.put("msg", "Hello, world!");

		return "home";
	}

	@RequestMapping("/rai")
	public ModelAndView handleRai() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("msg", "Hello, world!");
		return new ModelAndView("home", model);
	}

	@ResponseBody
	@RequestMapping("/hello")
	public String hello(@RequestParam(name = "name", defaultValue = "Syoude") String name) {
		return String.format("Hello, %s!", name);
	}
}
