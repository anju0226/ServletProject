import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Anju on 22/06/2016.
 */
public class UserServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        Users user = new Users();
        user.setUsername(request.getParameter("name"));
        user.setPass(request.getParameter("pass"));
        UserService userService = new UserService();



            String val = userService.auth(user);
          //  String message = "";
            System.out.println(val);


            if (val.equals("successful")) {
                PrintWriter out = response.getWriter();
                response.setContentType("text/html");
                out.println("<html><body>");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dbname", "root", "");
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from record");
                    out.println("<table border=1 width=50% height=50%>");
                    out.println("<tr><th>MoMo</th><th>Chowmin</th><th>Fried Rice</th><tr>");
                    while (rs.next()) {
                        String n = rs.getString("momo_count");
                        String nm = rs.getString("chowmin_count");
                        String fried = rs.getString("fried_count");

                        out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + fried + "</td></tr>");
                    }
                    out.println("</table>");
                    out.println("</html></body>");
                    con.close();
                }
                catch (Exception e) {
                    out.println("error");
                }
            }




//                String ok = userService.generateReport();
//                String[] items = ok.split(",");
//                String momo = items[0];
//                String chowmin = items[1];
//                String fried = items[2];
//
//
//             //   System.out.println("momo"+ momo);
//                request.setAttribute("momo",momo);
//                request.setAttribute("chowmin",chowmin);
//                request.setAttribute("fried",fried);
//                request.getRequestDispatcher("/Report.jsp").forward(request,response);
//                System.out.println("Welcome to ABC restaurant");


//            } else if (val.equals("failed")) {
//                message = "Login Failed";
//                System.out.println(message);
           }
            //request.setAttribute("message", message);
        }


