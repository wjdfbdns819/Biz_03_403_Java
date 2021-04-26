package com.callor.fine.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.callor.fine.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1{

	public ScoreServiceImplV2() {
	
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		
	}
	
	// 상속을 받아서 사용할려고 오류가 뜸 private 고쳐야함
}
