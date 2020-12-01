package technoStudy.Day46.dake.game;

import technoStudy.Day46.dake.game.entities.Evil;
import technoStudy.Day46.dake.game.weapons.Weapon;

public abstract class Entity implements Attack {
    protected int health;
    protected Weapon weapon;

    public boolean isDead() {
        return health <= 0;
    }

    public abstract void fight(Entity another);

    public void takeDamage(Attack o) {
        health = health - o.doDamage();
    }
}
