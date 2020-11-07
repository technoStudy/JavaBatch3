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
        for(Integer number : list){
            if(currentMax < number) {
                currentMax = number;
            }
        }
        return currentMax;
    }
}
