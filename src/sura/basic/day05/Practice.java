package sura.basic.day05;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		// 조건문, 반복문, 배열

		// Q54
		char[] letter = { 'a', 'b', 'c' };
		for (int index = 0; index < letter.length; index++)
			System.out.println(letter[index] + ", ");
		System.out.println("");

		double[] a = { 1.1, 2.2, 3.3 };
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
		a[1] = a[2];
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
		System.out.println("");

		// int[] sampleArray = new int[10];
		// for (int index = 1; index <= sampleArray.length; index++)
		// sampleArray[index] = 3 * index;
		// 오류

		// Q55-1
		int[] 가 = new int[10];
		for (int i = 0; i < 10; ++i) {
			가[i] = i + 1;
			System.out.print(가[i] + " ");
		}
		System.out.println("");

		// Q55-2
		int[] 나 = new int[11];
		for (int i = 0; i < 11; ++i) {
			나[i] = 2 * i;
			System.out.print(나[i] + " ");
		}
		System.out.println("");

		// Q55-3
		int[] 다 = new int[10];
		for (int i = 0; i < 10; ++i) {
			다[i] = (i + 1) * (i + 1);
			System.out.print(다[i] + " ");
		}
		System.out.println("");

		// Q55-4
		int[] 라 = new int[10];
		for (int i = 0; i < 10; ++i) {
			라[i] = 0;
			System.out.print(라[i] + " ");
		}
		System.out.println("");

		// Q55-5
		int[] 마 = new int[9];
		마[0] = 1;
		마[1] = 4;
		마[2] = 9;
		마[3] = 16;
		마[4] = 9;
		마[5] = 7;
		마[6] = 4;
		마[7] = 9;
		마[8] = 11;
		for (int i = 0; i < 9; ++i)
			System.out.print(마[i] + " ");
		System.out.println("");

		// Q56
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];

		for (int i = 0; i < 10; ++i) {
			System.out.print("값을 입력하세요");
			array[i] = sc.nextInt();
			System.out.println(array[i]);
		}

	}
}
