package pk22;

public class StringTest {

	public static void main(String[] args) {
		
		String str="";
		String str1="Hi everybody";
		String str2="Have a nice Day!";
		
		str=str1+str2;
		System.out.println(str);
		System.out.println("str1 글자수 : "+str1.length());
		System.out.println("str1의 d글자 위치"+str1.indexOf("d")); //d가 몇번째에 있는지
		System.out.println("str1 모두 소문자로 변환 : "+str1.toLowerCase());
		System.out.println("str1 모두 대문자로 변환 : "+str1.toUpperCase());
		
		System.out.println(str2.concat(" thank you so much"));
		System.out.println(str2.repeat(2));
		
	}	
}
