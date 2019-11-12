package entity.dao.repository;

import entity.Meal;
import entity.User;
import entity.dao.query.MealQuery;
import entity.dao.query.UserQuery;
import entity.dao.utill.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserRepository {
    public ArrayList<User> getUser(){
        Connection connection =MyConnection.gettingConnection();
        ArrayList<User> users = new ArrayList<User>();
        User user ;
        try {

            PreparedStatement statement =
                    connection.prepareStatement(UserQuery.GET_USER);

            // statement.setString(1,"pizza");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                user  = new User(resultSet.getString(2),
                        resultSet.getString(3),resultSet.getString(4),
                        resultSet.getInt(5),resultSet.getString(6)

                      );
                users.add(user);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return users;
    }
}
