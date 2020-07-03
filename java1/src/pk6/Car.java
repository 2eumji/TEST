package pk6;

public class Car {
	//필드 (멤버변수)
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자  클래스를 여러개 만드는거나 마찬가지 (편리성)
	//인자값을 보고 자동으로 어떤생성자인지 골라줌
	Car(){}
	
	Car(String model){
		this.model=model;
	}
	Car(String model, String color){
		this.model=model;
		this.color=color;
	}
	Car(String model, String color,int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	//메소드
	
	

}
