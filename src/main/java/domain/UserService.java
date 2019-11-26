package domain;

import entity.User;
import entity.algoritm.CountNorm;
import entity.algoritm.CountNormManager;
import entity.dao.repository.UserRepository;

import java.util.ArrayList;

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
}
