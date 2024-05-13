import java.util.*;
class binary{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int i,n,m,c=0;
        System.out.print("Enter the size of array : ");
        n =  sc.nextInt();
        int[] a = new int[n];
         for(i=0; i<n; i++){
            System.out.println("Enter the elements of array : ");
             a[i] = sc.nextInt();
         }
         System.out.println("Enter the search value : ");
         m = sc.nextInt();
         for(i=0; i<n; i++){
             if(a[i]==m){
                c++;
                System.out.println("Search value found at : " +i);
            }
         }
         System.out.println("Found " +c+" Times");
    }
}
