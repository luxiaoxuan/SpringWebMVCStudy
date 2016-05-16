package lxx.demo.springwebmvc.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lxx.demo.springwebmvc.models.FatBaby;

@RequestMapping("/baby")
@RestController
public class BabyController {

	@RequestMapping({ "", "/" })
	public FatBaby[] list() {
		System.out.println("ahaha.");
		return new FatBaby[] { new FatBaby(6, "Shode"), new FatBaby(11, "Pangnyo"), };
	}

	@RequestMapping("/{name}")
	public FatBaby detail(@PathVariable("name") String name) {
		FatBaby baby = new FatBaby();
		baby.setName(name);
		baby.setAge(11);
		return baby;
	}

}
