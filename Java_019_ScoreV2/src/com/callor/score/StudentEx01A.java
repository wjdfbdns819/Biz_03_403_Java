package com.callor.score;

import com.callor.score.impl.StudentServiceImplV1A;
import com.callor.score.service.StudentServiceA;

public class StudentEx01A {

	public static void main(String[] args) {
		
		// 기본값으로 설정된 파일을 사용하여 객체 생성 진행
		StudentServiceA stService 
			= new StudentServiceImplV1A();
		
		// .. /st.txt 파일을 사용하여 객체 생성 진행
		StudentServiceA stService2 
			= new StudentServiceImplV1A("src/com/callor/score/Students.txt");
	
		
		stService.printStudent();
	}
}
