package chapter22;

//HashMap 
public class Key {
	public int number;
	public Key(int number){
		this.number=number;
	}
	//데이터베이스에서 비교해서 값을 가져올때 많이 사용
	@Override //equals 오버라이딩 (논리적인 주소를 같게만듬 Object의 equals를 사용해서)
				//Object의 equals를 쓰고싶은데  오버로딩을 할수없으니까(픽스되어있어서) 바로비교를 못하고
				//오버라이딩(안에 내용변경)으로 오브젝트의 객체를 내가 생성한 클래스(Key)로 다운캐스팅을 해준 뒤
				//비교를 해준다
	public boolean equals(Object obj) { //<<-오브젝트클래스에 정해져있는 equals메소드
		
		if(obj instanceof Key) { //둘 다 객체가 있냐(메모리를가지고있냐)? 있으면-->if안으로
			Key compareKey=(Key)obj; //비교를 위해 두개
			if(number==compareKey.number) { //받은number의 값과 Object obj의 값과 같냐
				return true;
			}else {
				return false;
			}
		}
		return false;//객체가 없으면 false
	}
	@Override
	public int hashCode() {	//hashcode 오버라이딩 (물리적인 주소를 같게만듬)
		return number;
	}
}
