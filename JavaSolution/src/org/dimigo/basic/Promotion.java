package org.dimigo.basic;

/**
 * << 두번째 실습과제 >>
 * 
 * 대한민국 커피 전문점 매출1위 디미베네의 연간 인건비를 계산해보자.
 * - 연간 인건비 = 월 평균 급여 * 12 * 점포 내 직원 수 * 점포 수
 * - 천단위 콤마 찍기 : String.format("%,d", 10000) -> 10,000
 *
 * << 디미베네 연간 인건비 >>
 * 월 평균 급여 : 1,700,000원
 * 점포 내 직원 수 : 3명
 * 점포 수 : 1,500개
 * 
 * 연간 인건비 : 91,800,000,000원
 * 
 * @author teacher
 * @version 1.0
 *
 */
public class Promotion {

	public static void main(String[] args) {
		int avgSalary = 1700000;
		int numOfEmployee = 3;
		int numOfStore = 1500;

		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", avgSalary) + "원");
		System.out.println("점포 내 직원수 : " + numOfEmployee + "명");
		System.out.println("점포 수 : " + String.format("%,d", numOfStore) + "개");
		
		long annualCost = avgSalary * 12L * numOfEmployee * numOfStore;
		
		System.out.println("\n연간 인건비 : " + String.format("%,d", annualCost) + "원");
		
	}
}
