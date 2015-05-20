package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		
		System.out.print("수학 점수 입력 => ");
		int math = scanner.nextInt();
		
		System.out.print("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		int tot = kor + math + eng;
		double avg = tot / 3.0;
		
		StringBuilder sb = new StringBuilder();
		sb.append("<< 점수 출력 >>\n")
		  .append("국어 점수 : ")
		  .append(kor)
		  .append("점\n")
		  .append("수학 점수 : ")
		  .append(math)
		  .append("점\n")
		  .append("영어 점수 : ")
		  .append(eng)
		  .append("점\n")
		  .append("총점 : ")
		  .append(tot)
		  .append("점\n")
		  .append("평균 : ")
		  .append(String.format("%.1f", avg) + " 점");
		
		System.out.println(sb.toString());
		
		scanner.close();

	}

}
