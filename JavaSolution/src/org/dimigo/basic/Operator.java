package org.dimigo.basic;

/**
 * << 세번째 실습과제 >>
 * 
 * 사다리꼴과 평행사변형 두 개의 넓이를 비교하여 결과를 출력하기
 *  - 사다리꼴 : 두 변의 길이 a = 9, b = 10, 높이(h) = 5.8
 *  - 평행사변형 : 밑변의 길이 a = 9, 높이(h) = 5.4
 *
 * << 도형 넓이 비교 >>
 * 사다리꼴 넓이 : 55.1
 * 평행사변형 넓이 : 48.6
 *
 * 사다리꼴이 평행사변형 보다 6.5 더 큽니다.
 *
 * @author teacher
 * @version 1.0
 *
 */
public class Operator {

	public static void main(String[] args) {
		System.out.println("<< 도형 넓이 비교 >>");
		
		// 사다리꼴 넓이
		int a = 9, b = 10;
		double h = 5.8;
		double area = ((a + b) * h) / 2;
		System.out.println("사다리꼴 넓이 : " + area);
		
		// 평행사변형 넓이
		h = 5.4;
		double area2 = a * h;
		System.out.println("평행사변형 넓이 : " + area2);
		
		// 넓이 비교
		double diff = area - area2;
		
		if(diff > 0) {
			System.out.println("\n사다리꼴이 평행사변형 보다 " + diff + " 더 큽니다.");
		} else if(diff < 0) {
			System.out.println("평행사변형이 사다리꼴 보다 " + -diff + " 더 큽니다.");
		} else {
			System.out.println("두 도형의 넓이가 같습니다.");
		}
		
	}

}
