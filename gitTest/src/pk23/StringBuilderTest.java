package pk23;

public class StringBuilderTest {

	public static void main(String[] args) {
		//immutable 불변(원본)
		String javaStr=new String("java");
		System.out.println("javaStr의 메모리 주소: " + System.identityHashCode(javaStr));
		//String으로부터 받아서 StringBuilder로 재구성해 활용가능하게...
		StringBuilder buffer=new StringBuilder(javaStr);
		//연산이 이루어지기 전 원본 hash값
		System.out.println("연산 전 Buffer의 메모리 주소: " + System.identityHashCode(buffer));
		buffer.append(" and "); //덧붙이기
		buffer.append("android");
		buffer.append(" programming is fun!");
		System.out.println("연산 후 Buffer의 메모리 주소: " + System.identityHashCode(buffer));		
		
		javaStr=buffer.toString();
		System.out.println(javaStr);
		
		System.out.println("새로 만들어진 javaStr의 메모리 주소: " + System.identityHashCode(javaStr));
	}

}
