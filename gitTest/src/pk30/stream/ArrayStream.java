package pk30.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStream {

	public static void main(String[] args) {
	
		int[] arr= {1,2,3,4,5};
		Arrays.stream(arr).forEach(n->System.out.print(n+" "));
		int sum=Arrays.stream(arr).sum();
		System.out.println("arr의 합계 :"+sum);
		System.out.println();
		
		
		//객체이름 : list
		List<Integer> list=new ArrayList<Integer>();
		for(Integer i:arr) {
			list.add(i);
		}
		/*
		 * list.add(1);
		 * list.add(2);
		 * list.add(3);
		 * list.add(4);
		 * list.add(5);
		 * */
		int sum2=list.stream().mapToInt(n->n.intValue()).sum();
		System.out.println("ArrayList의 합계 : "+sum2);
		
		
	}

}
