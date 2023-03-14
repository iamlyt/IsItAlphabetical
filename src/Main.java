import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // stores the whole damn thing in string
        String string = scanner.nextLine();
        // split from " "
        // creates array
        String[] str = string.split(" ");
        String result = "";
        for (int i = 1; i < str.length; i++) {
            if (str[i].compareTo(str[i - 1]) < 0) {
                result = "false";
            } else {
                result = "true";
            }
        }
        System.out.println(result);    }
}