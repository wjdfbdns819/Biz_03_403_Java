package com.callor.score.model;

public class StudentVO {

	private String num; // 학번
	private String name; // 이름
	private String grade1; // 학년
	private String grade2; // 학년
	private String dept; // 학과
	private String address; // 주소
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGrade1() {
		return grade1;
	}
	public void setGrade1(String grade1) {
		this.grade1 = grade1;
	}
	public String getGrade2() {
		return grade2;
	}
	public void setGrade2(String grade2) {
		this.grade2 = grade2;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "[학번=" + num + ", 이름=" + name + ", 학년=" + grade1 + ", 반=" + grade2 + ", 학과="
				+ dept + ", 주소=" + address + "]";
	}
	
	
	
		
	
}
