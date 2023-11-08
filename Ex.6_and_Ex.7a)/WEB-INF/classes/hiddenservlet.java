import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class hiddenservlet extends HttpServlet {
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
        out.println("<title>Welcome</title>");
        out.println("<style>");
        out.println("body {");
        out.println("font-family: Arial, sans-serif;");
        out.println("background-color: rgba(238, 215, 151, 0.863);background-image: url('detailsbg1.jpeg');background-repeat: no-repeat; background-size: cover;");
        out.println("display: flex;");
        out.println("justify-content: center;");
        out.println("align-items: center;");
        out.println("height: 100vh;");
        out.println("flex-direction: column;");
        out.println("}");
        out.println("h3 {");
        out.println("color: rgb(0,0,0);");
        out.println("text-align: center;");
        out.println("}");
        out.println("form {");
        out.println("display: flex;");
        out.println("flex-direction: column;");
        out.println("align-items: center;");
        out.println("}");
        out.println("input[type=\"submit\"] {");
        out.println("background-color: #333;");
        out.println("color: #fff;");
        out.println("padding: 10px 20px;");
        out.println("border: none;");
        out.println("border-radius: 5px;");
        out.println("cursor: pointer;");
        out.println("margin-top: 20px;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");

        out.println("<body>");
        out.println("<h3>Your response is submitted successfully!</h3><h3>Will reach you out soon!</h3><h3>Click on submit to view the details you have entered!</h3>");
        out.println("<form action='hiddenservlet2' method='post'>");
        out.println("<input type='hidden' name='name' value='" + name + "'/>");
        out.println("<input type='hidden' name='email' value='" + email + "'/>");
        out.println("<input type='hidden' name='city' value='" + city + "'/>");
        out.println("<input type='hidden' name='mobile' value='" + mobile + "'/>");
        out.println("<input type='submit' value='Submit'/>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
