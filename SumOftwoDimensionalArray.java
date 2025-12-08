import java.util.*;
public class SumOftwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        int sum[][]=new int[3][3];
        int i;
        System.out.println("Enter the values for 1st matrix:");
        for( i=0;i<3;i++){
            for(int j=0;j<3;j++){
                
                System.out.print("Enter the value for row"+(i+1)+" column"+(j+1)+": ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the values for 2nd matrix:");
        for( i=0;i<3;i++){
            for(int j=0;j<3;j++){
                
                System.out.print("Enter the value for row"+(i+1)+" column"+(j+1)+": ");
                arr2[i][j]=sc.nextInt();
            }
        }
        for( i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        System.out.println("Sum of two matrix is:");
        for( i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println("");

        }
    }
}
