package com.callor.var;

public class varriable_10 {

	public static void main(String[] args) {
		
		int intNum = 1; //시작하는 값
		
		// 명령이 실행될때마다 1씩 증가하는 값으로 설정
		intNum ++ ; //시작하는 값 +1
		intNum ++ ; // 시작하는 값 +1 +2
		
		intNum = 100;
		intNum ++; //101
		intNum	++; //103
		
		intNum = 0;
		int intSum = 0;
		
		// intSum = intSum + intNum1
		// 		  = 0 	   +   0
		intSum += intNum ; // intSum == ?? == 0
		
		// intNum1을 증가하고 == 1이된다
		// intNum1에 저장된 1을 intSum에 저장하라
		// intSum = 0 + 1
		intSum += (++intNum) ; //intSum == 1
		
		// intNum1을 1증가 == 2
		// intNum1에 저장된 2를 intSum에 저장하라
		// intSum = intSum + intNum1;
		// intSum =    1   +   2
		intSum += ++intNum; // intSum == 3
		
		// intNum1을 1증가 intNum1 ==3
		// intNum1에 저장된 3을 intSum에 저장
		// intSum = intSum + intNum1;
		// intSum =   1    +    3
		intSum += ++intNum; // intSum == 4
		
		intNum = 0;
		intSum = 0;
		
		// 1씩 증가(변화)되는 intNum변수의 값을 intSum 변수에 누적한다(쌓는다)
		intSum += ++intNum; // 0 + 1을 intSum 저장
		intSum += ++intNum; // 1 + 2을 intSum 저장
		intSum += ++intNum; // 3 + 3을 intSum 저장
		intSum += ++intNum; // 6 + 4을 intSum 저장
		
		intNum = 1;
		intSum = 0;
		
		// 처음에 만들어진 intNum값(1)을 intSum 변수에 누적하고 다음줄 코드를 위하여 
		// intNum를 1 증가시켜라
		intSum += intNum++; // 0 + 1, intNum == 2
		intSum += intNum++; // 1 + 2,
		
		
		
		
	}
	
}
