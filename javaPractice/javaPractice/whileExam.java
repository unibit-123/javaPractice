package javaPractice;

public class whileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int i = 0;  //while에서 사용할 변수를 선언
	    int total = 0;
	    
	    while(i < 10){
	        System.out.println(i);
	        i++; //조건문을 원하는 만큼만 반복하고 빠져나가기 위한 부분 
	    }
	     // i의 값을 누적할 변수를 선언합니다.
        while(i <= 100){
            total = total + i;
            i++;
        }
        System.out.println(total);

}
}
