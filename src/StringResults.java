import java.util.Scanner;

public class StringResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scan.nextInt();

        String result;

        System.out.println(result = ((number > 20) ? (number < 30) ? "Bob" : "Paul" : "Michael"));
    }
}
