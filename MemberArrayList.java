package collection.arrayList;

import java.util.ArrayList;
import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for( Member member : arrayList){
			if( member.getMemberId() == memberId) {
				arrayList.remove(member);
			    return false;
			}
		}
		return false;
	}
	
	public void showAllMember() {
		for( Member member : arrayList) {
			System.out.println(member);
		}
	}
}
