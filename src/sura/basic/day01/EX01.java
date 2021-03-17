package sura.basic.day01;

public class EX01 {
	public static void main(String[] args) {
		// 1.
		// 복사할 영역 지정하고 컨트롤+알트+방향키 밑으로 내리면 복사 붙여넣기 됨
		System.out.println("*   *    **    ****    ****   *   *     /////");
		System.out.println("*   *   *  *   *   *   *   *  *   *    | o o |");
		System.out.println("*****  *    *  ****    ****    * *    (|  ^  |)");
		System.out.println("*   *  ******  *   *   *   *    *      | [_] |");
		System.out.println("*   *  *    *  *    *  *    *   *       -----");
		System.out.println("                                             ");
		System.out.println("              +---+");
		System.out.println("              |   |");
		System.out.println("          +---+---+");
		System.out.println("          |   |   |");
		// 역슬래쉬는 그냥 출력할 수 없음!! 한번 더 써야함 '\\'
		System.out.println("      +---+---+---+      /\\_/\\      -----");
		System.out.println("      |   |   |   |     ( ' ' )   / Hello \\");
		System.out.println("  +---+---+---+---+     (  -  )  <  Junior |");
		System.out.println("  |   |   |   |   |      | | |    \\ Coder!/");
		System.out.println("  +---+---+---+---+     (__|__)     -----");

		// 3.

		int rate1; // 가능, 딱 좋음!
		// int 1siPlayer; //숫자로 시작하면 안됌
		// int myprogram.java; //'.' 쓸수 없음!, 사용가능 기호는 _, $
		// int long; //자바 예약어를 변수로 선언했기 때문에
		int TimeLimit; // 가능, but 보통 변수는 소문자로 시작하는 것을 권장!
		int numberOfWindows; // 가능, 딱 좋음!

		// 4.
		// 표현식 : expression
		// 계산이나 처리를 위해 작성하는 식을 의미
		// 수학에서 수식과 유사
		// 표현식의 중요한 특징은 평가evaluate임
		// 코드의 결과를 알아내는 과정을 의미

		int x, y, z, s, s0, v0, t, g;
		int result;

		x = 10;
		y = 20;
		z = 30;
		s0 = 5;
		v0 = 10;
		t = 15;
		g = 20;

		result = 3 * x; // 3x
		// sysout + 컨트롤 + 스페이스바해서 간단하게 작성 가능
		System.out.print("3x = ");
		System.out.println(result);

		result = 3 * x + y; // 3x+y
		System.out.print("3x + y = ");
		System.out.println(result);

		System.out.print("( x + y ) / 7 = ");
		System.out.println((x + y) / 7);

		result = (3 * x + y) / (z + 2);
		System.out.print("(3x + y) / (z + 2) = ");
		System.out.println(result);

		result = s0 + v0 * t + 1 / 2 * g * t ^ 2; // 제곱 할때는 **2, 아니면 ^2
		System.out.print("s0 + v0 * t + 1/2 * g * t^2 = ");
		System.out.println(result);

		// 5.

		double number = (1 / 3) * 3;
		System.out.println(" ( 1 / 3 ) * 3 = " + number);
		// 예상값 : 1 실제값 : 0.0
		// '정수 나누기 정수'의 결과값은 정수이기 때문 1/3 = 0.333-->0 !
		// 0 * 3 = 0.0
		// 서로 다른 종류의 값을 수식으로 사용 할때 데이터 타입이 바뀜->'형변환'
		// double형이 문자형과 만나서 문자형으로 바뀜.
		// 자동 형변환->의도하지 않은 형변환

		int quotient = 7 / 3;
		System.out.println(" 7 / 3 = " + quotient);
		// 예상값 : 2.33333, 실제값 : 2

		int remainder = 7 % 3;
		System.out.println(" 7 % 3 = " + remainder);

		result = 11;
		result /= 2;
		System.out.println(" result /= 2 = " + result);
		// 복합대입연산자
		// 산술연산자와 대입연산자를 합쳐놓은 연산자
		// ex) a = a + 1 => a += 1

		// 6.

		double xx = 2.5;
		double yy = 2.5;
		int m = 18;
		int n = 4;

		double result2 = xx + n * yy - (xx + n) * yy;
		System.out.println("x + n * y - (x + n) * y = " + result2);

		result2 = m / n + m % n;
		System.out.println("m / n + m % n = " + result2);

		result2 = 5 * x - n / 5;
		System.out.println("5 * x - n / 5 = " + result2);

		result2 = 1 - (1 - (1 - (1 - n)));
		System.out.println("1 - (1 - (1 - (1 - n))) = " + result2);

		// 7.
		// double 가 = 3 + 4.5 * 2 + 27 / 8;
		// System.out.println(" 3 + 4.5 * 2 + 27 / 8 = " + 가);
		//
		// boolean 나 = true || false && 3 < 4 || !(5==7)
		// System.out.println(" true || false && 3 < 4 || !(5==7) = " + 나);

	}
}
