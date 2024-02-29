package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvjsp.board.dao.MemberDao;
import mvjsp.board.model.Member;
import mvjsp.jdbc.connection.ConnectionProvider;

/**
 * Servlet implementation class Controller
 */
//@WebServlet("*.do") //이것 때문에 mvc의 controller와 충돌 일어나니까 주석처리해버리자
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			process(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			process(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println(path);
		
		if(path.equals("/list.do")) {
			//.jsp에 있던 java code 여기로 이동
			
			//아래 두 줄은 무조건
			Connection conn = ConnectionProvider.getConnection();
			MemberDao dao = MemberDao.getInstance();
			ArrayList<Member> list = dao.selectAll(conn);
			request.setAttribute("list", list);
			
			//form이 떠야 하므로 forwarding해야 한다
			RequestDispatcher dispatcher = request.getRequestDispatcher("list_view.jsp");
			dispatcher.forward(request, response);
			
		} else if (path.equals("/memberForm.do")) {
			//view로 가는 건 jsp로 둔다
			response.sendRedirect("memberForm.jsp");
			
		} else if (path.equals("/memberInput.do")) {
			//.jsp에 있던 java code 여기로 이동
			String id = request.getParameter("id");
			String email = request.getParameter("email");
			String name = request.getParameter("name");

			//아래 두 줄은 무조건
			Connection conn = ConnectionProvider.getConnection();
			MemberDao dao = MemberDao.getInstance();

			Member member = new Member(id, email, name);
			dao.insert(conn, member);
			
			//list로 보내버리자
			response.sendRedirect("list.do");
			
		}else if (path.equals("/updateForm.do")) {
			int memberno = Integer.parseInt(request.getParameter("memberno"));

			//아래 두 줄은 무조건
			Connection conn = ConnectionProvider.getConnection();
			MemberDao dao = MemberDao.getInstance();

			Member member = dao.selectOne(conn, memberno);
			request.setAttribute("member", member);
			
			//form이 떠야 하므로 forwarding해야 한다
			RequestDispatcher dispatcher = request.getRequestDispatcher("updateForm_view.jsp");
			dispatcher.forward(request, response);
		
		}else if(path.equals("/memberUpdate.do")) {
			int memberno = Integer.parseInt(request.getParameter("memberno"));
			String id = request.getParameter("id");
			String email = request.getParameter("email");
			String name = request.getParameter("name");

			//아래 두 줄은 무조건
			Connection conn = ConnectionProvider.getConnection();
			MemberDao dao = MemberDao.getInstance();

			Member member = new Member(memberno, id, email, name);
			dao.update(conn, member);
			
			
			//list로 보내버리자
			response.sendRedirect("list.do");
		}else if(path.equals("/memberDelete.do")) {
			int memberno = Integer.parseInt(request.getParameter("memberno"));

			Connection conn = ConnectionProvider.getConnection();
			MemberDao dao = MemberDao.getInstance();

			dao.delete(conn, memberno);
			response.sendRedirect("list.do");
		}
	}

}
