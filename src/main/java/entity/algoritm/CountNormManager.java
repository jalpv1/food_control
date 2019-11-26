package entity.algoritm;


import entity.User;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CountNormManager {
    CountNorm countNorm = null;
    Map <String,CountNorm> countNormMap;
   public CountNormManager(){
        countNormMap = new HashMap<String, CountNorm>();
        countNormMap.put("f",new  CountNormWoman());
        countNormMap.put("m",new CountNormMan());
    }

    public User conculateNorm(User user){
        CountNorm countNorm = countNormMap.get(user.getSex());
        user.setProteinsNorm((int) countNorm.contProteins(user));
        user.setFatsNorm((int) countNorm.contFats(user));
        user.setCarbonHydratesNorm((int) countNorm.contCarbones(user));
        user.setKkalNorm(countNorm.countKkalNorm(user));
        return user;

    }

}

