package technoStudy.Day5;

public class _06_Substring {
    public static void main(String[] args) {
        String var = "Hello TechnoStudy!";
        String substring = var.substring(2); // starting from index 2 and get the rest of the string
        System.out.println(substring);

        String shorterSubString = var.substring(2, 4); // up to index 4, but but including it
        System.out.println(shorterSubString);
    }
}
