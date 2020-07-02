package pk23;

class StBufferTest {
		
	public static void main(String[] args) {
		//String은 문자열 변경이 안됨
		//계속해서 변경해서 사용해야할때는 StringBuffer를 사용
		StringBuffer buf=new StringBuffer("Nice Day");
		System.out.println(buf.toString());
		System.out.println(buf.length());
		System.out.println(buf.capacity()); //용량
		buf.ensureCapacity(100);//용량증가
		System.out.println(buf.capacity());
		buf.insert(0, "HI!");
		buf.insert(11, "Everybody");
		System.out.println(buf);
		buf.delete(0, 3);
		System.out.println(buf);
	}	

}
