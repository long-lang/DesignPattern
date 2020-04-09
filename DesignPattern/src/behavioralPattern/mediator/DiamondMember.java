package behavioralPattern.mediator;

public class DiamondMember extends  Member {

	public DiamondMember(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sentText(String to, String message) {
		// TODO Auto-generated method stub
		System.out.println("钻石用户发送消息");
		chatroom.sentText(name, to, message);
		
	}

	@Override
	public void sentImage(String to, String image) {
		// TODO Auto-generated method stub
		System.out.println("钻石用户发送图片");
		chatroom.sentImage(name, to,image );
		
	}

}
