package pk12;

//배열의 복사 System.arraycopy(arry1, 0, arry2, 1, 4);
public class ArrayCopy {

	public static void main(String[] args) {
		
		int [] arry1= {10,20,30,40,50};
		int [] arry2= {1,2,3,4,5};
		
		System.arraycopy(arry1, 0, arry2, 1, 4);
		for(int i=0;i<arry2.length;i++) {
			System.out.println(arry2[i]);
		}
	}
}
