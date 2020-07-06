package pk12;

public class CharArray1 {

	public static void main(String[] args) {
		
		char[] alpahabets=new char[26];
		char ch='a'; //char..아스키코드
		
		for(int i=0;i<alpahabets.length;i++,ch++) { //ch도 같이 증가함
			alpahabets[i]=ch;
		}
		
		for(int i=0;i<alpahabets.length;i++) { 
			System.out.println(alpahabets[i]+","+(int)alpahabets[i]);
		}
	}
}
