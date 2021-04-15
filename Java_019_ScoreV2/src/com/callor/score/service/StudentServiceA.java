package com.callor.score.service;

import com.callor.score.model.StudentVOA;

public interface StudentServiceA {
	
	public void	insertStudent();
	public void loadStudent();
	
	//학번으로 학생정보를 검색하여(조회하여)
	// 학생정보가 담긴 VO를 return하는 method
	public StudentVOA getStudent(String num);
	public void printStudent();
}
