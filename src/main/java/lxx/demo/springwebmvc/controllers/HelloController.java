package lxx.demo.springwebmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello(@RequestParam(name = "name", defaultValue = "Syoude") String name) {
		return String.format("Hello, %s!", name);
	}
}
