package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.AccountBean;
import service.AccountService;
import service.AccountServiceImpl;

/**
 * Servlet implementation class AccountController
 */
@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccountService accountService = new AccountServiceImpl();
		System.out.println("어카운트 서블릿!!!");
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move": cmd;
		System.out.println("(2)cmd :"+ cmd);
		
		String page = request.getParameter("page");
		page = (page==null) ? "main" : page;
		System.out.println("(3)page :"+page);
		
		String dir = request.getParameter("dir");
		if(dir == null) {
			String sPath = request.getServletPath();
			sPath = sPath.replace(".do", "");
			dir = sPath.substring(1);
		}
		System.out.println("(4)dir :"+dir);
		/*
		 if(action==null){
			action = "move";
		}  = (action==null) ? "move":action   
		*/
		switch(cmd){
		case "move" :
			 String dest = request.getParameter("dest"); 
			 dest = (dest==null) ? "NONE":dest;
			 request.setAttribute("dest", dest);
			 System.out.println("어카운트서블릿에서의 des: "+dest);
			 Command.move(request, response, dir, page);
			break;
		case "open-account" :
			String money = request.getParameter("money");
			String accNum = accountService.createAccount(Integer.parseInt(money));
			AccountBean acc = accountService.findAccountNum(accNum);
			request.setAttribute("acc", acc);
			
			dest = request.getParameter("dest");
			request.setAttribute("dest", dest);
			System.out.println("222어카운트서블릿에서의 des: "+dest);
			Command.move(request, response, dir, page);
		case "account-detail":
			
			break;
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}