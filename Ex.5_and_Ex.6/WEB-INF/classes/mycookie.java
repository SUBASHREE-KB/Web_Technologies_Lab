/*to set cookies*/
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class mycookie extends HttpServlet {
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
     try{
            response.setContentType("text/html");

            PrintWriter pwriter = response.getWriter();

            String in_data = request.getParameter("uname");
            
            Cookie c = new Cookie("Ucookie",in_data);      

            response.addCookie(c);
            pwriter.println("<!DOCTYPE html>");
            pwriter.println("<html>");
            pwriter.println("<head>");
            pwriter.println("<title>Welcome</title>");
            pwriter.println("<style>");
            pwriter.println("body {");
            pwriter.println("font-family: Arial, sans-serif;");
            pwriter.println("background-color: rgba(238, 215, 151, 0.863);background-image: url('feedbackimg.png');background-repeat: no-repeat; background-size: cover;");
            pwriter.println("}");
            pwriter.println("h1 {");
            pwriter.println(" color:rgb(78, 35, 4)");
            pwriter.println("}");
            pwriter.println("</style>");
            pwriter.println("</head>");
            pwriter.println("<body>");
            pwriter.println("<h1>Welcome, " + in_data + "!</h1>");
            pwriter.println("</body>");
            pwriter.println("</html>");

            pwriter.close();
    }
     catch(Exception exp){
            System.out.println(exp);
     }
  }
}
