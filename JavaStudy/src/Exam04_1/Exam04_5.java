https://github.com/kimki10306/JavaStudy.gitpackage Exam04_1;

public class Exam04_5 {
	public static void main(String[] args) {
boolean isContinue = true;
int count = 0;

while(isContinue) {
	int num1 = (int) (Math.random() * 6 + 1);
	int num2 = (int) (Math.random() * 6 + 1);
	count++;
	System.out.println("(" + num1+ ","+ num2+")");
	
	if(num1 + num2 == 10) {
		isContinue = false;
	}
	}
	System.out.println("�ֻ����� ���� Ƚ�� :" + count);
			}
}	
	
	
