package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Triple {
	public static void main(String []args) {
		/*
		 * �̰͵� �ּ�
		 * ���׿�����
		 * �׸��� 3��
		 * (���ǽ�) ? ���� ��: ������ ��
		 * -���ǽ��� �ݵ�� true or false�� ��ȯ
		 * -��/�������� �ַ� ��� 
		 * 
		 */
		// (num1 > num2) ? "��" : "����";
		// ������ �Է¹޾� ¦������ Ȧ������ �Ǻ��ϴ�
		// ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է� :");
		int input = sc.nextInt();
		
		String result = (input %2 == 0) ? "¦��" : "Ȧ��"; 
		System.out.print(input + "��/��" +  result + "�Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
