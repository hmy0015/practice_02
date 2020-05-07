package com.javaex.practice;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float tax;
		
		System.out.println("수익을 입력해주세요.");
		System.out.print("금익 : ");
		int pay = sc.nextInt();
		
		if (pay >= 0 && pay <= 1000) {
			tax = 0.09f * pay;
			System.out.println("소득세는 " + tax + "입니다.");
		}
		else if (pay > 1000 && pay <= 4000) {
			tax = 1000 * 0.09f + 0.18f * (pay-1000);
			System.out.println("소득세는 " + tax + "입니다.");
		}
		else if (pay > 4000 && pay < 8000) {
			tax = 1000 * 0.09f + 3000 * 0.18f + 0.27f * (pay-4000);
			System.out.println("소득세는 " + tax + "입니다.");
		}
		else if (pay >= 8000){
			tax = 1000 * 0.09f + 3000 * 0.18f + 4000 * 0.27f + 0.36f * (pay-8000);
			System.out.println("소득세는 " + tax + "입니다.");
		}
		else {
			System.out.println("잘 못 입력하셨습니다.");
		}
		
		sc.close();
	}

}
