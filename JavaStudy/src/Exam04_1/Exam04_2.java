package Exam04_1;

public class Exam04_2 {
	public static void main(String[] args) {
		int score = 22;
		if (score % 2 == 0 && score % 3 == 0) { //2�� ��� �̸鼭 3�� ��� �� ��
			System.out.println("��¦");
		} else if (score % 2 == 0) { //2�� ���: 2�� ����� ������ ������
			System.out.println("��");
		} else if (score % 3 == 0) { //3�� ���: 3�� ����� ������ ������
			System.out.println("¦");
		}
	}
}

//6�� ����� �� ���� �ö󰡰� �ؾ���