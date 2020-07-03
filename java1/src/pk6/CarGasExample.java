package pk6;

public class CarGasExample {
	public static void main(String[] args) {
		
		CarGas myCarGas=new CarGas();
		
		//CarGas의 setGas()메소드 호출
		myCarGas.setGas(5);
		
		//CarGas의 isLeftGas()메소드 호출
		
		boolean gasState=myCarGas.isLeftGas();
		
		//CarGas의 run() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다");
			myCarGas.run();
		}else {
			System.out.println("멈춥니다.");
		}
		//주유의 필요 유무
		if (myCarGas.isLeftGas()){
				System.out.println("gas 잔여량이 남아있습니다");
				//CarGas의 run() 메소드 호출
		}else {
			System.out.println("주유가 필요합니다");
		}
	}

}
