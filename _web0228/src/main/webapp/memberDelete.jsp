<%@page import="mvjsp.board.dao.MemberDao"%>
<%@page import="mvjsp.jdbc.connection.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

int memberno = Integer.parseInt(request.getParameter("memberno"));

//아래 두 줄은 무조건
Connection conn = ConnectionProvider.getConnection();
MemberDao dao = MemberDao.getInstance();

dao.delete(conn, memberno);

response.sendRedirect("list.jsp");
%>