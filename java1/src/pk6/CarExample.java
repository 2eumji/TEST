//필드활용
package pk6;
public class CarExample {
	
	public static void main(String[] args) {
		
		System.out.println("-------필드활용 1--------");
		Car car1=new Car(); //필드만 활용가능 ::클래스에서 초기화된것은 사용가능
		//car1.company="기아자동차"; //초기화된 필드에 값변경 가능
		System.out.println("car1.company :"+car1.company); //현대자동차
		System.out.println();
		
		System.out.println("-------필드활용 2--------");
		Car car2=new Car("소나타"); //초기화된것 + 입력된것 (2개)
		System.out.println("car2.company : "+car2.company);
		System.out.println("car2.model : "+car2.model);
		System.out.println();
		
		System.out.println("-------필드활용 3--------");
		Car car3= new Car("그랜저","그레이");//초기화된것 + 입력된것 (3개)
		System.out.println("car3.company : "+car3.company);
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);
		System.out.println();
		
		System.out.println("-------필드활용 4--------");
		Car car4= new Car("택시","검정",200);
		System.out.println("car4.company : "+car1.company);
		System.out.println("car4.model : "+car3.model);
		System.out.println("car4.color : "+car4.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);
		
	}

}
