import java.util.Scanner;
public class ArrayWithOutLoops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (arr.length < 1) {
            System.out.println("Array length should be at least 1");
            return;
        } else {
            if (arr[0] == 6 || arr[arr.length - 1] == 6) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }
}