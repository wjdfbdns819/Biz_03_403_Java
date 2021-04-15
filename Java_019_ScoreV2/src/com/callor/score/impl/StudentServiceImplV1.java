package com.callor.score.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1  implements StudentService{
	
		protected List<StudentVO> studentList;
		protected Scanner scan;
		protected final int 학번 = 0;
		protected final int	이름 = 1;
		protected final int 학년 = 2;
		protected final int 반 = 3;
		protected final int 학과 = 4;
		protected final int 주소 = 5;
		
		
	public StudentServiceImplV1() {
			studentList = new ArrayList<StudentVO>();
			scan = new Scanner(System.in);
			this.loadStudent();
		}
		
	@Override
	public void insertStudent() {
		
	}

	@Override
	public void loadStudent() {
		
		String fileName = "src/com/callor/score/student.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while (true) {
				String reader = buffer.readLine();
				if(reader == null) break;
				
				String [] students = reader.split(":");
				
				StudentVO sVO = new StudentVO();
				sVO.setNum(students[학번]);
				sVO.setName(students[이름]);
				sVO.setGrade1(students[학년]);
				sVO.setGrade2(students[반]);
				sVO.setDept(students[학과]);
				sVO.setAddress(students[주소]);
				
				studentList.add(sVO);
				System.out.println(sVO.toString());	
			}
			
			buffer.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 열수가 없음");
			
		} catch (IOException e) {
			System.out.println("파일 읽는데 오류가 생김");
		}
	}

	@Override
	public StudentVO getStudent(String num) {
		
		
		
		while (true) {
			System.out.println("찾고자 하는 학생의 학번 입력");
			System.out.print(">> ");
			num = scan.nextLine();
			
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(num);
			} catch (NumberFormatException e) {
				System.out.println("학번은 정수만 입력");
				continue;
			}
			
			
			
		}
		
		return null;
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		
	}

}
