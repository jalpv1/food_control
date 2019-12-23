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
import java.util.Base64;

public class UserRepository {
    final static Connection connection = MyConnection.gettingConnection();
    ;

    public ArrayList<User> getUser() {
        //Connection connection =MyConnection.gettingConnection();
        ArrayList<User> users = new ArrayList<User>();
        User user;
        try {

            PreparedStatement statement =
                    connection.prepareStatement(UserQuery.GET_USER);

            // statement.setString(1,"pizza");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                user = new User(resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4),
                        resultSet.getInt(5), resultSet.getInt(6)

                );
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public ArrayList<User> getUserId(int id) {
        //Connection connection =MyConnection.gettingConnection();
        ArrayList<User> users = new ArrayList<User>();
        User user;
        try {

            PreparedStatement statement =
                    connection.prepareStatement(UserQuery.GET_USER_BY_ID);

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                user = new User(resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4),
                        resultSet.getInt(5), resultSet.getInt(6)

                );
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void addUser(User user) {
        // Connection connection = MyConnection.gettingConnection();

        try {
            String M = UserQuery.ADD_USER;
            PreparedStatement statement =
                    connection.prepareStatement(UserQuery.ADD_USER);

            statement.setString(1, user.getLogin());
            statement.setString(2, Base64.getEncoder().encodeToString( user.getPassword().getBytes()));
            statement.setString(3, user.getSex());
            statement.setInt(4, user.getWeight());

            statement.setInt(5, user.getActivityLevel());

            statement.setInt(6, user.getKkalNorm());
            statement.setInt(7, user.getProteinsNorm());
            statement.setInt(8, user.getCarbonHydratesNorm());
            statement.setInt(9, user.getFatsNorm());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
        public User findByEmailPassword(String email, String password) {
        User user;
        try  {
            PreparedStatement ps =
                    connection.prepareStatement(UserQuery.GET_BY_LOGIN_PASSWORD);
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                //String login, String password, int activityLevel, String sex,
                // int weight, int kkalNorm,
              //  int carbonHydratesNorm, int fatsNorm, int proteinsNorm
                user =  new User(resultSet.getString(2),

                        resultSet.getString(3),
                        resultSet.getInt(5),
                        resultSet.getString(4),
                        resultSet.getInt(5),
                        resultSet.getInt(6),
                        resultSet.getInt(7)
                        ,resultSet.getInt(8) ,
                        resultSet.getInt(9)
                       );
                user.setLogin( resultSet.getString(2));
                user.setPassword( resultSet.getString(3));
                user.setSex( resultSet.getString(4));
                user.setWeight( resultSet.getInt(5));
                user.setActivityLevel( resultSet.getInt(6));
                user.setKkalNorm( resultSet.getInt(7));
                user.setCarbonHydratesNorm( resultSet.getInt(8));
                user.setProteinsNorm( resultSet.getInt(9));
                user.setFatsNorm( resultSet.getInt(10));
                return user;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
public User matchUser(ResultSet resultSet){
        User user = new User();
        try {
            if (resultSet.next()) {

            }
        }
    catch (Exception e){}
        return user;
}
    public User checkEmail(String login) {
        User user;
        try {
            PreparedStatement statement =
                    connection.prepareStatement(UserQuery.GET_BY_LOGIN);
            statement.setString(1, login);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                user = new User(resultSet.getString(2),

                        resultSet.getString(3),
                        resultSet.getInt(5),
                        resultSet.getString(4),
                        resultSet.getInt(5),
                        resultSet.getInt(6),
                        resultSet.getInt(7)
                        , resultSet.getInt(8),
                        resultSet.getInt(9)
                );
                user.setLogin(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                user.setSex(resultSet.getString(4));
                user.setWeight(resultSet.getInt(5));
                user.setActivityLevel(resultSet.getInt(6));
                user.setKkalNorm(resultSet.getInt(7));
                user.setCarbonHydratesNorm(resultSet.getInt(8));
                user.setProteinsNorm(resultSet.getInt(9));
                user.setFatsNorm(resultSet.getInt(10));
                return user;
            }
        } catch (SQLException e) {
        }

        return null;
    }

    public void addNorm(User user) {
        try {
            String M = UserQuery.ADD_NORM;
            PreparedStatement statement =
                    connection.prepareStatement(UserQuery.ADD_USER);

            statement.setInt(1, user.getKkalNorm());
            statement.setInt(2, user.getProteinsNorm());
            statement.setInt(3, user.getCarbonHydratesNorm());
            statement.setInt(4, user.getFatsNorm());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
