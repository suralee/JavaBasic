package sura.basic.day06;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        // Q12 생년월일
        computeBirth();

        // Q16 잔돈계산
        // 고객에게 돌려줘야 하는 잔돈을 화폐단위로 계산하는 프로그램을 작성하시오.
        // 즉, 잔돈을 돌려주기 위해 10원, 50원, 100원, 500원, 1000원, 5000원, 10000원, 50000원 등이
        // 몇 개 필요한지 계산하는 것(Charge)
        computeChange();



    } // main

    public static void computeBirth() {

        Scanner sc = new Scanner(System.in);

        System.out.print("생년월일을 입력하세요");
        int birth = sc.nextInt();

        int age = 2021 - birth;

        System.out.println(age);
    }
    // 코딩테스트 --> 대부분의 경우 필수/ 코딩테스트 준비 잘하기 저녁시간에 1~2문제씩 / 쇼핑몰 데모사이트 들어가서 쇼핑몰
    // 도 어던 내용을 필요로하는지, 어디까지 구현을 하는지,


    // Q16 잔돈계산
    // 고객에게 돌려줘야 하는 잔돈을 화폐단위로 계산하는 프로그램을 작성하시오.
    // 즉, 잔돈을 돌려주기 위해 10원, 50원, 100원, 500원, 1000원, 5000원, 10000원, 50000원 등이
    // 몇 개 필요한지 계산하는 것(Charge)
    public static void computeChange(){
        Scanner sc = new Scanner(System.in);

        System.out.print("금액을 입력하세요");
        int remained = sc.nextInt();


        int[] bills = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for(int bill : bills) {
            int num = remained / bill;
            remained = remained % bill;
            System.out.println(bill + "=" + num);
        }
//        int oman = remained/50000; // 변수 이름은 숫자로 시작할 수 없다
//        remained = remained % 50000;
//        int man = remained/10000;
//        remained = remained % 10000;
//        int ocheon = remained/5000;
//        remained = remained % 5000;
//        int cheon = remained/1000;
//        remained = remained % 1000;
//        int obek = remained/500;
//        remained = remained % 500;
//        int bek = remained/100;
//        remained = remained % 100;
//        int osip = remained/50;
//        remained = remained % 50;
//        int sip = remained/10;

//        String fmt = "거스름돈 : \n" +
//                "50000원 : %d개, 10000원 : %d, 5000원 : %d, 1000원 : %d, 500원 : %d, 100원 : %d, 50원 : %d, 10원 : %d";
//        System.out.printf(fmt, oman, man, ocheon, cheon, obek, bek, osip, sip);




    }

}// class
