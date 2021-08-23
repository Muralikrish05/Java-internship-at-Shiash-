

import java.io.*;  
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class Register1 extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("userName");  
String p=request.getParameter("userEmail");  
String e=request.getParameter("userPass");  
String c=request.getParameter("userCountry");  
          
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/sonoo","root","hello");  
  
PreparedStatement ps=con.prepareStatement("insert into registeruser values(?,?,?,?)");  
  
ps.setString(1,n);  
ps.setString(2,p);  
ps.setString(3,e);  
ps.setString(4,c); 
//out.println("YEs Iam working");
          
int i=ps.executeUpdate();  
if(i>0)  {
out.print("You are successfully registered...");  
RequestDispatcher rs = request.getRequestDispatcher("/Login.html");
rs.include(request, response);
//out.println("YEs Iam working");
}
      
          
}catch (Exception e2) {System.out.println(e2);} 

//out.println("YEs Iam working");
          
out.close();  
}  
  
}  
