package com.project.k;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GetController {
	
	//메인 화면
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "index";
	}
	
	//채팅 로그인 화면
	@RequestMapping(value = "/chat_login", method = RequestMethod.GET)
	public String chat_login(Locale locale, Model model) {
		
		return "chat_login";
	}
	
}
