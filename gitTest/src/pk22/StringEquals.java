package pk22;

public class StringEquals {
	
		public static void main(String[] args) {
			String str1 = new String ("abc");
			String str2 = new String ("abc");
			
			System.out.println(str1==str2); //두 String 인스턴스 주소값(heap)이 다름
			//String 클래스의 equals메소드가 재저으이 되어 논리적 값이 같음을 구현
			System.out.println(str1.equals(str2));
			
			
			Integer i1=new Integer(100); //취소선 :: 곧 바뀔것이다(업데이트예고)
			Integer i2=new Integer(100);
			
			System.out.println(i1==i2);
			System.out.println(i1.equals(i2));
			
			
		}
}
