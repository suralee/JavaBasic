package sura.basic.day07;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        // Q12 생년월일을 입력받아 나이 계산
        // 현재연도 - 생년년도
        // 생일이 지났으면 그대로사용
        // 생일이 지나지 않았으면 -1

        computeAge();

        // Q16 잔돈계산
        // 잔돈을 화폐단위로 계산하는 프로그램 작성
        // 즉, 잔돈을 돌려주기 위해 10원, 50원, 100원, 500원, 1000원, 5000원, 10000원, 50000원 등이
        // 몇 개 필요한지 계산(Charge)
        // 지불요구금액 : 54320원
        // 지불액 : 100000원
        // 잔돈 : 45680원

        computeChange();



    } // main

    public static void computeAge(){
        int byear, bmonth, bday; // 생년월일
        int cyear, cmonth, cday; // 현재년월일
        Scanner sc = new Scanner(System.in);


        // 현재년월일 설정
        cyear = 2021;
        cmonth = 3;
        cday = 24;

        // 생년월일 입력받음
        System.out.print("생일의 년도는?");
        byear = sc.nextInt();
        System.out.print("생일의 월은?");
        bmonth = sc.nextInt();
        System.out.print("생일의 일은?");
        bday = sc.nextInt();

        // 나이계산
        int age = cyear - byear ; // 현재년도 - 생일년도
        if (cmonth > bmonth) // 생일지남 여부확인
            age = age;
        else if ( cmonth == bmonth && cday >= bday)
            age = age;
        else
            age = age - 1;

        // 결과출력
        String fmt = "현재 : %d년 %d월 %d일 \n" + "생일 : %d년 %d월 %d일 \n" +
                "나이 : %d세 \n";
        System.out.printf(fmt, cyear, cmonth, cday, byear, bmonth, bday, age);
    }


    public static void computeChange(){
        int price, pay, change;
        int[] wons = new int[8];
        int[] notes = {50000,10000,5000,1000,500,100,50,10};
        String fmt = "사용요금은 %d, 지불액은 %d 일때 잔돈은 %d 입니다 \n" +
                     "50000원권은 %d 장, 10000원권은 %d 장, \n" +
                     "5000원권은 %d 장, 1000원권은 %d 장, \n" +
                     "500원권은 %d 개, 100원권은 %d 개, \n" +
                     "50원권은 %d 개, 10원권은 %d 개입니다";
        Scanner sc = new Scanner(System.in);

        System.out.println("사용요금은?");
        price = sc.nextInt();
        System.out.println("지불액은?");
        pay = sc.nextInt();

        change = pay - price;

        for(int i=0; i<wons.length; ++i){
            wons[i] = change / notes[i];
            change = change % notes[i];
        }
        System.out.printf(fmt, price, pay, (pay-price),
                wons[0],wons[1],wons[2],wons[3],wons[4],wons[5],wons[6],wons[7]);



    }

}// class
