package pk12;

public class ArrayTest {

	public static void main(String[] args) {
		//int[] number=new int[] {1,2,3,4,5,6,7,8,9,10};
		//int arr[]= {10,20,30,40,50};
		
		double[] data=new double[5];
		int size=0;
		
		data[0]=10.0;
		size++;
		data[1]=20.0;
		size++;
		data[2]=30.0;
		size++;
		
		for(int i=0;i<size;i++) {
			System.out.print(data[i]+" ");
		}
		
	/*	for(int i=0;i<number.length;i++) {
			System.out.print(number[i]);
		}*/

	}
}
