package kr.ac.kopo.day07.exam;

import java.io.Serializable;

public class MemberVO implements Serializable{

	private String name;
	private int age;
	private String phone;
	private String addr;
	private String sex;
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberVO(String name, int age, String phone, String addr, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.addr = addr;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "MemberVO [이 회원의 이름 : " + name + ", 나이 : " + age + ", 전화번호 : " + phone + ", 주소 : " + addr + ", 성별 : " + sex + "입니다.]";
	}
	
}
