package com.callor.score;

import com.callor.score.impl.ScoreServiceImplV1A;
import com.callor.score.service.ScoreServiceA;

public class ScoreEx_01A {

	public static void main(String[] args) {
		
		ScoreServiceA sService = new ScoreServiceImplV1A();
		sService.insertScore();
		
		
	}
}
