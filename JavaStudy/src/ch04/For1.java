package ch04;

public class For1 {
	public static void main(String[] args) {
		//1. 시작값 2.끝값 3. 증감식
		int total = 0;
		
	//1+(1+2)+(1+2+3)+....	
		for(int start =1; start <= 10; start++) {
	total = total + start;
	realtotal = realtotal + start;
		}
	System.out.println(realtotal);
			
		
		
		
		
		
//			for(int start =0; start <= 10; start++) {
//		//total = total + start;	
//		System.out.println(start);
//			}
		
//		for(int end = 10; end >=1; end--) {
//			System.out.println("감소출력" + end);
//			System.out.println("한줄출력");
//		}
			// 1 2 3 조건이 제대로 맞지 않는 겨우
			// for (int snack = 1; snack <=10; snack++) {
			// System.out.println("과자"+ snack);
		}
	}
