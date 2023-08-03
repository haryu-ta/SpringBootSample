package com.example.controller;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.config.PropertyConfig;
import com.example.form.EchoForm;
import com.example.service.SpringService;

@Controller
@RequestMapping("/echo")
public class SpringController {
	
	@Autowired
	MessageSource messageSource;
	
	@Autowired
	PropertyConfig conf;
	
	@Autowired
	SpringService service;

	@InitBinder("startDate")
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		sdf.setLenient(false); // 厳密な日付チェック
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf,true));
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String viewInput(Model model ) {
		System.out.println(messageSource.getMessage("message.A01",null,Locale.JAPANESE));
		System.out.println(conf.getEndDate());
		System.out.println(conf.getEmail());
		// サービス呼び出し
		String returnstr =  service.exec(1);
		EchoForm form = new EchoForm();
		model.addAttribute(form);
		model.addAttribute("message", "Hi Itamura!!" + "[" + returnstr + "]");
		return "echo/input";	
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String registry(Model model,@Valid EchoForm form,BindingResult result) {	
		
		if( result.hasErrors() ) {
			model.addAttribute("message", "Hi Itamura!!");
			return "echo/input";
		}
		return "echo/output";
	}

	@RequestMapping(method=RequestMethod.POST,path="/extend")
	public String goback() {
		System.out.println("====== Go!! =======");
		return "redirect:/echo";
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/start/{shainId}/{startDate}")
	public String show(@PathVariable String shainId,@PathVariable Date startDate) {
		System.out.println(shainId);
		System.out.println(startDate);
		//index.htmlに遷移
		return "redirect:/";
	}

	@RequestMapping(method=RequestMethod.GET,params="confirm")
	public String show2() {
		System.out.println("confirm");
		//index.htmlに遷移
		return "redirect:/";
	}

	@RequestMapping(method=RequestMethod.GET,path="/back")
	public String show3() {
		//index.htmlに遷移
		return "redirect:/";
	}
}
