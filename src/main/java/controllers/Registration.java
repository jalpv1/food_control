package controllers;



import domain.UserService;
import entity.User;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.Base64;

public class Registration implements Command {

    private UserService userService;
    public Registration(UserService userService) {
        this.userService = userService;
    }


    @Override
    public String execute(HttpServletRequest request) {

        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String weight = request.getParameter("weight");
        String activityLevel = request.getParameter("activityLevel");
        String sex = request.getParameter("sex");
        request.setAttribute("errors", false);

/*
        if (name == null || name.equals("") || password == null || password.equals("") || email == null || email.equals("")) {
            return "/registration.jsp";
        }

 */
        try {
            if (!userService.checkEmail(login)) {
                request.setAttribute("errors", true);

           request.setAttribute("invalidInput", "User with this email already exist");
                //return "/registration.jsp";
//                throw new RuntimeException("User with this email already exist");
                return "/registration.jsp";
            }

            userService.addUser(new User(login,password, sex, Integer.parseInt(weight), Integer.parseInt(activityLevel)));


        } catch ( Exception e) {
            e.printStackTrace();
            throw e;
        }
        return "/welcome.jsp";
    }
}
