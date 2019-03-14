package Exam04_1;

public class Exam04_2 {
	public static void main(String[] args) {
		int score = 22;
		if (score % 2 == 0 && score % 3 == 0) { //2의 배수 이면서 3의 배수 인 것
			System.out.println("쿵짝");
		} else if (score % 2 == 0) { //2의 배수: 2로 나누어서 나누어 떨어짐
			System.out.println("쿵");
		} else if (score % 3 == 0) { //3의 배수: 3로 나누어서 나누어 떨어짐
			System.out.println("짝");
		}
	}
}

//6의 배수가 맨 위로 올라가게 해야함