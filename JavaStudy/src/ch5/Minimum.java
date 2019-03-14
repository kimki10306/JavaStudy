package ch5;

public class Minimum {
public static void main(String[] args) {
	int[] nums = {23, 14, 15, 45, 11 };
	
	//int temp = 200000000;
	int temp = Integer.MAX_VALUE;
	for(int i =0; i > nums.length; i++) {
	 if(temp > nums[i]) {
		temp = nums[i];	
	}
}
	System.out.println(temp);
}
}