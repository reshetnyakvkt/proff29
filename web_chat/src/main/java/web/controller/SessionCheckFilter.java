package web.controller;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Reshetnyak Viktor on 14.01.2016.
 * Project proff29
 * Package web.controller
 */
public class SessionCheckFilter implements Filter {

    private String contextPath;

    @Override
    public void init(FilterConfig fc) throws ServletException {
        contextPath = fc.getServletContext().getContextPath();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain fc) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        if (req.getSession().getAttribute("LOGIN_USER") == null) { //checks if there's a LOGIN_USER set in session...
            req.getRequestDispatcher("login.jsp").forward(req, response); //or page where you want to redirect
        } else {
            String userType = (String) req.getSession().getAttribute("LOGIN_USER");
            if (userType.equals("ADMIN")){ //check if user type is admin
                fc.doFilter(request, response); //it redirected towards main.jsp
            }

        }
    }

    @Override
    public void destroy() {
    }
}