import java.util.*;

public class Findingnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter the values for 1st matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                
                System.out.print("Enter the value for row"+(i+1)+" column"+(j+1)+": ");
                arr[i][j]=sc.nextInt();
            }
        }
        int num1=0, num2=0, num3=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]>=1 && arr[i][j]<=50){
                    num1++;
                } else if(arr[i][j]>50 && arr[i][j]<=100){
                    num2++;
                } else if(arr[i][j]>100){
                    num3++;
                }
            }
        }
        System.out.println("Numbers between 1 to 50: " +num1);
        System.out.println("Numbers between 51 to 100: " + num2);
        System.out.println("Numbers above 100: " + num3);  

    }   
}




