package sura.basic.day05;

import java.util.Scanner;

public class CardCheck {
	public static void main(String[] args) {
		// 신용카드 번호를 보고
		// 어떤 종류와 은행인지 알려주는 프로그램
		// 3: JCB카드
		// 4: Visa카드
		// 5: Master카드

		// 문자열.charAt(자릿수) : 지정한 자릿수의 문자하나 추출

		String cardnum;
		String cardtype = "";
		String cardbank = "";
		String fmt = "카드종류는 %s이고요,  %s 입니다";
		Scanner sc = new Scanner(System.in);

		System.out.print("카드번호를 입력하세요 ");
		cardnum = sc.next();

//		if (cardnum.charAt(0) == '3')
//			cardtype = "JCB카드";
//
//		else if (cardnum.charAt(0) == '4')
//			cardtype = "비자카드";
//
//		else if (cardnum.charAt(0) == '5')
//			cardtype = "마스타카드";
//
//		System.out.println(cardtype);

		// switch 문으로 바꾸면 코드가 더 simple함
		switch (cardnum.charAt(0)) {
		case '3':
			cardtype = "JCB카드";
			break;
		case '4':
			cardtype = "비자카드";
			break;
		case '5':
			cardtype = "마스타카드";
			break;
		} // switch
			// System.out.println(cardtype);
		switch (cardnum) {
		case "356317":
			cardbank = "NH농협카드";
			break;
		case "356901":
			cardbank = "신한카드";
			break;
		case "356912":
			cardbank = "KB국민카드";
			break;
		case "404825":
			cardbank = "비씨카드";
			break;
		case "438676":
			cardbank = "신한카드";
			break;
		case "457973":
			cardbank = "국민은행";
			break;
		case "515594":
			cardbank = "신한카드";
			break;
		case "524353":
			cardbank = "외환카드";
			break;
		case "540926":
			cardbank = "국민은행";
			break;
		} // switch
		System.out.printf(fmt, cardtype, cardbank);
	} // main

}
