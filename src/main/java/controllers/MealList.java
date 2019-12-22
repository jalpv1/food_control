package controllers;

import domain.MealService;
import domain.UserService;
import entity.Meal;
import entity.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class MealList implements Command {

    private MealService mealService;

    public MealList(MealService mealService) {
        this.mealService = mealService;
    }


    @Override
    public String execute(HttpServletRequest request) {
        String kkal = request.getParameter("kkal");
        LogIn.session.setAttribute("kkal",
                (Integer) LogIn.session.getAttribute("kkal") -
                        Integer.parseInt(kkal));


/*
       List<Meal> meal = mealService.getAllMeals();
     //  request.setAttribute("meal",meal);
       LogIn.session.setAttribute("meal",meal);

 */


        return "/welcome.jsp";
    }
}
