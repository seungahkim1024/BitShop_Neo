package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import domain.AccountBean;

public class AccountServiceImpl implements AccountService{
	private ArrayList<AccountBean> list;
	
	public AccountServiceImpl() {
		list = new ArrayList<>();
	}

	@Override
	public String createAccount(int money) {
		AccountBean account = new AccountBean();
		String accountNum = createAccountNum();
		account.setAccountNum(accountNum);
		account.setMoney(money);
		account.setToday(date());
		list.add(account);
		return accountNum;
	}

	@Override
	public ArrayList<AccountBean> findList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createAccountNum() {
		Random random = new Random();
		String res = "";
		for(int i=0; i<4; i++){
			res += random.nextInt(10);
		}
		return res;
	}

	@Override
	public AccountBean findAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		for(int i =0;i<list.size();i++){
			if(accountNum.equals(list.get(i).getAccountNum())){
				account = list.get(i);
			}
		}
		return account;
	}
	
	@Override
	public String date() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}

	@Override
	public int countAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccountNum() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deposit(String accountNum, int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(String accountNum, int money) {
		// TODO Auto-generated method stub
		
	}

}
