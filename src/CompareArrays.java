import java.util.Scanner;

public class CompareArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{2, 2, 3, 4, 5};
        boolean isEq= true;

        if (arr1.length != arr2.length) {
            System.out.println("Arrays aren't equal!");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isEq = false;
                    break;
                }
            }
            if (isEq){System.out.println("Arrays are equal");}
            if (!isEq){System.out.println("Arrays aren't equal");}
        }
    }
}
