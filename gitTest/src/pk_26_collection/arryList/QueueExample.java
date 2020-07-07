package pk_26_collection.arryList;

import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue=new LinkedList<Message>();
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","임꺽정"));
		messageQueue.offer(new Message("sendKaKaotalk","홍두깨"));
		//empty:동기화 안됨 비어있는 공간 0 으로 True값 반환
		//isEmpty:동기화를 제공하며 null값인지(즉 객체가 들어가 있으므로 비어있으면 null값으로 초기화됨
		while(!messageQueue.isEmpty()) { //비어있지 않을때 계속 돌기
			Message message=messageQueue.poll(); //자료 뺴기
			switch(message.command) {
			case "sendMail" : 
				System.out.println(message.to+"님에게 보내는 메일입니다");
				break;
			case "sendSMS" : 
				System.out.println(message.to+"님에게 보내는 sms입니다");
				break;
			case "sendKaKaotalk" : 
				System.out.println(message.to+"님에게 보내는 카카오톡입니다");
				break;
			}
		}
		
	}
}
