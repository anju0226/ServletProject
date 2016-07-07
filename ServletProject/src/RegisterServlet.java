import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Anju on 26/06/2016.
 */
@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Hello rgiseter");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");


       // System.out.println("Fname gg"+ fname);
        Users users= new Users();
        users.setUsername(username);
        users.setPass(password);
        users.setFname(fname);
        users.setLname(lname);
        users.setAddress(address);
        users.setContact(contact);

        UserService userService = new UserService();
       String ok = userService.register(users);
       if(ok.equals("successful")){
           PrintWriter out = response.getWriter();
           //System.out.println("user added");
           out.println("<p>User Successfully Added</p>");
       }

    }}


