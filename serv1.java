package com.txt;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import static org.apache.catalina.manager.StatusTransformer.setContentType;

public class serv1 extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {

        String name = request.getParameter("name");

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<head><title>Servlet</title></head>");
        pw.println("<body>");
        pw.println("<h2>Hello " + name + "</h2>");
        pw.println("</body>");
        pw.println("</html>");
        pw.println("<form action='" + request.getContextPath() + "/serv2' method='get'>");

        pw.println("Name: ");
        pw.println("<input type='text' name='name' required><br><br>");

        pw.println("City: ");
        pw.println("<input type='text' name='city' required><br><br>");

        pw.println("<button type='submit'>Next</button>");

        pw.println("</form>");
        pw.println("</body>");
        pw.println("</html>");
    }
}