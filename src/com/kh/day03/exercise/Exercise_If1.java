package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String []args) {
		
		// indent 정리 : ctrl + shift + f
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하시오:");
		int input = sc.nextInt();
		
		if(0<input) {
			System.out.println("양의 정수");
		}
		else if(input==0){
			System.out.println("0");
		}
		else if(input<0) {
			System.out.println("음의 정수");	
		}		
	*/
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하시오:");
		int num = sc.nextInt();
		String result = "";
		
		if(0<num) {
			result = "양의 정수 입니다.";
		}
		else if(num==0){
			result = "0 입니다.";
		}
		else if(num<0) {
			result = "음의 정수 입니다.";	
		}		
		System.out.println(num + "은/는 " + result);
		
	}

	
}
