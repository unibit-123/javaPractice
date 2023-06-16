package javaPractice;

public class BizService {
	public void Bizmethod(int i) throws BizException{
		System.out.println("start bizmethod");
		
		if(i < 0) throw new BizException ("Please enter better than 0");
		
		System.out.println("end bizmethod");
	}
}
