package dao;

public class AccountDAOImpl implements AccountDAO{
	
	private static AccountDAOImpl instace = new AccountDAOImpl();
	private AccountDAOImpl() {
	}
	public static AccountDAOImpl getInstace() {
		return instace;
	}
}