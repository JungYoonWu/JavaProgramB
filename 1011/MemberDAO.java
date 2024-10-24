package kr.ac.kopo.day07.exam;

import java.util.List;

public interface MemberDAO {
	
	/**
	 * memberList에 저장된 회원정보를 .txt파일로 저장하는 메소드
	 * @param memberList
	 * @throws Exception
	 */
	void saveMemberListToTXT(List<MemberVO> memberList) throws Exception;
	
	/**
	 * memberList에 저장된 회원정보를 .obj파일로 저장하는 메소드
	 * @param memberList
	 * @throws Exception
	 */
	void saveMemberListToObj(List<MemberVO> memberList) throws Exception;
}
