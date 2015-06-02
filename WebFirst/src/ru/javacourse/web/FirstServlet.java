package ru.javacourse.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;

/**
 * Created by Антон on 28.05.2015.
 */
public class FirstServlet extends HttpServlet
{
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("SERVLET IS STARTED");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        if(name == null || name.trim().isEmpty()) {
            name = "Unknown";
        }

        HttpSession session = request.getSession();
        session.setAttribute("NAME", name);

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        writer.write("<strong>Hello, " + name + "</strong>");
        writer.close();
    }

    @Override
    public void destroy() {
        System.out.println("SERVLET IS STOPPED");
    }
}
