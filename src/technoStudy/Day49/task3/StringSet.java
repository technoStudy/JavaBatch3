package technoStudy.Day49.task3;

public interface StringSet {
    void add(String s); // (only add if unique)
    void remove(String s);
    int size();
    void clear(); //remove all Strings from StringSet
    boolean isEmpty();
}
