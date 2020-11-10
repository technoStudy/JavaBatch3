package technoStudy.Day34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListStatistics {
    private List<Integer> list;

    public ListStatistics(List<Integer> list){
        this.list = list;
    }

    public void printList(){
        for (Integer i: list) {
            System.out.print(i + " ");
        }
    }

    public Integer getMax(){
        if(list.isEmpty()) {
            return null;
        }
        Integer currentMax = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(currentMax < list.get(i)){
                currentMax = list.get(i);
            }
        }
        return currentMax;
    }

    public Integer getMedian(){
        if(list.isEmpty()) {
            return null;
        }
        ArrayList<Integer> copy = new ArrayList<>(list);
        Collections.sort(copy);
        int middleIndex = copy.size() / 2;
        if(copy.size() % 2 != 0){ // odd number of numerals
            return  copy.get(middleIndex);
        } else { // even number of numerals
            int sum = copy.get(middleIndex) + copy.get(middleIndex - 1);
            return sum / 2;
        }
    }
}
