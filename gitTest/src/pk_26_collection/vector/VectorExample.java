package pk_26_collection.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list=new Vector<Board>(); //BoardŸ������List ����
		
		list.add(new Board("å����1","����1","�۰�1"));
		list.add(new Board("å����2","����2","�۰�2"));
		list.add(new Board("å����3","����3","�۰�3"));
		list.add(new Board("å����4","����4","�۰�4"));
		list.add(new Board("å����5","����5","�۰�5"));
		
		//Vector for������....
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
