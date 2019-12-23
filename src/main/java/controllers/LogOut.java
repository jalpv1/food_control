package controllers;

import domain.MealService;
import domain.UserService;
import entity.Meal;
import entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public class LogOut implements Command {


    @Override
    public String execute(HttpServletRequest request) {
        LogIn.session.invalidate();


        return "/welcome.jsp";
    }
}
