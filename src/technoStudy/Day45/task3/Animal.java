package technoStudy.Day45.task3;

import technoStudy.Day31.task3.package1.A;
import technoStudy.Day45.task3.animal.Cat;
import technoStudy.Day45.task3.animal.Duck;

import java.time.Duration;

public abstract class Animal {
    String name;
    int age;

    Animal reproduce() {
        Animal animalChild = null;
        if (this instanceof Cat) {
            animalChild = new Cat();
        }
        if (this instanceof Duck) {
            animalChild = new Duck();
        }
        animalChild.age = this.age;
        animalChild.name = this.name;
        return animalChild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
