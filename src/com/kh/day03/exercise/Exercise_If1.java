package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String []args) {
		
		// indent ���� : ctrl + shift + f
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��Ͻÿ�:");
		int input = sc.nextInt();
		
		if(0<input) {
			System.out.println("���� ����");
		}
		else if(input==0){
			System.out.println("0");
		}
		else if(input<0) {
			System.out.println("���� ����");	
		}		
	*/
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��Ͻÿ�:");
		int num = sc.nextInt();
		String result = "";
		
		if(0<num) {
			result = "���� ���� �Դϴ�.";
		}
		else if(num==0){
			result = "0 �Դϴ�.";
		}
		else if(num<0) {
			result = "���� ���� �Դϴ�.";	
		}		
		System.out.println(num + "��/�� " + result);
		
	}

	
}
