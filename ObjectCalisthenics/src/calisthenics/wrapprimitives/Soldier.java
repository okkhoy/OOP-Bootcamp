package calisthenics.wrapprimitives;

/**
 * Created by thaodang on 18/8/15.
 */
public class Soldier {
    private final String weapon;

    public Soldier(String weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        if(weapon.equals("knife")) {
            stab();
        }
        else if(weapon.equals("gun")) {
            fire();
        }
        else if(weapon.equals("spear")) {
            throwSpear();
        }
    }

    private void stab() {
        System.out.print("Stabbing!!!!");
    }

    private void fire() {
        System.out.print("Bang!!!!");
    }

    private void throwSpear() {
        System.out.print("Throwing spear!!!!");
    }
}
