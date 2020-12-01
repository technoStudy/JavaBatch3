package technoStudy.Day46.dake.game;

import technoStudy.Day46.dake.game.entities.Evil;
import technoStudy.Day46.dake.game.weapons.Weapon;

public abstract class Entity implements Attack, Comparable<Entity> {
    protected int health;
    protected Weapon weapon;
    protected int age;

    public boolean isDead() {
        return health <= 0;
    }

    public abstract void fight(Entity another);

    public void takeDamage(Attack o) {
        health = health - o.doDamage();
    }

    @Override
    public String toString() {
        return "Entity{" +
                "entity=" + this.getClass().getSimpleName()+
                ",health=" + health +
                '}';
    }

    @Override
    public int compareTo(Entity anotherEntity) {
        // if this is less than another then return < 0
        // if this is more than another then return > 0
        // if this is equal to another then return = 0
        if(anotherEntity.health < this.health) {
            return -1;
        } else if(anotherEntity.health > this.health) {
            return 1;
        } else {
            return 0;
        }
//        return anotherEntity.health - this.health;
    }

}
