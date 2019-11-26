package entity.algoritm;


import entity.User;

public abstract class CountNorm {
    abstract int  countMetabolizm();
    abstract int countKkalNorm(User user);


    public double contCarbones(User user) {
        return  user.getWeight()* 1.1;
    }

    public double contFats(User user) {
        return  user.getWeight()* 1.2;
    }
    public double contProteins(User user) {
        return  user.getWeight()* 0.8;
    }

}
