package collection.arrayList;

import java.util.ArrayList;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
//		ArrayList<Member> arrayList = new ArrayList<>();
//		
//		arrayList.add(new Member(100, "aaa"));
//		arrayList.add(new Member(200, "bbb"));
//		arrayList.add(new Member(300, "ccc"));
//		
//		for(Member member : arrayList) {
//			System.out.println(member);
//		}
//		System.out.println( arrayList);
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		memberArrayList.addMember(new Member(1001, "������"));
		memberArrayList.addMember(new Member(1002, "�չα�"));
		memberArrayList.addMember(new Member(1003, "�ڼ���"));
		memberArrayList.addMember(new Member(1003, "ȫ�浿"));
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(1002);
		memberArrayList.showAllMember();
	}

}
