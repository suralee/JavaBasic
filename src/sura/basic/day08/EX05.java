package sura.basic.day08;

public class EX05 {
    public static void main(String[] args) {
        // Q73
        Fan f = new Fan();
        System.out.println(f.speed);
        System.out.println(f.on);
        System.out.println(f.radius);
        System.out.println(f.color);

        Fan f2 = new Fan();
        System.out.println(f2.speed);
        System.out.println(f2.on);
        System.out.println(f2.radius);
        System.out.println(f2.color);

        // 시험값 지정
        Fan f3 = new Fan();
        f3.speed =  f3.FAST; // speed = 3;
        f3.radius = 10;
        f3.color = "yellow";
        f3.on = true;
        // 클래스를 통해 객체를 생성하고
        // 객체의 멤버변수에 값을 초기화 - 다소 번거로움
        
        Fan f4 = new Fan(2, false, 5, "blue");
        // 매개변수 생성자를 사용하면
        // 객체의 멤버변수에 값을 초기화하기가 편함

        // Q74
        Account a1 = new Account(1112,20000,4.5,
                "2014-08-15 14:34:29");


    }

    static class Fan { // 같은 클래스 내에 클래스를 선언했기 때문에(static) private 변수여도 접근 가능
        // 변수선언
        private int speed;
        private boolean on;
        private double radius;
        private String color;

        // 상수선언
        final int SLOW = 1;     // 상수, 재정의불가
        final int MEDIUM = 2;
        final int FAST = 3;


        // 생성자
        public Fan() { // 생성자, 멤버변수 초기화
            speed = SLOW;
            on = false;
            radius = 5.0;
            color = "blue";
        }

        public Fan(int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

    } //Fan

    static class Account {
        // 변수선언
        private int aid;
        private int balance;
        private double interestRate;
        private String dateCreated;

        // 생성자
        public Account() {}

        public Account(int aid, int balance, double interestRate, String dateCreated) {
            this.aid = aid;
            this.balance = balance;
            this.interestRate = interestRate;
            this.dateCreated = dateCreated;
        }
    }// Account


    class Student{
        // 변수선언
        private int hak;
        private String name;
        private String addr;
        private String birth;
        private String dname;
        private int prof;
    }// Student

    class Subject{
        private int sno;
        private String sname;
        private String sdesc;
        private String ssec;
    }// Course


    class Proffesor{
        private int pno;
        private String name;
        private String field;
        private String tech;
    }

    static class Major{
        private String mname;
        private String offpos;
        private String phone;
        private int chief;
    }
} // class