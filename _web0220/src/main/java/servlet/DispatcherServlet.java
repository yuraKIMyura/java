package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDao;
import dto.Board;

/**
 * Servlet implementation class DispatcherServlet
 */

//@WebServlet("*.do")
//이렇게 해두면 주소를 공개하지 않고 웹페이지를 이동 시킬 수 있다!
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println(uri);
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println(path);
		if(path.equals("/view.do")) {
			System.out.println("뷰처리");
			int num = Integer.parseInt(request.getParameter("num")); 
			BoardDao dao = BoardDao.getInstance();
			Board board = dao.selectOne(num, true);
			
		    request.setAttribute("board", board);
		    RequestDispatcher dispatcher 
		       = request.getRequestDispatcher("/WEB-INF/view/view.jsp");
		    dispatcher.forward(request, response);

			
		}else if(path.equals("/list.do")) {
			System.out.println("list처리");
		}
	}

}
