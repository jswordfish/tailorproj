package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registeredUser")
public class RegisteredUser {

	

	@Id
	@Column(name="id", length=10)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String gender;
	@Column
	private String email;
	@Column
	private String userName;
	@Column
	private String password;
	@Column
	private String userTypeCustomerTailor;
	
	/*@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name="user_roles", joinColumns=@JoinColumn(name="id"), inverseJoinColumns=@JoinColumn(name="roleId"))
	private Set<UserRoles> roles;
	
	public Set<UserRoles> getRoles() {
		return roles;
	}
	public void setRoles(Set<UserRoles> roles) {
		this.roles = roles;
	}*/
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserTypeCustomerTailor() {
		return userTypeCustomerTailor;
	}
	public void setUserTypeCustomerTailor(String userTypeCustomerTailor) {
		this.userTypeCustomerTailor = userTypeCustomerTailor;
	}
	
	
	
	public RegisteredUser(int id, String firstName, String lastName, String gender, String email, String userName,
			String password, String userTypeCustomerTailor) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.userTypeCustomerTailor = userTypeCustomerTailor;
		//this.roles = roles;
	}
	public RegisteredUser() {
		super();
	}
	
	
	
	
	
	
}
