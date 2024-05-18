package Array;
import java.util.*;
class Order{
    public static void main(){
    Scanner sc = new Scanner(System.in);
    int i,j,n,temp;
    System.out.println("Enter the size of array : ");
    n = sc.nextInt();
    int[] a = new int[n];
     for(i=0; i<n; i++){
        System.out.println("Enter the elements of array : ");
        a[i] = sc.nextInt();
    }
    for(i=0; i<n; i++){
        for(j=0; j<n-1; j++){
                if(a[j]>a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
            }
        }
    }
    for(i=0; i<n; i++){
        System.out.println("Array is sorted in ascending order :" +a[i]);
    }
    System.out.println("|||||*****************************************|||||");
    for(i=0; i<n; i++){
        for(j=0; j<n-1; j++){
                if(a[j]<a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
            }
        }
    }
    for(i=0; i<n; i++){
        System.out.println("Array is sorted in descending order :" +a[i]);
    }
    }
}