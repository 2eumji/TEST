package pk23;

//StringTokenizer (유연한 split) :: 
import java.util.StringTokenizer;
public class StTokenizer {
	public static void main(String[] args) {
		String str="Hava a Nice Day";
		//(자르고 싶은 문자열, 자르는 기준문자의 집합,자르는 기준을 넣을지 말지true,false)
		StringTokenizer obj=new StringTokenizer(str," ",false);
		
		//StringTokenizer.hasMoreToken() -토큰이 저장되어있는 배열 
		while(obj.hasMoreTokens()) { //**
			String t=obj.nextToken(); //**
			System.out.println(t);
		}
	}
}
