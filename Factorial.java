import java.util.*;
class Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int f=1,i,n;
        System.out.println("Enter a number of which factorial is to be found : ");
        n = sc.nextInt();
        for(i=1; i<=n; i++){
            f = f * i;
        }
        System.out.println("Factorial of given number is : " +f);

    }
}