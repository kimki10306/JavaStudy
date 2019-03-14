package Exam03_1;

public class Exam03_9 {
	public static void main(String[] args) {
		char a = 'C';
//		  a = a + (char)1;   (X)
		a = (char) (a + 1);
		// char + char ==> int + int
		// char + int ==> int + int
		// (char) (int + int)

		char lowerCase = (a > 'A' && a < 'Z') ? ((char) (a + 32) /* a + 32 */ ) : a;

		System.out.println("ch : " + a);
		System.out.println("ch to lowerCase : " + lowerCase);
	}
}
