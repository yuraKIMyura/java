package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginCheckFilter
 */


public class LoginCheckFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public LoginCheckFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpSession session = httpRequest.getSession(false);

		
	    String requestURI = httpRequest.getRequestURI();
	    if (requestURI.endsWith("/loginForm.jsp") || requestURI.endsWith("/joinMemberForm.css") || requestURI.endsWith("/login.do") || requestURI.endsWith("/joinForm.do") || requestURI.endsWith("/join.do")) {
	        chain.doFilter(request, response);
	        return;
	    }
	    boolean login = false;

	    if (session != null) {
	        if (session.getAttribute("authenticatedUser") != null) {
	            login = true;
	            System.out.println("login check filter: logged in " + login);
	        }
	    }

	    if (login) {
	        chain.doFilter(request, response);
	    } else {
	        System.out.println("login check filter: not logged in " + login);

	        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/member/loginForm.jsp");
	        dispatcher.forward(request, response);
	    }
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
