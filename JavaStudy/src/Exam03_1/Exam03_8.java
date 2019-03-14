package Exam03_1;

public class Exam03_8 {
	public static void main(String[] args) {
		int num = 10;
		//                (조건식) ? 참 : 거짓
		System.out.println( 
		   num > 0 ? "양수" : ( num == 0 ? "0" : "음수" ) 
		); 
		// 삼항 연산자
	}
}