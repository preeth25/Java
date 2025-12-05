import java.util.*;
import java.io.*;


// public class elect {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter the electricity units consumed:");
//         int units = in.nextInt();
//         double billAmount;

//         if (units <= 30) {
//             billAmount = units * 3.50;
//             System.out.println("Total electricity bill amount: " + billAmount);
//         } else if (units >=30&& units < 50) {
//             billAmount = units * 4.25;
//             System.out.println("Total electricity bill amount: " + billAmount);
//         } else if(units>=50 && units < 100){
//             billAmount = units * 5.25;
//             System.out.println("Total electricity bill amount: " + billAmount);
//         }else if (units>=100){
//             billAmount = units * 5.85;
//             System.out.println("Total electricity bill amount: " + billAmount);
//         }else 
//         {
//             System.out.println("the total amount is" +units);
//         }

        
        
//     }
// }



// public class elect {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter the size of pizza (Small/Medium/Large/very large):");
//         String size = in.nextLine();
//         double price;

//         switch (size) {
//             case "small":
//                 price = 125.00;
//                 System.out.println("Price of Small Pizza: " + price);
//                 break;
//             case "medium":
//                 price = 250.00;
//                 System.out.println("Price of Medium Pizza: " + price);
//                 break;3
                
//             case "large":
//                 price = 300.00;
//                 System.out.println("Price of Large Pizza: " + price);
//                 break;
//             case " very large":
//                 price = 350.00;
//                 System.out.println("Price of Large Pizza: " + price);
//                 break;
//             default:
//                 System.out.println("Invalid size entered.");
//                 break;
//         }
//     }
// }


public class elect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password;
        do {
            System.out.println("Enter the password:");
            password = in.nextLine();
            if(password=="")
            {
                System.out.println("Incorrect password. Try again.");
            }else{
                break;
            }
        } while (password=="1234");
        
    
    }
    }

  