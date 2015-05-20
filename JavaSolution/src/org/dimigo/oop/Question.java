/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 * 
 * 1. 개요 : 실습과제 8 - 문자열 비교하기
 * 2. 작성일 : 2015. 5. 8.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] questions = {"가장 좋아하는 가수는?",
							  "가장 좋아하는 배우는?",
							  "가장 좋아하는 과목은?"};
		
		String[] answers = {"빅뱅", "조인성", "자바"};
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<questions.length; i++) {
			System.out.println(questions[i]);
			
			String answer = scanner.nextLine();
			if(answers[i].equals(answer)) {
				System.out.println("정답입니다!! ^^");
			} else {
				System.out.println("틀렸습니다!! TT");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
