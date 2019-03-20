package ch06;

public class Compute {
	public static void main(String[] args) {
		int sum = sum(10);
		average(sum);
	}
	public static int sum(int n) {
		int sum =0;
		for (int i = 1; i <= n; i++) {
			sum = sum + 1;
			
		}
		return sum;
	}
		public static double average(int n) {
			double avg = n /10;
			return avg;
	}
}
