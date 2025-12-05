public class Arr2{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the  array size");
        int n = in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }   
    }
}