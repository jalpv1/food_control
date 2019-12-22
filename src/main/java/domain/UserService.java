package domain;

import entity.User;
import entity.algoritm.CountNorm;
import entity.algoritm.CountNormManager;
import entity.dao.repository.UserRepository;

import java.util.ArrayList;
import java.util.Optional;

public class UserService {
    private UserRepository userRepository;
private CountNormManager countNormManager ;

    public UserService(){
        userRepository  =new UserRepository();
        countNormManager = new CountNormManager();
    }
    public ArrayList<User> getAllUsers(){
        return userRepository.getUser();
    }
    public ArrayList<User> getUserId(int id){
        return userRepository.getUserId(id);
    }
    public User conculateNorm(User user){
        return countNormManager.conculateNorm(user);
    }
    public  void addUser(User user){
        countNormManager.conculateNorm(user);
         userRepository.addUser(user);
       //  userRepository.addNorm(user);
    }
    public void addUserMeal(){

    }
    public boolean checkEmail(String email){
        return userRepository.checkEmail(email) == 0;
    }
    public Optional<User> logIn(String email,String password){
        Optional<User> user = Optional.ofNullable((userRepository.findByEmailPassword(email,password)));
        if (user.isPresent()) {
            return user;
        }
        return Optional.empty();
    }
}
