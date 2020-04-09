package behavioralPattern.mediator;

//访问者模式
public class Clientclass {

		public static void main(String[] args) {
			Member member1 = new CommonMember("张三");
			Member member2 = new CommonMember("李四");
			Member member3 = new DiamondMember("王五");
			Member member4 = new DiamondMember("赵六");
			
			AbstractChatRoom chatRoom = new ChatRoom();
			chatRoom.register(member1);
			chatRoom.register(member2);
			chatRoom.register(member3);
			chatRoom.register(member4);
			
			member1.sentImage("李四", "打死你");
			member1.sentText("李四", "打死你");
			
			member3.sentImage("李四", "打死你");
			member3.sentText("李四", "打死你");
			
			
		}
}
