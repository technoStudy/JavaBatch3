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
}
