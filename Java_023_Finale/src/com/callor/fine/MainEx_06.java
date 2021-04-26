package com.callor.fine;

import java.util.List;

import com.callor.fine.model.ScoreVO;

public class MainEx_06 {

	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = null;
		
		for(int i = 0 ; i < 10 ; i++) {
			
			ScoreVO scoreVO = null;
			scoreVO.setNum("0001");
			scoreVO.setKor(90);
			scoreList.add(scoreVO);
		}
		
		
		// 오류 발생 이유 생각 후 해결 방안 생각
		
	}
	
}
