package Exam03_1;

public class Exam03_4 {
	public static void main(String[] args) {
		int num = 456;
		int remain = num % 100; // <- % 연산자 이용
		num = num - remain;
		System.out.println(num / 100 * 100); // <- 나누기, 곱하기 연산자 이용

	}

}
