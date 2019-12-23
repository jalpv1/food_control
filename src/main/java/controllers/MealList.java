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
        String kkalMeal = request.getParameter("kkal");
        String amountOfMeal = request.getParameter("amount");
        int amountOfkkal =  Integer.parseInt(kkalMeal)* Integer.parseInt(amountOfMeal)/100;
        LogIn.session.setAttribute("kkal",
                (Integer) LogIn.session.getAttribute("kkal") -
                       amountOfkkal);


/*
       List<Meal> meal = mealService.getAllMeals();
     //  request.setAttribute("meal",meal);
       LogIn.session.setAttribute("meal",meal);

 */


        return "/welcome.jsp";
    }
}
