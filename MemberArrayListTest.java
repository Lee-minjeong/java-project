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
		
		memberArrayList.addMember(new Member(1001, "이지원"));
		memberArrayList.addMember(new Member(1002, "손민국"));
		memberArrayList.addMember(new Member(1003, "박서훤"));
		memberArrayList.addMember(new Member(1003, "홍길동"));
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(1002);
		memberArrayList.showAllMember();
	}

}

/* Collection 인터페이스는 하나의 객체를 관리하기 위한 메서드가 정의된 인터페이스로, 하위에 List와 Set 인터페이스가 있다.
List 인터페이스는 순서가 있는 자료 관리, 중복 허용을 하며 Set 인터페이스는 순서가 정해져 있지 않고 중복을 허용하지 않는다.
여러 클래스들이 Collection 인터페이스를 구현한다.
MemderArrayList 클래스와 같이 직접 회원을 추가하고 삭제하며 프로그램이 잘 구현되었는지 확인해 본다. 이렇듯이 MemberArrayListTest 클래스를 만든다. 
새로운 회원 인스턴스를 생성하여 memberArrayList에 회원을 추가한다. showAllMember로 전체 회원을 출력한다. 그리고 removeMember(1002)로 Id가 1002인 
"박서훤"회원을 삭제한다. 그리고 다시 showAllMember로 박서훤 회원을 삭제한 후 다시 전체 회원을 출력한다. */
