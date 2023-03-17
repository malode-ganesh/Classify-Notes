package com.entities;

import java.sql.Blob;

public class DbData {
	private String year;
	private int sem;
	private Blob pdf;
	private String sub;
	private String course;
	private String fileName;
	
	
	
	public DbData(String course,String year) {
		this.course = course;
		this.year = year;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public Blob getPdf() {
		return pdf;
	}
	public void setPdf(Blob pdf) {
		this.pdf = pdf;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	
	
}
