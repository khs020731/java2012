package com.swcodingschool.hello;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수를 입력하세요 : ");
		int score = sc.nextInt();
		System.out.printf("성적은 ");
		if(score>=90) System.out.printf("A");
		else if (score>=80)System.out.printf("B");
		else if (score>=70)System.out.printf("C");
		else System.out.printf("F");
		
		
		switch((int)score/10) {
			case 10 : case 9 : System.out.printf("A");break;
			case 8 : System.out.printf("B");break;
			case 7 : System.out.printf("C");break;
			default : System.out.printf("F");
		}
		
	}

}
