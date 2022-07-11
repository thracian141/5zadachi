import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static int[] Sort(int[] arr) {
        int temp;
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[6];
        int[] sorted;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number " + (i+1) + "/" + arr.length + ": ");
            arr[i] = scan.nextInt();
        }
        sorted = Sort(arr);
        System.out.println(Arrays.toString(sorted));
    }
}
