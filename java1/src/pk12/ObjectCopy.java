package pk12;
//배열 : 얕은복사
public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("태백산맥","조경래");
		bookArray1[1]=new Book("데미안","헤르만 헤세");
		bookArray1[2]=new Book("개미","베르나르 베르베르");
		
		System.arraycopy(bookArray1, 0,bookArray2, 0,3);
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
		}
		
		// 원본을 수정하면 복사한 배열의 값도 변경됨 (얕은복사) :링크되어있음
		bookArray1[0].setBookname("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("=======BookArray1=======");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookinfo();
		}
		
		System.out.println("=======BookArray2=======");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
		}
	}
}
