package com.bms.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 前台用户控制器
 * @author zhao
 *
 */
@Controller
@RequestMapping("")
public class UserController {
	
	@RequestMapping("")
	public String index(){
		return "login";
	}
}
