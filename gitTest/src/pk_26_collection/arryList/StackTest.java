package pk_26_collection.arryList;
import java.util.Stack;
public class StackTest {

	public static void main(String[] args) {
		Object obj;		
		//empty 스택생성
		Stack<Object> st = new Stack<Object>();
		
		if(st.empty()){//스택이 비어 있으면
			for(int i=1; i<=3; i++){//스택에 데이타를 3개 추가
				st.push(new String("Hi!"+i));
				System.out.println(" 입력"+i+ "번째 : " + st.peek()); 
			}
		}//of if		
		//System.out.println(st.pop());
		st.pop();//밖으로 나옴 3출력
		System.out.println("현재 Top의 위치(peek) : "+st.peek());//현재위치꺼 보여줌 2보여줌		
		st.pop();//밖으로 나옴 2출력
		System.out.println("현재 Top의 위치(Peek) : "+st.peek());//현재위치 보여줌	1보여줌	
		st.push(new String("everybody!"));
		System.out.println(st.peek());		
		st.push(new String("Nice Day!"));
		System.out.println(st.peek());

	}

}
