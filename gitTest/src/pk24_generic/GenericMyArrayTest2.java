package pk24_generic;
class GnMyArray<E>{//Ŭ���� ��ü�� ���ʸ����� ������� ������ 
	private Object[] Garray=new Object[10];//�迭������ ���ʸ��� �ټ��¾���
	int i;
	public void add(E obj) {  //add�޼ҵ�: �ε����� ������ �ϳ��� �־��ְڴ�
		Garray[i++]=obj;
	}
	public E get(int index) {
		return (E)Garray[index];
	}
}
public class GenericMyArrayTest2 {

	public static void main(String[] args) {

		GnMyArray<String> GnmyArray1=new GnMyArray<String>();
		GnmyArray1.add(new String("test"));
		String str=GnmyArray1.get(0);
		System.out.println(str);
		
		GnMyArray<Integer> myArray2=new GnMyArray<Integer>();
		myArray2.add(new Integer(100));
		Integer num=myArray2.get(0);
		System.out.println(num);

	}

}
