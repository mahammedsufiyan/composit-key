package com.ty.composit_kye;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class User {
	@EmbeddedId
	private UserID userId;
	private String name;
	private int age;
	private String gender;
	private String password;
	public UserID getUserId() {
		return userId;
	}
	public void setUserId(UserID userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
