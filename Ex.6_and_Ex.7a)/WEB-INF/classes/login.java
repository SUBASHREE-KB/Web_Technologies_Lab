import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class login extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Connection conn = null;
        Statement stmt = null;
        PrintWriter out = response.getWriter();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "root", "");
            stmt = conn.createStatement();

            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String action = request.getParameter("action");

            if (action.equals("Create Account")) {
                PreparedStatement pstmt1 = conn.prepareStatement("SELECT * FROM users WHERE email = ?");
                pstmt1.setString(1, email);
                ResultSet resultSet = pstmt1.executeQuery();
                if (resultSet.next()) {
                    out.println("<script>alert('User already exists!'); window.location.href='loginpage.html';</script>");
                } else {
                    PreparedStatement pstmt = conn.prepareStatement("INSERT INTO users VALUES (?, ?)");
                    pstmt.setString(1, email);
                    pstmt.setString(2, password);
                    pstmt.executeUpdate();
                    out.println("<script>alert('Account created successfully');</script>");
                    response.sendRedirect("userdetails.html");
                }
            } else if (action.equals("Login")) {
                PreparedStatement pstmt1 = conn.prepareStatement("SELECT * FROM users WHERE email = ? AND password = ?");
                pstmt1.setString(1, email);
                pstmt1.setString(2, password);
                ResultSet resultSet = pstmt1.executeQuery();
                if (resultSet.next()) {
                    out.println("<script>window.location.href='order.html';alert('Welcome, " + email + "!'); </script>");
                } else {
                    out.println("<script>window.location.href='loginpage.html';alert('Incorrect Username or password!');</script>");
                }
            }
            
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
