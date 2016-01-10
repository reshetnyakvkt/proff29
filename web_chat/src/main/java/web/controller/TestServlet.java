package web.controller;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Reshetnyak Viktor on 08.01.2016.
 * Project my_chat
 * Package web.controller
 */
public class TestServlet extends HttpServlet {
    public static final Logger log = Logger.getLogger(TestServlet.class);

    public TestServlet() {
    }

    private String message;

    @Override
    public void init() throws ServletException {
        // Do required initialization
        message = "Hello Servlet";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    @Override
    public void destroy(){
        // do nothing.
    }
}
