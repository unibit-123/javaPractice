package javaPractice;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 2;
		try {
			int k = i/j;
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("can't indivisible."+e.toString());
		}finally {
			System.out.println("Compiling unconditionally");
		}
		System.out.println("main end");

		
	}

}
