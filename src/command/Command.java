package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pool.Constant;

public class Command {
	public static void move(HttpServletRequest request, 
			HttpServletResponse response, String dir, String page) throws ServletException, IOException{
		System.out.println("커멘드진입!!!");
		String dispatcher = "";
		if(page.equals("index")){
			dispatcher = "index"+Constant.JSP;
		}else {
		dispatcher =Constant.VIEW+dir+"/"+page+Constant.JSP;
		}
		System.out.println(">>>>>>>>"+dispatcher);
		request.getRequestDispatcher(dispatcher).forward(request, response);
		
		
		/*request.getRequestDispatcher((page.equals("index"))?
		 	"index"+Constant.JSP : Constant.VIEW + dir+"/"+page+Constant.JSP)
		 	.forward(request, response);*/
		
	}
}