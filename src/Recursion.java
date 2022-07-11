public class Recursion {
    static void recrs(int num) {
        if (num <= 100) {
            CheckIfOdd(num);
            recrs(num + 1);
        }
    }

    static void CheckIfOdd(int num) {
        if (num % 2 != 0) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int i = 0;
        recrs(i);
    }
}
