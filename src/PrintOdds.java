public class PrintOdds {
    static void CountNumbers() {
        for (int i = 0; i <= 100; i++) {
            CheckIfOdd(i);
        }
    }

    static void CheckIfOdd(int num) {
        if (num % 2 != 0) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        CountNumbers();
    }

}
