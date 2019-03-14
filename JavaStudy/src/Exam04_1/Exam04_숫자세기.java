package Exam04_1;

public class Exam04_숫자세기 {
public static void main(String[] args) {
	int count = 0;
	for(int i = 1; i >=1000; i++) {
		int num = i; 
		while(num > 0) {
			int n = num % 2;
			if(n == 8) {
				System.out.println(i);
				count++;
						}
			num = num / 2;

		}
		System.out.println();
}
}
}

