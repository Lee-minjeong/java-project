package collection.arrayList;

import java.util.ArrayList;
import collection.Member;  //Member 클래스는 collection 패키지에 있으므로 사용하려면 import해야 한다.

public class MemberArrayList {
	private ArrayList<Member> arrayList;  //ArrayList 선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();  //Member형으로 선언한 ArrayList 생성
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}                                          //ArrayList에 회원을 추가하는 메서드
	
	public boolean removeMember(int memberId) {
		for( Member member : arrayList){
			if( member.getMemberId() == memberId) {   //회원 아이디가 매개변수와 일치하면
				arrayList.remove(member);   //해당 회원을 삭제
			    return false;
			}
		}
		return false;
	}
	
	public void showAllMember() {
		for( Member member : arrayList) {
			System.out.println(member);
		}
	}                                         //전체 회원을 출력하는 메서드
}

/* ArrayList를 사용하려면 import java.util.ArrayList를 선언해 주어야 한다. 7행에서 ArrayList를 선언하고 MemberArrayList() 생성자에서
ArrayList를 생성한다. 13~15행 addMember() 메서드에서는 매개변수로 전달된 회원을 ArrayList의 맨 뒤에 추가한다. 17~25행 removeMember() 메서드
에서는 매개변수로 전달받은 아이디(memberId) 회원을 ArrayList에서 찾아 제거한다. 
