package Basic;
import java.util.*;
class sum{
    public static void main(){ 
        Scanner sc = new Scanner(System.in);
        int r,s=0,n;
        System.out.println("Enter a number ");
        n =  sc.nextInt();
        while(n>0){
            r = n % 10;
            s = s + r;
            n = n / 10;
        }
        System.out.println("The sum of digits : " + s);
    }
}