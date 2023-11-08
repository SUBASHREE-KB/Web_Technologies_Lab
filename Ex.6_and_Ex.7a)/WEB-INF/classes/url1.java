import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class url1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String name = request.getParameter("name");
            String redirectUrl = "order.html?uname=" + name; 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Welcome</title>");
            out.println("<style>");
            out.println("body {");
            out.println("font-family: Arial, sans-serif;");
            out.println("background-color: rgba(238, 215, 151, 0.863);background-image: url('gift1.jpg');background-repeat: no-repeat; background-size: cover;");
            out.println("display: flex;");
            out.println("justify-content: center;");
            out.println("align-items: center;");
            out.println("height: 100vh;");
            out.println("flex-direction: column;");
            out.println("}");
            out.println("h1 {");
            out.println("color:rgb(78, 35, 4)");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.print("<h1>Welcome " + name+"!</h1>");
            out.println("<h3>Click on purchase to place order using gift voucher</h3>");
            out.print("<br/><a href='" + redirectUrl + "'>purchase</a>");
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
