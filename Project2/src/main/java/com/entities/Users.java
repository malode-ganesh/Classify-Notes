package com.entities;

public class Users {
	private String name;
	private String email;
	private String course;	
	private String pwd;
	private String userType;
	
//	For registration
	public Users(String name, String email, String course, String pwd, String userType) {		
		this.name = name;
		this.email = email;
		this.course = course;
		this.pwd = pwd;
		this.userType = userType;
	}
	
//	Constructor for verify student login-->stuDashboard and Admin-->adminDashboard
	public Users(String email, String pwd) {
		this.email = email;
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUserType() {
		return userType;
	}
	

	
	
}
