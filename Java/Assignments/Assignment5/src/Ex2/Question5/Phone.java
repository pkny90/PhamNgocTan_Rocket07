package Ex2.Question5;

public abstract class Phone implements IWeapon{
	public void hear(){
		System.out.println("Nghe điện");
	}
	public void call(){
		System.out.println("Gọi điện");
	}
	public void sendSMS(){
		System.out.println("Gửi tin nhắn");
	}
	public void receiveSMS(){
		System.out.println("Nhận tin nhắn");
	}
}
