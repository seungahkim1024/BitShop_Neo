package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDAO {
	
	public void insertMember(MemberBean memberBean);
	
	public ArrayList<MemberBean> selectMembers();
	public ArrayList<MemberBean> selectMemberByName(String name);
	public MemberBean selectMemberById(String id);
	public int countMembers();
	public void updatePass(String id, String pass, String newPass);
	public void deleteMember(String id, String pass);

}