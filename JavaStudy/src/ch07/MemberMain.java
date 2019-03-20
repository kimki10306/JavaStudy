package ch07;

public class MemberMain {
	public static void printData(Member m) {
		System.out.println(m.id);
		System.out.println(m.name);
	}
	public static void printData(Member[]m) {
		for(int i = 0; i < m.length; i++) {
			
		}
	}
public static void main(String[] args) {
	Member[] m = new Member[2];
	Member m1 = new Member();
	m1.id = "ggoreb";
	m1.name = "Kim";
	printData(m1);
	
	Member m2 = new Member();
	m1.id = "seorab";
	m1.name = "park";
	printData(m2);
	m[0] = m1; m[1] = m2;
	printData(m2);
}

}
