package com.bms.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ǰ̨�û�������
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
