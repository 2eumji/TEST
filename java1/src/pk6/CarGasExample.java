package pk6;

public class CarGasExample {
	public static void main(String[] args) {
		
		CarGas myCarGas=new CarGas();
		
		//CarGas�� setGas()�޼ҵ� ȣ��
		myCarGas.setGas(5);
		
		//CarGas�� isLeftGas()�޼ҵ� ȣ��
		
		boolean gasState=myCarGas.isLeftGas();
		
		//CarGas�� run() �޼ҵ� ȣ��
		if(gasState) {
			System.out.println("����մϴ�");
			myCarGas.run();
		}else {
			System.out.println("����ϴ�.");
		}
		//������ �ʿ� ����
		if (myCarGas.isLeftGas()){
				System.out.println("gas �ܿ����� �����ֽ��ϴ�");
				//CarGas�� run() �޼ҵ� ȣ��
		}else {
			System.out.println("������ �ʿ��մϴ�");
		}
	}

}
