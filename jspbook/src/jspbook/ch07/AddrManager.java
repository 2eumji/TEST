package jspbook.ch07;

import java.util.ArrayList;
import java.util.List;

public class AddrManager {
	//주소록 목록을 관리하기 위한 ArrayList
	List<AddrBean> addrlist = new ArrayList<AddrBean>();
	
	//주소록 추가 메서드 : add메소드의 매개변수로 AddrBean의 객체 ab를 활용하여 List에 추가
	public void add(AddrBean ab) {
		addrlist.add(ab);
	}
	//주소록 목록 전달 메서드 추가한 리스트 보내는 함수
	public List<AddrBean> getAddrList(){
		return addrlist;
	}
	//특정 사용자를 주소록 목록에서 검색하는 메서드
	public AddrBean getAddr(String username){
		for(AddrBean ab: addrlist) {
			if(ab.getUsername().equals(username)) {
				return ab;
			}
		}
		return null;
	}
	
}
