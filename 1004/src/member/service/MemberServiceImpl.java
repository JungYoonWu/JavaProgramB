package member.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import member.vo.MemberVO;

public class MemberServiceImpl implements MemberService{

	private static final String FILE_NAME = "member.txt"; 
	private static Set<String> logInUsers = new HashSet<String>();
	private static Map<String, MemberVO> memberMap = loadMembersFromFile();
	
	@Override
	public void regist(MemberVO member) {
		if(memberMap.containsKey(member.getId())) {
			System.out.println("이미 존재하는 ID입니다.");
		}else {
			memberMap.put(member.getId(), member);
			saveMemberToFile();
			System.out.println("회원등록");
		}
	}



	@Override
	public void remove(String id) {
		if(memberMap.remove(id) != null) {
			saveMemberToFile();
			System.out.println("회원 탈퇴");
		}else {
			System.out.println("일치하는 회원이 없습니다.");
		}
	}

	@Override
	public boolean login(String id, String password) {
		MemberVO member = memberMap.get(id);
		if(member != null && member.getPassword().equals(password)) {
			logInUsers.add(id);
			return true;
		}
		return false;
	}

	@Override
	public boolean logout(String id) {
		return logInUsers.remove(id);
	}

	@Override
	public MemberVO info(String id, String password) {
		MemberVO member = memberMap.get(id);
		if(member != null && member.getPassword().equals(password)) {
			return member;
		}
		return null;
	}
	
	private void saveMemberToFile() {
		try (
			FileOutputStream fos = new FileOutputStream(FILE_NAME);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		){
			oos.writeObject(memberMap);
		} catch (Exception e) {
			System.out.println("회원 정보 저장이 완료되지 않았습니다.");
			System.out.println(e.toString());
		}
	}
	
	public static Map<String, MemberVO> loadMembersFromFile() {
		try (
			FileInputStream fis = new FileInputStream(FILE_NAME);
			ObjectInputStream ois = new ObjectInputStream(fis);
		){
			return (Map<String, MemberVO>) ois.readObject();
		} catch (Exception e) {
			return new HashMap<>();
		}
	}
}
