import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Anju on 26/06/2016.
 */
@WebServlet(name = "MenuServlet")
public class MenuServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        String momoQuantity = request.getParameter("momo");
        String chowQuantity = request.getParameter("chowmin");
        String friedQuantity = request.getParameter("friedRice");

        Menu menu = new Menu();
        menu.setMomoQuantity(momoQuantity);
        menu.setChowminQuantity(chowQuantity);
        menu.setFriedRiceQuantity(friedQuantity);
        UserService userService = new UserService();
        String signal = userService.record(menu);

         if(signal.equals("success")){

             writer.println("Order Successfully Placed");
             System.out.println("data recorded");
         }
         }





    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
