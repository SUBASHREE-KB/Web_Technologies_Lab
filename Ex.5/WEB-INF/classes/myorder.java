import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myorder extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Order Details</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #eeda99; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0;}");
        out.println(".details { width: 50%; margin: auto; background: #fff; padding: 20px; box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2); border-radius: 5px;}");
        out.println("h1 { text-align: left; color: #333;}");
        out.println("p { margin: 10px 0; text-align: left; }");
        out.println("ul { list-style-type: none; padding: 0; text-align: left; }");
        out.println("li { margin: 5px 0; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='details'>");
        out.println("<h1>Order Details</h1>");

        String name = request.getParameter("name");
        out.println("<p><strong>Name:</strong> " + name + "</p>");

        String phone = request.getParameter("phone");
        out.println("<p><strong>Phone Number:</strong> " + phone + "</p>");

        String address = request.getParameter("address");
        out.println("<p><strong>Address:</strong> " + address + "</p>");

        String[] items = request.getParameterValues("items");
        out.println("<p><strong>Items Ordered:</strong></p>");
        out.println("<ul>");
        for (String item : items) {
            out.println("<li>" + item + "</li>");
        }
        out.println("</ul>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
