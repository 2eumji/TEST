package pk_26_collection.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list=new Vector<Board>(); //Board타입으로List 구성
		
		list.add(new Board("책제목1","내용1","작가1"));
		list.add(new Board("책제목2","내용2","작가2"));
		list.add(new Board("책제목3","내용3","작가3"));
		list.add(new Board("책제목4","내용4","작가4"));
		list.add(new Board("책제목5","내용5","작가5"));
		
		//Vector for문으로....
		for (int i=0;i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject + "\t"+board.content+"\t"+board.writer);
		}
		
		System.out.println();
		list.remove(2);
		list.remove(3);
		
		for (int i=0;i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject + "\t"+board.content+"\t"+board.writer);
		}
	}

}
