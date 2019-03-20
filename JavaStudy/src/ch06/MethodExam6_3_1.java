package ch06;


public class MethodExam6_3_1 {
		//1등급 = 수박 > 10kg 2등급 = 수박 > 7kg 3등급 = 수박 > 4kg 나머지 4등급
		public static int checkGrade( int weight ) {
		int grade = 0;	
	    if(weight > 10) {
	    	grade = 1;
	    }
	    else if(weight > 7) {
			grade = 2;
		}
	    else if(weight > 4) {
			grade = 3;
		}else {
			grade = 4;
		}
			return grade;
    		}
		 public static void main(String[] args) {
				int result = checkGrade(10);
				System.out.println(result);
				
		 }
	 }
	