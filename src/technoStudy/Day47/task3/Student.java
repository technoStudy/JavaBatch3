package technoStudy.Day47.task3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name = "No name";
    int age;
    List<Lesson> lessons;
    Parent[] parents;
    int grade;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.lessons = new ArrayList<>();
        this.parents = new Parent[2];
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

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public Parent[] getParents() {
        return parents;
    }

    public Parent getFather() {
        return parents[0];
    }

    public Parent getMother() {
        return parents[1];
    }

    public void setFather(Parent parent){
        parents[0] = parent;
    }

    public void setMother(Parent parent){
        parents[1] = parent;
    }

    public void setParents(Parent[] parents) {
        this.parents = parents;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
