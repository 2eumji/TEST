//Vector
package pk_26_collection.vector;
import java.util.Vector;
public class VectorTest {
	//사이즈는 사용하는것만큼만 자동으로 추가 삭제해줌
	public static void main(String[] args) {
		Object obj;
		//크기2의 배열 선언
		Vector<Object> vec=new Vector<Object>(2);
		obj=10;
		vec.addElement(obj); //엘리먼트 추가
		//vector 용량 수
		System.out.println("용량 #1 : "+vec.capacity());
		//vector 엘리먼트 수
		System.out.println("크기 #1 : "+vec.size());
		System.out.println();
		obj="Hi";
		vec.addElement(obj);//엘리멘트추가
		System.out.println("용량 #2 : "+vec.capacity());
		System.out.println("크기 #2 : "+vec.size());
		System.out.println();
		obj="Nice day";
		vec.addElement(obj);//엘리멘트추가
		System.out.println("용량 #3 : "+vec.capacity());
		System.out.println("크기 #3 : "+vec.size());
	}

}
