package service;

import java.util.ArrayList;

import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService {
	
		private static MemberServiceImpl instance = new MemberServiceImpl();
		private MemberServiceImpl() {
			dao = MemberDAOImpl.getInstance();
		}
		public static MemberServiceImpl getInstance() {
			return instance;
		}
	
		
		MemberDAOImpl dao;
		
		
		
	@Override
	public void joinMember(MemberBean memberBean) {
		dao.insertMember(memberBean);
	}

	@Override
	public ArrayList<MemberBean> Memberlist() {
		ArrayList<MemberBean> list = new ArrayList<MemberBean>();
		list = dao.selectMembers();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<MemberBean>();
		list = dao.selectMemberByName(name);
		return list;
	}

	@Override	
	public MemberBean findMemberById(String id) {
		MemberBean memberBean = new MemberBean();
		memberBean = dao.selectMemberById(id);
		return memberBean;
	}

	@Override
	public int countMembers() {
		int count = dao.countMembers();
		return count;
	}

	@Override
	public boolean existMember(String id, String pass) {
		MemberBean memberBean = new MemberBean();
		memberBean = dao.selectMemberById(id);
		boolean ok = false;
		if(memberBean==null){
			ok = false;
		}else{
			if(id.equals(memberBean.getId()) &&
					pass.equals(memberBean.getPass())){
				ok = true;
			}
		}
		System.out.println("ok====="+ok);
		return ok;
}

	@Override
	public void updatePass(String id, String pass, String newPass) {
		dao.updatePass(id, pass, newPass);
	}

	@Override
	public void deleteMember(String id, String pass) {
		dao.deleteMember(id, pass);
	}
}