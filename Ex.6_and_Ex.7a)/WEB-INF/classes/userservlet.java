import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class userservlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>User Details</title>");
        out.println("<style>");
        out.println("body {");
        out.println("font-family: Arial, sans-serif;");
        out.println("background-color: rgba(238, 215, 151, 0.863);");
        out.println("h2 {");
        out.println(" color:rgb(78, 35, 4)");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h2>Here are your Details!</h2>");
        out.println("<p><strong>Username: </strong>" + request.getParameter("username") + "</p>");
        out.println("<p><strong>Date of Birth: </strong>" + request.getParameter("dob") + "</p>");
        out.println("<p><strong>Email ID: </strong>" + request.getParameter("email") + "</p>");
        out.println("<p><strong>Phone Number: </strong>" + request.getParameter("phone") + "</p>");
        out.println("<p><strong>Address: </strong>" + request.getParameter("address") + "</p>");
        out.println("<p><strong>Payment Mode: </strong>" + request.getParameter("pmode") + "</p>");

        if (request.getParameter("pmode").equals("Credit Card")) {
            out.println("<p><strong>Card Number: </strong>" + request.getParameter("cardno") + "</p>");
            out.println("<p><strong>Card Holder Name: </strong>" + request.getParameter("cardholder") + "</p>");
            out.println("<p><strong>CVV: </strong>" + request.getParameter("cvv") + "</p>");
        }

        out.println("<p><strong>Shipping Address: </strong>" + request.getParameter("ship") + "</p>");

        out.println("</body>");
        out.println("</html>");
    }
}
