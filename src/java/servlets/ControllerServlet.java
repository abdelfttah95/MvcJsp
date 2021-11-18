package servlets;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import model.*;

/**
 *
 * @author abdel
 */
public class ControllerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<title>Get Data</title>");
        out.println("<h1>Servlet GetData</h1>");
        
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String salary = request.getParameter("salary");
        
        Person p = new Person();
        p.setId(Integer.parseInt(id));
        p.setName(name);
        p.setSalary(Integer.parseInt(salary));
        
        request.setAttribute("person", p);
        
        FileInteract.writeToFile(id, name, salary);
        RequestDispatcher req = request.getRequestDispatcher("View.jsp");
        req.forward(request, response);
    }

}
