package behavioralPattern.mediator;

public class CommonMember extends Member {

	public CommonMember(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sentText(String to, String message) {
		// TODO Auto-generated method stub
		System.out.println("普通用户发送消息：");
		chatroom.sentText(name, to, message);
	}

	@Override
	public void sentImage(String to, String image) {
		// TODO Auto-generated method stub
		System.out.println("普通用户不能发送图片");
		
	}

}
