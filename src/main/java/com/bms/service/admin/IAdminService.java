package com.bms.service.admin;

import com.bms.entity.admin.Admin;

/**
 * 后台管理员业务逻辑接口
 * 
 * @author zhao
 *
 */
public interface IAdminService {
	
	//登录
	public boolean login(String username,String password);
	
	//
	public void addAdmin(Admin admin);
}
