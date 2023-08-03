package com.example.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.example.form.AccountForm;
import com.example.form.FileUploadForm;
import com.example.util.CommonUtil;

@Controller
@RequestMapping("/form")
@SessionAttributes(types = AccountForm.class)
public class FormInputController {
	
	private static final Logger logger = LoggerFactory.getLogger(FormInputController.class);
	
	@Autowired
	CommonUtil util;
	
	@ModelAttribute("accountForm")
	public AccountForm setUpAccountForm() {
		return new AccountForm();
	}
	
	// 選択リストの表示する一覧
	HashMap<String,String> select_list = new HashMap<String,String>();
	
	@RequestMapping(method=RequestMethod.GET,path="/disp")
	public String initDisp(Model model) {
		select_list.put("ディープインパクト", "ディープインパクト");
		select_list.put("アーモンドアイ", "アーモンドアイ");
		model.addAttribute("defaulthorse", "アーモンドアイ");
		model.addAttribute("selectItems", select_list);
		//model.addAttribute(new AccountForm());
		
		//型の自動変換（SpringBoot機能）
		//util.convert();

		return "/form/input";
	}
	
	@RequestMapping(method=RequestMethod.POST,path="/regist")
	public String regist(@Validated AccountForm form,BindingResult result) {
		logger.info("horse={} hobby={}",form.getHorse(),form.getHobbys());
		logger.debug("実行");
		System.out.println("チェックボックス ： " + form.isWorker());
		if( form.getHobbys() != null ) {
			for(String hobby : form.getHobbys()) {
				System.out.println("複数チェックボックス ： ");
				System.out.println(hobby);
			}
		}
		System.out.println(form.getHorse());
		System.out.println(result.hasFieldErrors("email"));
		return "/form/output";
	}

	@RequestMapping(method=RequestMethod.GET,path="/output2")
	public String disp2(Model model) {
		model.addAttribute("fileUploadForm", new FileUploadForm());
		return "/form/output2";
	}

	@RequestMapping(method=RequestMethod.POST,path="/upload")
	public String uploadfile(FileUploadForm uform) {
		MultipartFile file = uform.getFile();
		System.out.println(file.getContentType() + " : " + file.getOriginalFilename());
		return "redirect:/form/output2";
	}
	

	@RequestMapping(method=RequestMethod.GET,path="/output3")
	public String disp3(AccountForm form) {
		
		System.out.println(form.getHorse());
		return "/form/output3";
	}
	
}
