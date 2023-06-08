package javaPractice;

public class arrayExam {

	public static void main(String[] args) {
		int[] array1 = new int[100];	//배열 저장 1번째 방법
		array1[0] = 5;         //배열 0번째칸에 5를 저장
		array1[10] = 10;        //배열 10번째칸에 10을 저장
		
		int[] array2 = new int[] {1,2,3,4};		//배열 저장 2번쨰 방법
		
		int[] array3 = {1,2,3,4};		//배열 저장 3번쨰 방법, 이게 제일 자주 쓰일거같음
		
		System.out.println(array3[3]);		//array3의 배열 호출
		
		int value = array3[1];		// array3의 3번째 값을 변수 value에 저장
		System.out.println(value);		//변수 value 호출
		
	}

}
