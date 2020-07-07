package pk_26_collection.treeset;
import java.util.Comparator;

import pk_26_collection.Member;
public class TreesetCompare implements Comparator<Member>  {

	@Override
	public int compare(Member m1, Member m2) {
		return (m1.compareTo(m2))* -1;
	}
	
	
	
}
