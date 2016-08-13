package com.bms.service.admin;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bms.entity.admin.Admin;
import com.bms.utils.MD5;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-web.xml","classpath:spring/spring-bean.xml"})
public class IAdminServiceTest {

	@Resource(name="adminService")
	IAdminService adminService;
	
	@Test
	public void testLogin() {
		adminService.login("admin", "admin");
	}
	
	@Test
	public void testAddAdmin(){
		Admin admin=new Admin();
		admin.setUsername("admin");
		admin.setPassword(MD5.getMD5("admin"));
		
		adminService.addAdmin(admin);
	}

}
