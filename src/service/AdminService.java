package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {
	//adminNum, name, pass, auth
	
	public void createAdminNum();
	
	public ArrayList<AdminBean> findList();
	public ArrayList<AdminBean> findName();
	public AdminBean findAdminNum();
	public int countAdmin();
	public boolean existAdminNum();
	
	public void updateAuth();
	
	public void deleteAdminNum();
	
}
