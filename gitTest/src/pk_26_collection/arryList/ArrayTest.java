package pk_26_collection.arryList;

import java.util.Arrays;
import java.util.List;
public class ArrayTest {

	public static void main(String[] args) {
		int iArray[]= {50,40,30,20,10};
		String sArray[]=new String[5];
		
		System.out.println(Arrays.toString(iArray));//[50, 40, 30, 20, 10]
		//정렬 
		Arrays.sort(iArray);
		System.out.println(Arrays.toString(iArray));//[10, 20, 30, 40, 50]
		
		//채워주기
		Arrays.fill(sArray, "Hi");
		System.out.println(Arrays.toString(sArray));//[Hi, Hi, Hi, Hi, Hi]
		
		List<String> city=Arrays.asList("Seoul","Busan","Deajeon","Jeju");
		for(int i=0;i<city.size();i++) {
			System.out.print(city.get(i).toString()+" ");//Seoul Busan Deajeon Jeju 
		}
	}
}
