package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeset = new MemberTreeSet();
		
		Member memberLee = new Member(102,"이순신");
		Member memberKim = new Member(101,"김유신");
		Member memberShin = new Member(103,"신사임당");
		
		memberTreeset.addMember(memberLee);
		memberTreeset.addMember(memberKim);
		memberTreeset.addMember(memberShin);
		
		memberTreeset.showAll();
		
		Member memberLee2 = new Member(101,"이몽룡");
		memberTreeset.addMember(memberLee2);
		memberTreeset.showAll();
	}

}
