package javaPractice;

public class variableScopeExam {
	
	int globalScope = 10;
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
