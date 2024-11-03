package member.service;

import member.vo.MemberVO;

public interface MemberService {

	/**
	 * 회원등록 메소드
	 * @param member
	 */
	void regist(MemberVO member);
	
	
	/**
	 * 회원삭제 메소드
	 * @param id
	 */
	void remove(String id);

	
	/**
	 * id/password가 일치하면 로그인 성공
	 * @param id
	 * @param password
	 * @return
	 */
	boolean login(String id, String password);
	
	
	/**
	 * id를 로그아웃
	 * @param id
	 * @return
	 */
	boolean logout(String id);


	MemberVO info(String id, String password);
}
