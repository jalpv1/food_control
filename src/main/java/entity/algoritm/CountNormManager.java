package entity.algoritm;


import entity.User;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CountNormManager {
    CountNorm countNorm = null;
    Map <String,CountNorm> countNormMap;
    CountNormManager(){
        countNormMap = new HashMap<String, CountNorm>();
        countNormMap.put("F",new  CountNormWoman());
        countNormMap.put("M",new CountNormMan());
    }

    public void conculateNorm(User user){
        CountNorm countNorm = countNormMap.get(user.getSex());
        int [] norm = countNorm.contCarbonesProteinsFats();

    }
    public void createMap(){

    }
}

