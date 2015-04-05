package org.dimigo.basic;

/**
 * << 다섯번째 실습과제 >>
 * 
 * 아래와 같은 실행 결과가 나오도록 프로그램을 작성해보자
 *
 * 	*2345678910
 *	1*345678910
 *	12*45678910
 *	123*5678910
 *	1234*678910
 *	12345*78910
 *	123456*8910
 *	1234567*910
 *	12345678*10
 *	123456789*
 *
 * @author teacher
 * @version 1.0
 *
 */
public class Loop {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == j)
					System.out.print("*");
				else
					System.out.print(j);
			}
			System.out.println();
		}

	}

}
