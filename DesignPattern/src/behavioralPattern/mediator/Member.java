package behavioralPattern.mediator;

public abstract class Member {
	protected AbstractChatRoom chatroom;
	protected String name;
	public Member(String name) {
		this.name = name;	
	}
	public AbstractChatRoom getChatroom() {
		return chatroom;
	}
	public void setChatroom(AbstractChatRoom chatroom) {
		this.chatroom = chatroom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void sentText(String to,String message);
	public abstract void sentImage(String to,String image );

	public void receiveText(String from,String message) {
		System.out.println(from + " 发送消息 "+this.name+"  内容为： "+message);
	}
	
	public void receiveImage(String from,String image) {
		System.out.println(from + " 发送图片 "+this.name+" 内容为： "+image);
	}
}
