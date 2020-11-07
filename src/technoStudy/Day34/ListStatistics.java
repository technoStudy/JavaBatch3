package technoStudy.Day34;

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
        Integer currentMax = list.get(0);
        for (int i = 0; i < list.size() - 1; i++) {
            if(currentMax < list.get(i)){
                currentMax = list.get(i);
            }
        }
        return currentMax;
    }
}
