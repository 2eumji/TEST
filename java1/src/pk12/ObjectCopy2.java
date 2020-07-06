package pk12;
//깊은 복사
public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("태백산맥","조경래");
		bookArray1[1]=new Book("데미안","헤르만 헤세");
		bookArray1[2]=new Book("개미","베르나르 베르베르");
		
		bookArray2[0]=new Book(); //객체 직접생성
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		//하나씩 직접 넣어서 복사해주기
		for(int i=0;i<bookArray1.length;i++) {
			bookArray2[i].setBookname(bookArray1[i].getBookname());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
		}
		
		//-----------------------------------------------------
		//변경시킨 bookArray1에만 적용되고 bookArray2에는 적용 안됨
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
