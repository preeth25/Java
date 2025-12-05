//write a simple program to search an element if it is present in an array or not
import java.util.Scanner;   
public class search{  
    public static void main(String[] args) {  
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the size of array"); 
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements");
        for(int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

        System.out.print("Enter the element to search: ");  
        int elementToSearch = sc.nextInt();  
        boolean found = false;  
        
        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] == elementToSearch) {  
                found = true;  
                break;  
            }  
        }  
        
        if (found) {  
            System.out.println("Element " + elementToSearch + " is found  in the array.");  
        } else {  
            System.out.println("Element " + elementToSearch + " is not found in the array.");  
        }  
        
        sc.close();  
    }  
}