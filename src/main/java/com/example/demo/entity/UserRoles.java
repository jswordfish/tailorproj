/*package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userRoles")
public class UserRoles {

	@Id
	@Column (name="roleId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roleId;
	
	@Column(name="role")
	private String role;
	
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public UserRoles(int roleId, String role) {
		super();
		this.roleId = roleId;
		this.role = role;
	}

	public UserRoles() {
		super();
	}
	
	@Override
	public String toString() {
		return "UserRoles []";
	}
	
	
}
*/