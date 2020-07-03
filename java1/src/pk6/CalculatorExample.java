package pk6;

public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculator myCalc=new Calculator();
		
		
		myCalc.powerOn();
		System.out.println(myCalc.plus(10, 55));
		System.out.printf("%d / %d = %.2f \n",55,10,myCalc.divide(55, 10));
		myCalc.powerOff();
		

	}

}
