package servlets;

import controllers.*;
import domain.MealService;
import domain.UserService;
import sun.tools.tree.AddExpression;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainServlet  extends HttpServlet {
    private Map<String, Command> commands = new HashMap<String, Command>();



    public void init(ServletConfig servletConfig){
       servletConfig.getServletContext();
        UserService userService = new UserService();
        MealService mealService = new MealService();

        commands.put("/api/registration", new Registration(userService));
        commands.put("/api/login", new LogIn(userService,mealService));
        commands.put("/api/updatekkal", new MealList(mealService));
        commands.put("/api/addmeal", new AddMeal(mealService));
        commands.put("/api/logout", new LogOut());



    }
    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {
        processRequest(request, response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = request.getRequestURI();

        String appPath = request.getContextPath();
       // path = path.replaceAll(".*/app/", "");
        String commandName = path.substring(appPath.length());

        Command command = commands.getOrDefault(commandName,
                (r) -> "/");
        String page = "/";
        try {
            page = command.execute(request);
            response.sendRedirect(appPath + page);
            //request.getRequestDispatcher(page).forward(request, response);
        }
        catch (Exception e) {
            response.sendRedirect("/error.jsp");
        }
       /* if (page.contains("redirect")) {
            response.sendRedirect(page.replace("redirect:", ""));
        } else {

        */

      //  }
     //   RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/add.jsp");
     //   requestDispatcher.forward(req, resp);
    }
}
