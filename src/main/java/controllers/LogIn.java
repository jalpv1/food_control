package controllers;

import domain.MealService;
import domain.UserService;
import entity.Meal;
import entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

public class LogIn implements Command {

    private UserService userService;
    private MealService mealService;

    public LogIn(UserService userService, MealService mealService) {
        this.userService = userService;
        this.mealService = mealService;
    }

    static HttpSession session;

    @Override
    public String execute(HttpServletRequest request) {

        String login = request.getParameter("login");
        String password = request.getParameter("password");


/*
        if (name == null || name.equals("") || password == null || password.equals("") || email == null || email.equals("")) {
            return "/registration.jsp";
        }

 */
        try {
            if (!userService.checkEmail(login)) {
                request.setAttribute("error", true);
//                request.setAttribute("inwalidInput", "User with this email already exist");
                //return "/registration.jsp";
//                throw new RuntimeException("User with this email already exist");
            }

            Optional<User> user = userService.logIn(login, password);
            if (user.isPresent()) {
                request.setAttribute("login", user.get().getLogin());
                session = request.getSession();
                session.setAttribute("user", user);
                List<Meal> meal = mealService.getAllMeals();
                //  request.setAttribute("meal",meal);
                session.setAttribute("meal", meal);
                session.setAttribute("kkal",user.get().getKkalNorm());


            }

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return "/welcome.jsp";
    }
}
