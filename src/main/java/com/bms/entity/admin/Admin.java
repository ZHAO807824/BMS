package com.bms.entity.admin;

import com.bms.common.BaseEntity;

/**
 * 后台管理员:(超级管理员,站点管理员)
 * 
 * @author zhao
 *
 */
public class Admin extends BaseEntity {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + password + ", toString()=" + super.toString() + "]";
	}

}
