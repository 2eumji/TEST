package pk12;

public class CharArray1 {

	public static void main(String[] args) {
		
		char[] alpahabets=new char[26];
		char ch='a'; //char..�ƽ�Ű�ڵ�
		
		for(int i=0;i<alpahabets.length;i++,ch++) { //ch�� ���� ������
			alpahabets[i]=ch;
		}
		
		for(int i=0;i<alpahabets.length;i++) { 
			System.out.println(alpahabets[i]+","+(int)alpahabets[i]);
		}
	}
}
