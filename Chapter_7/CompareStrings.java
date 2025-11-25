import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String Compare = "Carmen";

        System.out.print("Enter your name > ");
        String input = kb.nextLine();

        if(Compare.equals(input)) {
            System.out.println(Compare + " equals " + input);
        } else {
            System.out.println(Compare + " does not equal " + input);
        }
    }
}
