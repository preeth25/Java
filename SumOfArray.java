import java.util.*;
public class SumOfArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter the value for row"+(i+1)+" column"+(j+1)+": ");
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum=sum+arr[i][j];
               
            }
             
        }
        System.out.print("Sum of all matrix is:"+sum);
    }
    +
    
}
