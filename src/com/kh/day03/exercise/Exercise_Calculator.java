package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String []args) {
		// �� ���� ������ �Է¹ް� �����ڸ� �Է¹޾Ƽ�
		// ����ϴ� ���� ���α׷��� �ۼ��ϼ���!!
		// ������ �Է����ּ��� :11
		// ������ �ѹ��� �Է����ּ��� :22
		// �����ڸ� �Է����ּ���(+,-,*,/,%) : &
		// ��� : 11 % 22 =11
		
		// 1.�����ϳ� �Է� ����
		// 2.�����ϳ��� �Է� ����
		// 3.������ �Է� ����
		// 4.������ �Ǻ� �� ���� ���� �� ��� ����
		// 5.��� ���
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ���:");
		int num = sc.nextInt();
		System.out.print("������ �ѹ��� �Է����ּ���:");
		int num1 = sc.nextInt();
		System.out.print("�����ڸ� �Է����ּ���(+,-,*,/,%):");
		char operator = sc.next().charAt(0);
			
		if(operator == '+') {
			System.out.print("��� :" + num + '+' + num1 + '=' + (num+num1));
			}
		else if(operator == '-') {
			System.out.print("��� :" + num + '-' + num1 + '=' + (num-num1));	
			}
		else if(operator == '*') {
			System.out.print("��� :" + num + '*' + num1 + '=' +(num*num1));
		    }
		else if(operator == '/') {
			System.out.print("��� :" + num + '/' + num1 + '=' +(num/num1));
		}
		else if(operator == '%') {
			System.out.print("��� :" + num + '%' + num1 + '=' +(num%num1));
		}			
			*/	
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ���:"); 
		int num = sc.nextInt();
		System.out.print("������ �ѹ��� �Է����ּ���:");
		int num1 = sc.nextInt();
		System.out.print("�����ڸ� �Է����ּ���(+,-,*,/,%):");
		char operator = sc.next().charAt(0);
			
		if(operator == '+') {
			result = num+num1;
			}
		else if(operator == '-') {
			result = num-num1;	
			}
		else if(operator == '*') {
			result = num*num1;
		    }
		else if(operator == '/') {
			result = num/num1;
		}
		else if(operator == '%') {
			result = num%num1;
		}			
		System.out.println("��� :" + num + "" + operator + "" + num1 + '=' + result);
		
		
	}
}
