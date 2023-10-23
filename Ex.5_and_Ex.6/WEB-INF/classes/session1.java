import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class session1 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            HttpSession session = request.getSession();
            String name = request.getParameter("name");
            String[] items = request.getParameterValues("items");

            session.setAttribute("username", name);
            session.setAttribute("items", items);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Order Details</title>");
            out.println("<style>");
            out.println("body {");
            out.println("font-family: Arial, sans-serif;");
            out.println("background-color: rgba(238, 215, 151, 0.863);background-image: url('order2.jpg');background-repeat: no-repeat; background-size: cover;");
            out.println("display: flex;");
            out.println("justify-content: center;");
            out.println("align-items: center;");
            out.println("height: 100vh;");
            out.println("flex-direction: column;");
            out.println("}");
            out.println("h2 {");
            out.println("color:rgb(78, 35, 4)");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<br/><br/><h2>Welcome " + name + "!</h2>");
            out.println("<p><b>You have ordered the following items:</b></p>");
            out.println("<ul>");
            for (String item : items) {
                out.println("<b><li>" + item + "</li></b>");
            }
            out.println("</ul>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
