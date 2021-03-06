package lxx.demo.springwebmvc.controllers;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("/demo")
	public String demo(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", "Go Go");
		return "demo";
	}
}
