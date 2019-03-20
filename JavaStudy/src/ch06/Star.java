package ch06;

public class Star {
public static void main(String[] args) {
	int center = 3;
	int left = 2;
	int right = 4;
	for(int i = 1; i <= 5; i++) {
		for(int j = 1;j <= 5; j++) {
			if(j <= left || j >= right) {
				System.out.print(" ");
			}else {
				System.out.print("@");
			}
		}
	if(i<3) {
		left--;
		right++;
	} else {
		left++;
		right--;
	}
	System.out.println();
	}
}
}

