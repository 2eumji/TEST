package pk25.treemap;

import pk_26_collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap membertreeMap = new MemberTreeMap();
		
		Member memberLee=new Member(1001,"ÀÌÁö¿ø");
		Member memberSon=new Member(1002,"¼Õ¹Î±¹");
		Member memberPark=new Member(1003,"¹Ú¼­ÈÍ");
		Member memberHong=new Member(1004,"È«±æµ¿");
		
		membertreeMap.addMember(memberLee);
		membertreeMap.addMember(memberSon);
		membertreeMap.addMember(memberPark);
		membertreeMap.addMember(memberHong);
		membertreeMap.showAllMember();
		
		Member memberdong=new Member(1004,"¹Ú±æµ¿");
		membertreeMap.addMember(memberLee);
		membertreeMap.removeMember(1003);
		membertreeMap.showAllMember();

	}

}
