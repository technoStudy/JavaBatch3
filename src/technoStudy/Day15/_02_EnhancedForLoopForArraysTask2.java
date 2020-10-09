package technoStudy.Day15;

public class _02_EnhancedForLoopForArraysTask2 {
    // given the provided array
    // find out the index at which string starts with "m"
    public static void main(String[] args) {
        String[] list = {"meat", "fruits", "vegetables",  "milk"};

        for (int i = 0; i < list.length; i++) {
            if(list[i].startsWith("m")){
                System.out.println(i);
            }
        }

        for (String element : list) {
            if(element.startsWith("m")) {
                System.out.println(element); // don't have reference to index
            }
        }
    }
}
