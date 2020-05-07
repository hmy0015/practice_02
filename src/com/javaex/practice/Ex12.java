package com.javaex.practice;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1, num2;
		char oper;
		
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호 : ");
		oper = sc.next().charAt(0);

		System.out.print("숫자1 : ");
		num1 = sc.nextFloat();

		System.out.print("숫자2 : ");
		num2= sc.nextFloat();
		
		switch(oper) {
			case '+' :
				System.out.println("결과는 : " + (num1 + num2));
				break;	
			case '-' :
				System.out.println("결과는 : " + (num1 - num2));
				break;	
			case '*' :
				System.out.println("결과는 : " + (num1 * num2));
				break;	
			case '/' :
				if (num2 == 0) {
					System.out.println("계산할 수 없습니다.");
				}
				else {
					System.out.println("결과는 : " + (num1 / num2));
					break;
				}
		}
		sc.close();

	}

}
