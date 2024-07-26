package jp.co.internous.ecsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/esite/addmin")
public class Admincontroller {
	@RequestMapping("/")
	public String index() {
		return "admintop";
	}
}
