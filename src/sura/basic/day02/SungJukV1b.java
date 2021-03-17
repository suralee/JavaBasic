package sura.basic.day02;

import java.util.Scanner;

/**
 * 
 * @author sura
 * @category javabasic
 * @version 1.1
 * 
 *          자바기초프로그램 - 성적처리프로그램
 *
 *          이름과 성적데이터를 키보드로 직접 입력받아 처리 처리결과 출력시 printf 메서드 사용
 * 
 */

public class SungJukV1b {
	public static void main(String[] args) {
		// 변수선언
		String name;
		int kor;
		int eng;
		int mat;
		int tot;
		double avg;
		char grd;

		// 처리
		Scanner sc = new Scanner(System.in);
		// 키보드를 이용해서 성적데이터를 입력받기 위해
		// Scanner 클래스를 초기화함

		System.out.println("이름은? ");
		name = sc.next();
		// 키보드로 문자데이터를 입력받아 name 변수에 대입

		System.out.println("국어는? ");
		kor = sc.nextInt();
		// 키보드로 숫자데이터를 입력받아 name 변수에 대입

		System.out.println("영어는? ");
		eng = sc.nextInt();

		System.out.println("수학은? ");
		mat = sc.nextInt();

		// 총점, 평균 처리
		tot = kor + eng + mat;
		avg = (kor + eng + mat) / 3;
		grd = '가';

		// 출력
		// 이름 : ??, 국어 : ??, 영어: ??, 수학: ??
		// 총점 : ??, 평균 : ??, 학점: ??

		String fmt = "이름 : %s, 국어 : %d,영어 : %d, 수학: %d \n";
		System.out.printf(fmt, name, kor, eng, mat);

		fmt = "총점 : %d, 평균 : %.1f, 학점 : %c"; // %.1f->소수점 첫째자리까지만 나타낸다
		System.out.printf(fmt, tot, avg, grd);

//		System.out.println(name);
//		System.out.println(kor);
//		System.out.println(eng);
//		System.out.println(mat);
//
//		System.out.println("총점은 " + tot + "점입니다.");
//		System.out.println("평균은 " + avg + "점입니다.");

	}
}
