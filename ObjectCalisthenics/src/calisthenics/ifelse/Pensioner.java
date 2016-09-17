package calisthenics.ifelse;

/**
 * Created by thaodang on 17/8/15.
 */
public class Pensioner {
    private final boolean isDead;
    private final int age;

    public Pensioner(boolean isDead, int age) {
        this.isDead = isDead;
        this.age = age;
    }

    public double getPayAmount() {
        double result;
        if (isDead){
            result = 1000000;
        }
        else {
            if (age > 65){
                result = 500000;
            }
            else {
                if (age > 18){
                    result = 10000;
                }
                else{
                    result = 100;
                }
            }
        }
        return result;
    }
}
