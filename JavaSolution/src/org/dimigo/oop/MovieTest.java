/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ MovieTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class MovieTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MovieChannel channel = new MovieChannel();
		
		channel.addMovie(new Movie("어벤져스2", "액션", "미국", new String[] {"로버트 다우니 주니어", "스칼렛 요한슨"}, 141));
		channel.addMovie(new Movie("Whiplash", "드라마", "미국", new String[] {"마일즈 텔러 "}, 106));
		channel.addMovie(new Movie("장수상회", "드라마", "한국", new String[] {"박근형", "윤여정", "조진웅"}, 112));
		channel.addMovie(new Movie("투모로우랜드", "SF", "미국", new String[] {"조지 클루니", "브릿 로버트슨"}, 125));

		System.out.println("1. 전체 조회");
		channel.printAllMoviesInfo();
		
		System.out.println("2. [whiplash] 검색");
		Movie movie = channel.searchMovie("whiplash");
		if(movie == null) {
			System.out.println("=> 찾고자 하는 영화가 없습니다.");
		} else {
			movie.printMovieInfo();
		}
		
		System.out.println("3. [투모로우랜드] 변경");
		channel.updateMovie(new Movie("투모로우랜드", "어드벤처", "미국", new String[] {"조지 클루니", "브릿 로버트슨", "휴 로리"}, 130));
		System.out.println();
		
		System.out.println("4. [투모로우랜드] 검색");
		movie = channel.searchMovie("투모로우랜드");
		if(movie == null) {
			System.out.println("=> 찾고자 하는 영화가 없습니다.");
		} else {
			movie.printMovieInfo();
		}
		
		System.out.println("5. [어벤져스2] 삭제");
		channel.deleteMovie("어벤져스2");
		System.out.println();
		
		System.out.println("6. 전체 조회");
		channel.printAllMoviesInfo();
		
		System.out.println("7. 총 상영시간 출력");
		channel.printTotalRunningTime();
	}

}
