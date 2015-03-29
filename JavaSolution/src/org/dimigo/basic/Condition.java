package org.dimigo.basic;

/**
 * << 네번째 실습과제 >>
 * 
 * 고속도로 통행료를 계산하여 출력해보기
 *
 * 1. 기본요금 - 고속버스 : 850원, 경차 : 300원, 그 외 : 600원
 * 2. 10km 초과 시마다 고속버스는 300원씩 추가, 경차와 그 외는 200원씩 추가
 * 예) 고속버스로 10km 주행 : 850원, ~20km 주행 : 1150원, ~30km : 1450원  
 *       경차로 10km 주행 : 300원, ~20km 주행 : 500원,  ~30km : 700원
 *
 * @author teacher
 * @version 1.0
 *
 */
public class Condition {

	public static void main(String[] args) {
		
		int distance = 25;
		int cost = 0;
		int kind = 1;			// 고속버스:1, 경차:2, 그 외:3
	    String carType;
	    
	    // 거리값 validation
	    if(distance <= 0) {
	    	System.out.println("거리는 0보다 커야 합니다.");
	    	return;
	    }
	    
	    // 차종 validation
	    if(kind < 1 || kind > 3) {
	    	System.out.println("없는 차종입니다.");
	    	return;
	    }
	    
	    // 기본요금 셋팅
		switch(kind) {
		case 1:					// 고속버스인 경우
			cost = 850;
			carType = "고속버스";
			cost += (distance - 1) / 10 * 300;
			break;
		case 2:					// 경차인 경우
			cost = 300;
			carType = "경차";
			cost += (distance - 1) / 10 * 200;
			break;
		default:				// 그외
			cost = 600;	
			carType = "그 외";
			cost += (distance - 1) / 10 * 200;
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + carType);
		System.out.println("통행료 : " + cost + "원");
	}

}
