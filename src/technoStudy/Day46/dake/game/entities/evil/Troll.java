package technoStudy.Day46.dake.game.entities.evil;

import technoStudy.Day46.dake.game.Entity;
import technoStudy.Day46.dake.game.entities.Evil;
import technoStudy.Day46.dake.game.weapons.Sword;

public class Troll extends Evil {
    public Troll() {
        health = 10;
        weapon = new Sword();
    }

    @Override
    public int doDamage() {
        return 7;
    }

    @Override
    public void fight(Entity another) {
        // custom fight behaviour for troll
        if(this == another || this.isDead()) { // do damage himself
            return;
        }
        System.out.print(this.getClass().getSimpleName() +" is attacking: " + another.getClass().getSimpleName() + " ");
        another.takeDamage(this);
    }
}
