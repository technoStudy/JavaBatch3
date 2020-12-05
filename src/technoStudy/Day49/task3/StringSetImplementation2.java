package technoStudy.Day49.task3;

import java.util.Arrays;

public class StringSetImplementation2 implements StringSet {
    String[] storage = new String[0];

    @Override
    public void add(String s) {
        // check if i have duplicate
        for (int i = 0; i < storage.length; i++) {
            if(storage[i].equals(s)) {
                return;
            }
        }

        // copy and add element
        String[] copy = new String[storage.length + 1];
        for (int i = 0; i < storage.length; i++) {
            copy[i] = storage[i];
        }
        storage = copy;
        storage[storage.length - 1] = s;
    }

    @Override
    public void remove(String s) {
        // check if i have it
        int index = -1;
        for (int i = 0; i < storage.length; i++) {
            if(storage[i].equals(s)) {
                index = i;
            }
        }
        if(index == -1) {
            // element not found
            return;
        }

        // copy and remove element
        String[] copy = new String[storage.length - 1];
        boolean found = false;
        for (int i = 0; i < storage.length; i++) {
            if(i == index && !found) {
                found = true;
                continue;
            }
            copy[!found ? i : i-1] = storage[i];
        }
        storage = copy;
    }

    @Override
    public int size() {
        return storage.length;
    }

    @Override
    public void clear() {
        storage = new String[0];
    }

    @Override
    public boolean isEmpty() {
        return storage.length == 0;
    }

    @Override
    public String toString() {
        String print = "";
        for (int i = 0; i < storage.length; i++) {
            print += storage[i] + "\t";
        }
        return print;
    }
}
