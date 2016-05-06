package lxx.demo.springwebmvc.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@RequestMapping("/hello")
	@ResponseBody
	public String hello(@RequestParam(value = "name", defaultValue = "Shoude") String name) {
		return String.format("Hello, %s! This is a message from the server: %s.", name, this.message);
	}
}
