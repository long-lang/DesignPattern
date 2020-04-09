package behavioralPattern.mediator;

import java.util.Hashtable;

public class ChatRoom extends AbstractChatRoom {
	protected Hashtable<String, Member> members = new Hashtable<String, Member>();
	
	@Override
	public void sentText(String from, String to, String message) {
		// TODO Auto-generated method stub
		Member member = members.get(to);
		String newMessage = message;
		newMessage = message.replaceAll("打", "*");	
		member.receiveText(from, newMessage);
		
	}

	@Override
	public void sentImage(String from, String to, String image) {
		// TODO Auto-generated method stub
		Member member = members.get(to);
		member.receiveImage(from, image);
		
	}

	@Override
	public void register(Member member) {
		// TODO Auto-generated method stub
		if(!members.contains(member)) {
			members.put(member.getName(), member);
			member.setChatroom(this);
		}
	}

}
