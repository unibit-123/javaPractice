package javaPractice;

public class methodOverloadExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myClass2 m = new myClass2();
		
		System.out.println(m.plus(4, 5));
		
		System.out.println(m.plus(1, 2, 3));
		
		System.out.println(m.plus("hello", " world"));
	}

}
