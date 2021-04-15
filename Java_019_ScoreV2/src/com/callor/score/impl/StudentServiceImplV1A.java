package com.callor.score.impl;

import java.io.BufferedReader;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.StudentVOA;
import com.callor.score.service.StudentServiceA;

public class StudentServiceImplV1A implements StudentServiceA {

	protected List<StudentVOA> studentList;
	protected String studentFile;
	
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 반 = 3;
	protected final int 학과 = 4;
	protected final int 주소 = 5;
	

	/*
	 * new StudentServiceImplV1A() 생성자를 호출하여
	 * 	객체를 생성하려고 하면
	 * 	고정된 파일이름 ("src/com/callor/score/Students.txt") 을
	 * 	사용하여 파일을 읽을 수 있도록 할 예정이다
	 * 
	 * 생성자에서는 new StudentServiceImplV1A("파일명")의
	 * 	생성자 method를 다시 호출하는 구조가 된다
	 */
	public StudentServiceImplV1A() {
		
		// 여기에서 다음의 생성자 method를 또한번 호출
		// new StudentServiceImplV1A ("src/com/callor/score/Students.txt");
		this("src/com/callor/score/Students.txt");
	}
	
	
	public StudentServiceImplV1A(String fileName) {
		this.studentFile = fileName;
		
		studentList = new ArrayList<StudentVOA>();
		
		// 클래스를 객체로 생성할때 method를 호출하여
		//	데이터를 사용하도록 준비해 달라
	}

	@Override 
	public void insertStudent() {

	}

	/*
	 * student.txt 파일에서 학생정보를 읽어 studentList에 데이터 준비하기
	 */
	@Override
	public void loadStudent() {

		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(this.studentFile);
			buffer = new BufferedReader(fileReader);
			
			while (true) {
				String reader = buffer.readLine();
				// 파일로 부터 읽은 값이 null이다
				//	=> EOF(End of File)에 다다랐다
				if(reader == null) break;
				
				String [] sts = reader.split(":");
				StudentVOA studentVO = new StudentVOA();
				studentVO.setNum(sts[학번]);
				studentVO.setName(sts[이름]);
				studentVO.setGrade(sts[학년]);
				studentVO.setDept(sts[학과]);
				studentVO.setAddress(sts[주소]);
				studentList.add(studentVO);
				
				//Debugin code
				System.out.println(studentVO.toString());
			}
			buffer.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 열 수 없음");
		} catch (IOException e) {
			System.out.println("파일을 읽는데 오류가 생김");
		}
		
	}

	@Override
	public void printStudent() {
		
		
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t주소");

		/*
		 * 배열을 사용하여 for() 반복문을 구현할때는
		 * 	배열.length 속성을 직접 반복의 조건으로 설정한다
		 * 		i < 배열.length
		 * 
		 * List 객체는 특성상 수시로 데이터의 개수가 변경된다
		 * List에 담긴 개수를 알려주는 size() method는 
		 * 	호출될때마다 List에 담긴 데이터 개수를 
		 * 	다시 헤아리는 코드가 실행된다
		 * 
		 * for() 반복문 내에서 i < list.size() 코드를 사용하면
		 * for() 반복문이 반복되는 동안 계속해서 개수를 헤아리게 된다
		 * 	데이터의 개수가 몇개 안될때는 큰 문제가 없지만
		 * 	데이터 개수가 많아지면 그만큼 성능이 떨어지게 된다
		 * 
		 * list 전체를 for() 반복문을 사용하여 순회할때는
		 * 	먼저 size() 값을 int 형 변수에 담아놓고 시작하자
		 */
		int nSize = studentList.size();
		for(int i = 0 ; i < nSize ; i++) {
			StudentVOA vo = studentList.get(i);
			
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getDept() + "\t");
			System.out.print(vo.getGrade() + "\t");
			System.out.print(vo.getAddress() + "\t");
			
		}
		System.out.println("=".repeat(80));

	}


	@Override
	public StudentVOA getStudent(String num) {
		// TODO Auto-generated method stub
		return null;
	}


}
