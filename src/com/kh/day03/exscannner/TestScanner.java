package com.kh.day03.exscannner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է����ּ��� :");
		String name = sc.next();
		
		System.out.println("�¾ ���� �Է����ּ���:");
		String month = sc.next();
		
		System.out.println("Ű�� �Է����ּ���:");
		double height = sc.nextDouble();
		
		System.out.print("������ �Է����ּ���:");
		char gender = sc.next().charAt(0);
		
		System.out.print("�ּҸ� �Է����ּ���:");
		sc.nextLine();
		String address = sc.nextLine();
		
		
		System.out.println("�̸��� " + name + "�Դϴ�.");
		System.out.println("�¾ ����" + month + "�Դϴ�.");
		System.out.println("Ű��" + "�Դϴ�");
		System.out.println("������" + gender + "�Դϴ�.");
		System.out.println("�ּҴ�" + address + "�Դϴ�");
		
		int num =10;
		double num1 =10.3;
		double result =  (num + num1);
	
		
		
		
		
		
	}
}
