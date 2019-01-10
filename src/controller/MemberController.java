package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberService memberService = MemberServiceImpl.getInstance();
		System.out.println("(1)멤버서블릿!!");
		/**
		 * 디폴트 값
		 * cmd : move
		 * dir : member
		 * page : main
		 * dest : NONE
		 * */
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move": cmd;
		System.out.println("(2)cmd :"+ cmd);
		
		String page = request.getParameter("page");
		if(page==null) {page = "main";}
		System.out.println("(3)page :"+page);
		
		String dir = request.getParameter("dir");
		if(dir == null) {
			String sPath = request.getServletPath();
			sPath = sPath.replace(".do", "");
			dir = sPath.substring(1);
		}
		System.out.println("(4)dir :"+dir);
		
		String dest = request.getParameter("dest");
		if(dest==null){
			dest = "NONE";
		}
		request.setAttribute("dest", dest);
		System.out.println("멤버컨트롤에서 dest : " + dest);
		/*
		 if(action==null){
			action = "move";
		}  = (action==null) ? "move":action   
		*/
		switch(cmd) {
		case "login":
			System.out.println("로그인 진입");
			MemberBean memberBean = null;
			String id = request.getParameter("uid");
			System.out.println("id==="+id);
			String pass = request.getParameter("upw");
			System.out.println("pass===="+pass);
			memberBean=memberService.findMemberById(id);
			//memberBean=MemberServiceImpl.getInstance().findMemberById(id);
			System.out.println("memberBean======"+memberBean);
			boolean ok = memberService.existMember(id, pass);
			System.out.println("ok======="+ok);
			if(ok) {
				dir = "home";
				dest = "welcome";
			}else {
				dir = "";
				page = "index";
				dest = "";
			}
			request.setAttribute("member", memberBean);
			System.out.println("dir"+dir);
			System.out.println("dest"+dest);
			break;
		case "move":
			request.setAttribute("dest", dest);
			break;
		case "join":
			memberBean = new MemberBean();
			memberBean.setName(request.getParameter("name"));
			memberBean.setSsn(request.getParameter("ssn"));
			memberBean.setId(request.getParameter("id"));
			memberBean.setPass(request.getParameter("pass"));
			memberService.joinMember(memberBean);
			memberService.findMemberById(request.getParameter("id"));
			System.out.println(">>>> 조회결과" + memberBean.toString());
			request.setAttribute("member",memberBean);
			request.setAttribute("dest", request.getParameter("dest"));
			break;
		case "logout":
			dir = "";
			page = "index";
			dest = "";
			break;
		}
		Command.move(request, response, dir, page);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}