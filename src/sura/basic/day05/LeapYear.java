package sura.basic.day05;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		// 다음 조건을 이용, 현재 연도를 입력하면 윤년 여부 출력하는 프로그램 작성
		// 지구의 공전주기와 자전주기의 불일치로 발생
		// 공전주기 : 365.24일
		// 자전주기 : 0.24일
		// 이 두간의 오차때문에 4년마다 하루를 추가하는 방법으로
		// 오류를 보정함

		// 조건1 : 현재 연도가 4로 나눠 떨어지지만,
		// 100으로는 나눠 떨어지지 않음=>윤년
		// 조건2 : 현재 연도가 400으로 나눠 떨어짐=>평년
		// 1600(윤년), 2020(윤년)

		int year;
		String result;

		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요 ");
		year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			result = "윤년입니다";
		else
			result = "평년입니다";

		System.out.println("result");

	}
}
