package technoStudy.Day22;

public class RecapTask2 {
    // create a method that accepts undefined(any) number of integers
    // count how many of them starts with 1 and ends with 0
    // return the count
    public static int countNumbers(int... list){
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            int element = list[i];
            String stringElement = "" + element;
            if(stringElement.startsWith("1") && stringElement.endsWith("0")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNumbers(10, 12, 1230, 146540));
        System.out.println(countNumbers(10, 12, 1230, 1465));
        System.out.println(countNumbers(10));
    }
}
