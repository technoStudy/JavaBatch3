package technoStudy.Day46.dake.game.entities;

import technoStudy.Day46.dake.game.Entity;

public abstract class Good extends Entity {
    public void fight(Entity another) {
        if(another instanceof Good) {
            return;
        }
        System.out.print(this.getClass().getSimpleName() +" is attacking: " + another.getClass().getSimpleName() + " ") ;
    }
}
