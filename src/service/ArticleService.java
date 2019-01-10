package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface ArticleService {
	//title, content, writer, regdate, seq, pass;
	
	public void createContent(String tiltem);
	
	public ArrayList<AccountBean> seqList();
	public ArrayList<AccountBean> TitleOfWriter(String Writer);
	public AccountBean seq();
	public String makeRegdate();
	public int countSeq();
	public boolean existSeq();
	
	public void updateContent(String writer, String pass);
	public void deleteTitle(String writer, String pass);
}