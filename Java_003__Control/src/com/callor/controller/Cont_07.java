package com.callor.controller;

public class Cont_07 {

	public static void main(String[] args) {
		
		int intNum = 7;
		int index = 0;
		// for (int i = 2 ; i < 7 ; i++) { }
		// 7/2, 7/3, 7/4, 7/5, 7/6
		for(int i = 2 ; i < intNum ; i++) {System.out.printf("%d = %d\n", i, intNum % i);}
		
		// 2 ~ (intNum에 담긴 정수 -1) 반복
		// intNum에 담긴 값을 2 ~ (intNum -1)가지 값으로 나누었을때 나머지가 0인 경우가 있냐
		// System.out.println(intNum % intdex == 0);
		for (int i =2 ; i < intNum ; index++) {System.out.println(intNum % index == 0);}
		
		
		
		
		
	}
}