package technoStudy.Day45.task3.animal;

import technoStudy.Day45.task3.Animal;
import technoStudy.Day45.task3.interfaces.AbleToEat;

public class Cat extends Animal implements AbleToEat {
    @Override
    public String food() {
        return "Cat nip";
    }

    Animal reproduce() {
        Animal kitten = new Cat();
        kitten.setAge(this.getAge());
        kitten.setName(this.getName());
        return kitten;
    }
}
