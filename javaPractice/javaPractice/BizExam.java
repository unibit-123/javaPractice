package javaPractice;

public class BizExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BizService biz = new BizService();
		biz.Bizmethod(5);
		try {
			biz.Bizmethod(-3);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
