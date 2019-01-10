package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domain.MemberBean;
import factory.DatabaseFactory;

public class MemberDAOImpl implements MemberDAO {

	private static MemberDAOImpl instance = new MemberDAOImpl();
	private MemberDAOImpl() {
	}
	public static MemberDAOImpl getInstance() {
		return instance;
	}

	public void insertMember(MemberBean memberBean) {
		try {
			int rs = DatabaseFactory
			.createDatabase("oracle")
			.getConnection()
			.createStatement()
			.executeUpdate(String.format("INSERT INTO member(id, name, pass, ssn) \n"
					+ "VALUES('%s', '%s', '%s', '%s')", 
							memberBean.getId(), memberBean.getName(), memberBean.getPass(), memberBean.getSsn()));
			if(rs==1){
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String VALUES(String string, String id, String name, String pass, String ssn) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<MemberBean> selectMembers() {
		try {
			DatabaseFactory.createDatabase("oracle")
			.getConnection()
			.createStatement()
			.executeQuery(String.format("", ""));
		/*	Class.forName(Constant.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constant.ORACLE_URL, Constant.USERNAME, Constant.PASSWORD);
			stmt = conn.createStatement();*/

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<MemberBean> selectMemberByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			ResultSet rs = DatabaseFactory.createDatabase("oracle")
			.getConnection()
			.createStatement()
			.executeQuery(String.format("",""));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		MemberBean memberBean = null;
		try {
			ResultSet rs = DatabaseFactory.createDatabase("oracle")
			.getConnection()
			.createStatement()
			.executeQuery(String.format("SELECT * FROM member \n"
					+ "WHERE id LIKE '%s'",id));
			while(rs.next()){
				memberBean = new MemberBean();
				memberBean.setId(rs.getString("id"));
				memberBean.setName(rs.getString("name"));
				memberBean.setPass(rs.getString("pass"));
				memberBean.setSsn(rs.getString("ssn"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return memberBean;
	}
	
	@Override
	public int countMembers() {
		
		return 0;
	}

	@Override
	public void updatePass(String id, String pass, String newPass) {
		
	}

	@Override
	public void deleteMember(String id, String pass) {

	}
}