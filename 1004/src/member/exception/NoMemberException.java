package member.exception;

public class NoMemberException extends Exception{
	
	//기본생성자
	public NoMemberException() {
		
	}
	
	//메시지 전달 생성자
	public NoMemberException(String id) {
		super("일치하는 id가 없습니다." + id);
	}
}
