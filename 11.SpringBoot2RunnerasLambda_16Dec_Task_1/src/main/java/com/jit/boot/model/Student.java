package com.jit.boot.model;

import java.util.List;

public class Student {
	private Integer sid;
	private String sName;
	private Double sFee;
	private List<String> sbujects;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Double getsFee() {
		return sFee;
	}
	public void setsFee(Double sFee) {
		this.sFee = sFee;
	}
	public List<String> getSbujects() {
		return sbujects;
	}
	public void setSbujects(List<String> sbujects) {
		this.sbujects = sbujects;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", sFee=" + sFee + ", sbujects=" + sbujects + "]";
	}
	
	
	

}
