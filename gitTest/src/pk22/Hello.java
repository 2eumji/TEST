package pk22;

import javax.swing.JOptionPane;

public class Hello {
	public static void main(String[] args) {
		
		String str1="";
		String str2="";
		Double num1,num2;
		char ch='A';
		
		num1=Double.parseDouble(JOptionPane.showInputDialog("값1")); //팝업 input창
		num2=Double.parseDouble(JOptionPane.showInputDialog("값2"));
		
		if(num2!=0) {
			System.out.println(num1/num2);
		}
		if(Character.isDigit(ch)) { //Character의 자료형구분 isDigit는 숫자인지..
			System.out.println(ch+"는 문자가 아닙니다.");
		}else {
			System.out.println(ch+"문자입니다.");
		}
	}
}
