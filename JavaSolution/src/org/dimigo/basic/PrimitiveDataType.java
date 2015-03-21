package org.dimigo.basic;

// 수정
/**
 * << 첫번째 실습과제 >>
 * 
 * 지금까지 배운 자료형을 사용하여 아래 내용을 출력해 보자.
 * - 이름(String), 성별(boolean), 나이(int), 키(double), 몸무게(float), 혈액형(char)
 *
 * << 아이유 프로필 >>
 * 이름 : 아이유
 * 성별 : 여자
 * 나이 : 23 세
 * 키  : 161.8 cm
 * 몸무게 : 44.3 kg
 * 혈액형 : A 형
 * 
 * @author teacher
 *
 */
public class PrimitiveDataType {

	public static void main(String[] args) {
		// 이름, 성별, 나이, 키, 몸무게, 혈액형
		String name = "아이유";
		boolean isMale = false;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + (isMale == true ? "남자" : "여자"));
		System.out.println("나이 : " + age + " 세");
		System.out.println("키 : " + height + " cm");
		System.out.println("몸무게 : " + weight + " kg");
		System.out.println("혈액형 : " + bloodType + " 형");
	}

}
