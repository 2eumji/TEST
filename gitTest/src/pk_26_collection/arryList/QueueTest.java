package pk_26_collection.arryList;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> arrayStack=new  ArrayList<String>();
		
		public void enQueue(String data) { //넣기 : 스택의 offer와 같음
			arrayStack.add(data);
		}
		public String deQueue() { // 빼기
			int len=arrayStack.size();
			if(len==0) {
				System.out.println("스택이 비어있습니다.");
				return null;
			}
			return (arrayStack.remove(len)); 
		}
	
	
}
public class QueueTest {
	public static void main(String[] args) {
		
		MyQueue Queue=new MyQueue();
		Queue.enQueue("A");
		Queue.enQueue("B");
		Queue.enQueue("C");
		Queue.enQueue("D");
		Queue.enQueue("E");
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		
	}
}
