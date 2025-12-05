//write a program to find the sub array from the given array using method called subArray
// import java.util.*;
// public class SubArray {
//     public static void main(String[] args) {
//         int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//         Scanner sc = new Scanner(System.in);
//         System.out.printl("Enter the starting index: ");
//         int start = sc.nextInt();
//         System.out.printl("Enter the ending index: ");
//         int end = sc.nextInt();
//         SubArray obj = new SubArray(rray, start, end);
        
//         System.out.println("Sub Array: " + Arrays.toString(subArray));
//     }

//     public static int[] subArray(int[] array, int start, int end) {
//         if (start < 0 || end > array.length || start >= end) {
//             throw new IllegalArgumentException("Invalid start or end index");
//         }
//         return Arrays.copyOfRange(array, start, end);
//     }
// }



//write a program to find the sub array from the given array using method called subArray
import java.util.*;
public class SubArray { 
    public static void main(String[] args) {
        
    }

    public static int[] subArray(int[] array, int start, int end) {
        if (start < 0 || end > array.length || start >= end) {
            throw new IllegalArgumentException("Invalid start or end index");
        }
        return Arrays.copyOfRange(array, start, end);
    }
}

