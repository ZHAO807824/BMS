package com.bms.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ��̨����Ա������
 * 
 * @author zhao
 *
 */
@Controller
@RequestMapping("/admin")
public class AdminController{
	
	@RequestMapping("")
	public String index(){
		return "admin/login";
	}
}
