//arrayList�� �������� ������ ����°�
package pk_26_collection.arryList;
import java.util.ArrayList;
class MyStack{
	private ArrayList<String> arrayStack=new  ArrayList<String>();
	
	public void pust(String data) {
		arrayStack.add(data);
	}
	public String pop() {
		int len=arrayStack.size();
		if(len==0) {
			System.out.println("������ ����ֽ��ϴ�.");
			return null;
		}
		return (arrayStack.remove(len-1)); //�����ֱٿ� ������ ���� 
	}
}
public class StackTest2 {
	public static void main(String[] args) {
		MyStack stack=new MyStack();
		stack.pust("A");
		stack.pust("B");
		stack.pust("C");
		stack.pust("D");
		stack.pust("E");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
