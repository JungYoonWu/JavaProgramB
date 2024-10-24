package kr.ac.kopo.day07.exam;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.List;

public class MemberDAOImpl implements MemberDAO{

	@Override
	public void saveMemberListToTXT(List<MemberVO> memberList) throws Exception {
		String fileName = "memberDB.txt";
		try(
			FileWriter fw = new FileWriter(fileName)
		) {
			for(MemberVO member : memberList) {
				fw.write(member.getName() + ",");
				fw.write(member.getAge() + ",");
				fw.write(member.getPhone() + ",");
				fw.write(member.getAddr() + ",");
				fw.write(member.getSex() + ",");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void saveMemberListToObj(List<MemberVO> memberList) throws Exception {
		String fileName = "memberDB.obj";
		try (
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		){
			oos.writeObject(memberList);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
