package com.callor.score.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	List<ScoreVO> scoreList;
	Scanner scan;
	String [] subject;
	Integer [] subScore;
	
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		subject = new String [] {"국어", "영어", "수학"};
		subScore = new Integer [subject.length]; 
	}
	
	
	@Override
	public void insertScore() {
		while(true) {
			System.out.println("학번을 입력");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				System.out.println("학번은 정수만 입력");
				continue;
			}
			String strNums = String.format("%0000s", intNum);
			break;
		}
		
		for(int i = 0 ; i < subject.length ; i++ ) {
			String score = subject[i] + "점수";
			
			Integer intScore = Integer.valueOf(score);
			if(intScore == null) {
				return;
			}
			subScore[i] = intScore;
		}
		
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// 출력
		
		System.out.println("=".repeat(50));
		System.out.println("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		
		int nSize = scoreList.size();
		for(int i = 0 ; i < scoreList.size(); i++) {
			
		}
		
		
		
		
		System.out.println("=".repeat(50));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
