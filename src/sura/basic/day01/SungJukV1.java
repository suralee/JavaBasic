package sura.basic.day01;

/**
 * 
 * @author sura
 * @category javabasic
 * @version 1.0
 * 
 *          자바기초프로그램 - 과목 클래스 입력 : 이름,국어,영어,수학 처리 : 총점,평균,학점 출력 :
 *          이름,국어,영어,수학,총점,평균,학점 단, 학점 : 수우미양가, ABCDF
 * 
 */
public class SungJukV1 {
	public static void main(String[] args) {
		// 변수 선언( 앞에 타입/ 뒤에 변수명 )
		String name;
		int kor;
		int eng;
		int mat;
		int tot;
		double avg; // 정수가 아니라 실수일때 double
		char grd; // 'A','B'등 문자 하나기때문에 char, string도 됨
		// 처리
		name = "홍길동";
		kor = 95;
		eng = 78;
		mat = 84;
		tot = kor + eng + mat;
		// avg = (kor + eng + mat) / 3;
		avg = tot / 3;

		grd = '가'; // char로 선언했기 때문에 ''를 써야함

		// 결과 출력
		System.out.print("이름 : "); // 'sysout' + ctrl + spacebar 단축키
		System.out.println(name);
		System.out.print("국어 : ");
		System.out.println(kor);
		System.out.print("영어 : ");
		System.out.println(eng);
		System.out.print("수학 : ");
		System.out.println(mat);
		System.out.print("총점 : ");
		System.out.println(tot);
		System.out.print("평균 : ");
		System.out.println(avg);
		System.out.print("학점 : ");
		System.out.println(grd);

	}

}
