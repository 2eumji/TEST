//람다식
package pk30.lambda;
public class TestAdd {
	public static void main(String[] args) {
		Add addF=(x,y)->x+y; //구현부 (인터페이스 있어야함)
//		public void add(int a, int b) {
//			System.out.println(a+b);
//		}
		System.out.println(addF.add(3, 5)); //실행부
	} 
}
