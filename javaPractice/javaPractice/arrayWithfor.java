package javaPractice;

public class arrayWithfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iarray1 = new int[100];
		System.out.println(iarray1.length);
		
			for(int i=0; i<iarray1.length; i++) {
				iarray1[i] = i+1;
			}
			
		
		int sum=0;
		for(int i=0; i<iarray1.length; i++) {
			sum = sum + iarray1[i];
		}
		
		System.out.println(sum);
	}

}
