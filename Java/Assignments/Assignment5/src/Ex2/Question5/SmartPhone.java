package Ex2.Question5;

public class SmartPhone extends Phone {

	@Override
	public void call() {
		super.call();
	}
	@Override
	public void hear() {
		// TODO Auto-generated method stub
		super.hear();
	}
	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		super.sendSMS();
	}
	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		super.receiveSMS();
	}
	public void use3G(){
		System.out.println("Sử dụng 3G");
	}
	public void takePhoto(){
		System.out.println("Chụp ảnh");
	}
	@Override
	public void attackBadGuy() {
		System.out.println("Điện thoại thông minh -- Tấn công!!");
	}
	
}
