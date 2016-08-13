package com.bms.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台管理员控制器
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
