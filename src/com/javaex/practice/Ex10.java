package com.javaex.practice;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String team;
		
		System.out.println("사번(정수)을 입력해주세요.");
		System.out.print("사번 : ");
		num = sc.nextInt();
		
		if (num % 3 == 0) {
			team = "A";
		}
		else if (num % 3 == 1) {
			team = "B";
		}
		else {
			team = "C";
		}
		
		System.out.println(team + "팀입니다.");
		sc.close();

	}

}
