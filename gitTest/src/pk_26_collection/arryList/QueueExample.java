package pk_26_collection.arryList;

import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue=new LinkedList<Message>();
		messageQueue.offer(new Message("sendMail","ȫ�浿"));
		messageQueue.offer(new Message("sendSMS","�Ӳ���"));
		messageQueue.offer(new Message("sendKaKaotalk","ȫ�α�"));
		//empty:����ȭ �ȵ� ����ִ� ���� 0 ���� True�� ��ȯ
		//isEmpty:����ȭ�� �����ϸ� null������(�� ��ü�� �� �����Ƿ� ��������� null������ �ʱ�ȭ��
		while(!messageQueue.isEmpty()) { //������� ������ ��� ����
			Message message=messageQueue.poll(); //�ڷ� ����
			switch(message.command) {
			case "sendMail" : 
				System.out.println(message.to+"�Կ��� ������ �����Դϴ�");
				break;
			case "sendSMS" : 
				System.out.println(message.to+"�Կ��� ������ sms�Դϴ�");
				break;
			case "sendKaKaotalk" : 
				System.out.println(message.to+"�Կ��� ������ īī�����Դϴ�");
				break;
			}
		}
		
	}
}
