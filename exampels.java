import java.util.*; 
import java.io.*;






public class exampels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a total amount:");
        int amount = in.nextInt();
        if(amount>=2000){
            int discount = (amount*15)/100;
            System.out.println("Discounted amount is: " + (amount - discount));

        }else if(amount>=1000){
            double discount=(amount*8)/100;
            System.out.println("Discounted amount is: " + (amount - discount));
        }else{
            System.out.println("No discount applicable. Total amount is: " + amount);
        }
    }
}