package com.bms.service.admin;

import com.bms.entity.admin.Admin;

/**
 * ��̨����Աҵ���߼��ӿ�
 * 
 * @author zhao
 *
 */
public interface IAdminService {
	
	//��¼
	public boolean login(String username,String password);
	
	//
	public void addAdmin(Admin admin);
}
