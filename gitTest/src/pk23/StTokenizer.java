package pk23;

//StringTokenizer (������ split) :: 
import java.util.StringTokenizer;
public class StTokenizer {
	public static void main(String[] args) {
		String str="Hava a Nice Day";
		//(�ڸ��� ���� ���ڿ�, �ڸ��� ���ع����� ����,�ڸ��� ������ ������ ����true,false)
		StringTokenizer obj=new StringTokenizer(str," ",false);
		
		//StringTokenizer.hasMoreToken() -��ū�� ����Ǿ��ִ� �迭 
		while(obj.hasMoreTokens()) { //**
			String t=obj.nextToken(); //**
			System.out.println(t);
		}
	}
}
