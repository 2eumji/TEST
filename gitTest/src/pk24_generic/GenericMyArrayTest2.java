package pk24_generic;
class GnMyArray<E>{//클래스 전체를 제너릭으로 만들수는 있지만 
	private Object[] Garray=new Object[10];//배열각각을 제너릭을 줄수는없음
	int i;
	public void add(E obj) {  //add메소드: 인덱스에 차레로 하나씩 넣어주겠다
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
