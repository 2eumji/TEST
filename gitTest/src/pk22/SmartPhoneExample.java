package pk22;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone1;//이렇게 사용할수있음
		SmartPhone myPhone=new SmartPhone("삼성","안드로이드");
		
		String strObj=myPhone.toString();
		System.out.println(strObj);
	}

}
