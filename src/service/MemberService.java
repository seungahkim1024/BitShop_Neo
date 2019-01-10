package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {

	public void joinMember(MemberBean memberBean);
	public ArrayList<MemberBean> Memberlist();
	public ArrayList<MemberBean> findByName(String name);
	public MemberBean findMemberById(String id);
	public int countMembers();
	public boolean existMember(String id, String pass);
	public void updatePass(String id, String pass, String newPass);
	public void deleteMember(String id, String pass);
}
