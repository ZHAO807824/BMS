package com.bms.service.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.dao.admin.IAdminDao;
import com.bms.entity.admin.Admin;

/**
 * 后台管理员业务逻辑接口实现类
 * 
 * @author zhao
 *
 */
@Service("adminService")
public class AdminServiceImpl implements IAdminService {

	private static final Logger logger=LoggerFactory.getLogger(AdminServiceImpl.class);
	
	@Autowired
	private IAdminDao adminDao;
	
	public boolean login(String username, String password) {
		Admin admin=adminDao.getAdmin(username, password);
		System.out.println(admin);
		if (admin!=null) {
			return true;
		}
		return false;
	}

	public void addAdmin(Admin admin) {
		adminDao.addAdmin(admin);
	}

}
