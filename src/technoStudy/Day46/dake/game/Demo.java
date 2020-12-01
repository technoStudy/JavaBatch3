package technoStudy.Day46.dake.game;

import technoStudy.Day46.dake.game.entities.evil.Skeleton;
import technoStudy.Day46.dake.game.entities.evil.Troll;
import technoStudy.Day46.dake.game.entities.good.Archer;
import technoStudy.Day46.dake.game.entities.good.Knight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        List<Entity> entities = generateRandomEntites();

        // one round of the game
        for (Entity entity: entities) {
            System.out.print(entity.getClass().getSimpleName() +" is attacking: ");
            for (Entity another : entities) {
                System.out.print(another.getClass().getSimpleName() + ", ");
//                entity.fight(another);
            }
            System.out.println();
        }

        checkWhoWins(entities);
    }

    private static void checkWhoWins(List<Entity> entities) {
        // check who is dead
    }

    private static List<Entity> generateRandomEntites() {
        Random random = new Random();
        List<Entity> generated = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomEntity = random.nextInt(4);
            switch (randomEntity) {
                case 0:
                    generated.add(new Skeleton());
                    break;
                case 1:
                    generated.add(new Troll());
                    break;
                case 2:
                    generated.add(new Knight());
                    break;
                case 3:
                    generated.add(new Archer());
                    break;
            }

        }

        return  generated;
    }
}
