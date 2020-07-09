package pk30.reduce;

import java.util.Arrays;

public class ReduceTest {
	public static void main(String[] args) {
		//����ڰ� ����
		String [] greetings= {"�ȳ��ϼ���~~~","hello","Good morning","�ݰ����ϴ�^^^^"};
		
		//reduce���� (�ʱⰪ,�Ű�����,�����)
//		reduce("",(s1,s2)->
//		{if(s1.getBytes().length >= s2.getBytes().length) 
//								return s1;
//								else return s2;})
		//Stream ����
//		Arrays.stream(greetings).reduce("",(s1,s2)->
//		{if(s1.getBytes().length >= s2.getBytes().length) 
//								return s1;
//								else return s2;})
//		
		
		//reduce�� ����(�ʱⰪ,�Ű�����,�����)
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->
							{if(s1.getBytes().length >= s2.getBytes().length) 
													return s1;
													else return s2;}));

//=========================================================================================
		//BinaryOperator�� ������ Ŭ���� �̿�ǽ�
		//Ŭ������ �̿��Ҷ��� �ʱⰪ�� �����ȴ�
		String str=Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}
}
