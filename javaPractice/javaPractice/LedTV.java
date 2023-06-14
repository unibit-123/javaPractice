package javaPractice;

public class LedTV implements TV {

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("전원끄기");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("전원켜기");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("볼륨조정");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널조정");
	}

}
