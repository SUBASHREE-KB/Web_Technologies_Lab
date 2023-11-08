import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myservlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body style=\"background-image: url('feedbackimg.png'); background-repeat: no-repeat; background-size: cover;\">");
        out.println("<h1>Your feedback has been received and is being processed! We appreciate your time and input!</h1>");
        out.println("</body></html>");
    }
}
