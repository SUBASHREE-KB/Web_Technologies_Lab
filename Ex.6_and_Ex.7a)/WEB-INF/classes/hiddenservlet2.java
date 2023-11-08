import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class hiddenservlet2 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String city = request.getParameter("city");
        String mobile = request.getParameter("mobile");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<style>");
        out.println("body {");
        out.println("font-family: Arial, sans-serif;");
        out.println("background-color: rgba(238, 215, 151, 0.863);background-image: url('detailsbg1.jpeg');background-repeat: no-repeat; background-size: cover;");
        out.println("display: flex;");
        out.println("justify-content: center;");
        out.println("align-items: center;");
        out.println("height: 100vh;");
        out.println("}");
        out.println(".details {");
        out.println("background-color: white;");
        out.println("padding: 20px;");
        out.println("border-radius: 5px;");
        out.println("width: 50%;"); 
        out.println("margin: auto;"); 
        out.println("}");
        out.println("h2 {");
        out.println("color: rgb(141, 36, 109);");
        out.println("text-align: center;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div style='position: absolute; background-color: rgba(238, 215, 151, 0.863); z-index: -1;'></div>");
        out.println("<div class='details'>");
        out.println("<h2>Here are your details:</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>City: " + city + "</p>");
        out.println("<p>Mobile: " + mobile + "</p>");
        out.println("</div>");
        out.println("</body></html>");
    }
}
