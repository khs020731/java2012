package com.swcodingschool.hello;
/**
 * 
 * @author Kim Han Saem
 * 
 * 3. javadoc 
 */ 
public class Comment {

	public static void main(String[] args) {
		// for each : collection date 를 이용한 반복 제어
		int array[] = {1,2,3,4,5};
		for(int numInArray : array) {
			System.out.printf("%3d", numInArray);
		}
		
	}

}
