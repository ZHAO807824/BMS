package com.bms.dao.admin;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bms.entity.admin.Admin;

/**
 * 后台管理员DAO
 * 
 * @author zhao
 *
 */
@Repository("adminDao")
public interface IAdminDao {

	public Admin getAdmin(String username,String password);
	
	public void addAdmin(Admin admin);
	
	public List<Admin> queryAdmin();
}
