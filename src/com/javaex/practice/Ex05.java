package com.javaex.practice;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height, weight;
		float s_weight;
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키 : ");
		height = sc.nextInt();
		
		System.out.print("몸무게 : ");
		weight = sc.nextInt();
		
		if (height < 150 && height > 0) {
			s_weight = height - 100;
		}
		else {
			s_weight = height - 100 * 0.9f;
		}
		
		System.out.println("표준체중은 " + (int)s_weight + "kg입니다.");
		
		if (weight < s_weight) {
			System.out.println("저체중입니다.");
		}
		else if (weight == s_weight) {
			System.out.println("표준입니다.");
		}
		else {
			System.out.println("과체중입니다.");
		}
		
		sc.close();

	}

}
