package ch5;

public class Rank {
	public static void main(String[] args) {
		int[][] s = {
				{1, 2, 3},
				{11, 12, 13},
				{21, 22, 23}
		};
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j <s[i].length; j++) {
				System.out.println(s[i][j]);
			}
		}
		int i23 = s[2][2];
		System.out.println(i23);
		
		int i11 = s[1][0];
		System.out.println(i11);
		}
	}
