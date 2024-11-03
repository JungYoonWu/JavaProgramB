package member.app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import member.exception.NoMemberException;
import member.service.MemberService;
import member.service.MemberServiceImpl;
import member.vo.MemberVO;


public class MemberApplication {

	static Map<String, MemberVO> memberMap = MemberServiceImpl.loadMembersFromFile();
	
	private static Scanner input = new Scanner(System.in);
	
	private static String[] menuList = {
		"1.회원등록",
		"2.회원탈퇴",
		"3.로그인",
		"4.로그아웃",
		"5.회원정보",
		"0.종료"
	};
	
	public static void main(String[] args) {
		startApp();
	}
	
	public static int inputNumberWithValidation() throws IOException{
		try {
			int num = Integer.parseInt(input.nextLine());
			return num;
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요 : ");
			return inputNumberWithValidation();
		}
	}
	
	public static void showMenuList() {
		System.out.println("---------------------------------------------------------");
		for(String menu : menuList) {
			System.out.printf("%s | ", menu);
		}System.out.println();
		System.out.println("---------------------------------------------------------");
	}
	
	static void startApp() {
		MemberService ms = new MemberServiceImpl();
		int menuNum = 0;
		try {
			do {
				showMenuList();
				menuNum = inputNumberWithValidation();
				
				switch(menuNum) {
				case 1:
					regist(ms);
					break;
				case 2:
					remove(ms);
					break;
				case 3:
					login(ms);
					break;
				case 4:
					logout(ms);
					break;
				case 5:
					info(ms);
					break;
				case 0:
					exit();
					break;
				default :
					System.out.println("메뉴에 없는 번호 입니다. 올바른 번호를 입력하세요.");
					break;
				}
			}while(menuNum != 0);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	private static void exit() {
		System.out.println("종료합니다.");
	}

	private static void info(MemberService ms) throws NoMemberException{
		System.out.println("---------------------------------------------------------");
		System.out.println("\t\t회원 정보");
		System.out.println("---------------------------------------------------------");
		String id = scanStr("ID : ");
		String password = scanStr("비밀번호 : ");
		MemberVO member = ms.info(id, password);
		if(member != null) {
			System.out.println(member);
		}else {
			throw new NoMemberException(id);
		}
		
	}

	private static void logout(MemberService ms) throws NoMemberException{
		System.out.println("---------------------------------------------------------");
		System.out.println("\t\t로그아웃");
		System.out.println("---------------------------------------------------------");
		String id = scanStr("ID : ");
		if(ms.logout(id)) {
			System.out.println("로그아웃 성공");
		}else {
			throw new NoMemberException(id);
		}
	}

	private static void login(MemberService ms) throws NoMemberException{
		System.out.println("---------------------------------------------------------");
		System.out.println("\t\t로그인");
		System.out.println("---------------------------------------------------------");		
		String id = scanStr("ID : ");
		String password = scanStr("비밀번호 : ");
		if(ms.login(id, password)) {
			System.out.println("로그인 성공");
		}else {
			throw new NoMemberException(id);
		}
	}

	private static void remove(MemberService ms) throws NoMemberException{
		System.out.println("---------------------------------------------------------");
		System.out.println("\t\t회원 탈퇴");
		System.out.println("---------------------------------------------------------");
		String id = scanStr("회원 ID : ");
		
		if(memberMap.remove(id) == null) {
			throw new NoMemberException(id);
		}
		ms.remove(id);
		
	}

	private static void regist(MemberService ms) {
		displayMsg("---------------------------------------------------------");
		displayMsg("\t\t회원 가입");
		displayMsg("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		String id = scanStr("ID : ");
		String password = scanStr("비밀번호 : ");
		String name = scanStr("이름 : ");
		String phone = scanStr("전화번호 : ");
		String email = scanStr("이메일 : ");
		
		MemberVO member = new MemberVO(id, password, name, phone, email);
		ms.regist(member);
	}
	
	private static void displayMsg(String msg) {
		System.out.println(msg);
	}
	
	private static String scanStr(String msg) {
		System.out.print(msg);
		return input.nextLine();
	}
	
	private static int scanInt(String msg) {
		return Integer.parseInt(scanStr(msg));
	}
}
