package behavioralPattern.mediator;

public abstract class AbstractChatRoom {
	public abstract void sentText(String from,String to,String message );
	public abstract void sentImage(String from,String to,String image );
	public abstract void  register(Member member);

}
