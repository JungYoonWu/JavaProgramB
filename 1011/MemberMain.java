package kr.ac.kopo.day07.exam;

import java.util.ArrayList;
import java.util.List;

public class MemberMain {
	public static void main(String[] args) throws Exception{
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		MemberDAO memberDao = new MemberDAOImpl();
		memberList.add(new MemberVO("정윤우", 32, "010-1111-2222", "용인","남"));
		memberList.add(new MemberVO("안형욱", 36, "010-1234-2222", "성남","남"));
		memberList.add(new MemberVO("김해준", 20, "010-4231-1234", "성남","남"));
		memberList.add(new MemberVO("이예은", 25, "010-5467-4522", "분당","여"));
		memberList.add(new MemberVO("이국정", 26, "010-6666-1345", "서울","남"));
		memberList.add(new MemberVO("김효동", 29, "010-5555-5812", "성남","남"));
		memberList.add(new MemberVO("조시현", 28, "010-5134-7821", "서울","여"));
		
//		memberDao.saveMemberListToTXT(memberList);
		memberDao.saveMemberListToObj(memberList);
	}
}
