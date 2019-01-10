package service;

import java.util.ArrayList;

import domain.AccountBean;

public class ArticleServiceImpl implements ArticleService {
	
	private static ArticleServiceImpl instance = new ArticleServiceImpl();
	private ArticleServiceImpl() {
	}
	public static ArticleServiceImpl getInstance() {
		return instance;
	}

	@Override
	public void createContent(String tiltem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<AccountBean> seqList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AccountBean> TitleOfWriter(String Writer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean seq() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String makeRegdate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countSeq() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existSeq() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateContent(String writer, String pass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTitle(String writer, String pass) {
		// TODO Auto-generated method stub
		
	}

}