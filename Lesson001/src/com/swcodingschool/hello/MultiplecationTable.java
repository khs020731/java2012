package com.swcodingschool.hello;

public class MultiplecationTable {

	public static void main(String[] args) {
		int i, j;
		for(i = 1; i <= 9 ; i++) {
			for(j = 2; j<= 9 ; j++) {
				System.out.printf("%d * %d = %d\t", j, i, i*j);
			}
			System.out.println("");
		}
	}
}
