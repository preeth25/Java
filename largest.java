public class exampels {
    public static void main(String[] args) {
        int c=10;
        int b=100;
        int a=700;
        int d=450;
        int e=690;
        
int largest=(a<b)&&(a<c)&(a<d)&(a<e)?a:
            (b<c)&(b<d)&(b<e)?b:
            (c<d)&(c<e)?c:
            (d<e)?d:e;
System.out.println(largest);

        
    }
    
}