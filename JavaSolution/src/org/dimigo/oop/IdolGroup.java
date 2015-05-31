package org.dimigo.oop;

public class IdolGroup {
	
	public static void main(String[] args) {
		String[] groupName = {"빅뱅", "2NE1", "걸스데이"};
		
		String[][] members = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "소진", "민아", "혜리", "그외"}
		};

		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<groupName.length; i++) {
			sb.append("<< ")
			.append(groupName[i])
			.append(" 멤버 >>\n");
			
			for(int j=0; j<members[i].length; j++) {
				sb.append(members[i][j])
				  .append("\n");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}

}
