import java.util.*;

public class AllFunctions {

    Scanner sc = new Scanner(System.in);

    // Sum of all elements of array
    void sumOfAllElements() {
        int sum = 0;
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println("The sum of array is : " + sum);
    }

    // Count all even and odd element in array
    void countEvenOddElements() {
        int even = 0, odd = 0;
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("The even elements in the array are : " + even);
        System.out.println("The odd elements in the array are : " + odd);
    }

    // Sorting array in ascending order
    void ascendingOrder() {
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array is sorted in ascending order : " + Arrays.toString(a));
    }

    // Sorting array in Descending order
    void descendingOrder() {
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Array is sorted in descending order : ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Finding min max as per the user
    void minMax() {
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Max value entered is : " + a[n - 1]);
        System.out.println("Min value entered is : " + a[0]);
    }

    // Character array to change case as per the user
    void changingCase() {
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        char[] a = new char[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.next().charAt(0);
        }

        System.out.print("Enter 1 for changing the case to lower case \nEnter 2 for changing the case to upper case: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                for (int i = 0; i < n; i++) {
                    a[i] = Character.toLowerCase(a[i]);
                }
                System.out.println("The elements are: " + Arrays.toString(a));
                break;

            case 2:
                for (int i = 0; i < n; i++) {
                    a[i] = Character.toUpperCase(a[i]);
                }
                System.out.println("The elements are: " + Arrays.toString(a));
                break;

            default:
                System.out.println("Invalid choice!!");
                break;
        }
    }
public static void main(String[] args) {
    AllFunctions obj = new AllFunctions(); // Create an instance of AllFunctions
    int ch;
    do {
        System.out.println("Press 1 for Sum of all elements of array\n" +
                "Press 2 for counting all even and odd elements in array\n" +
                "Press 3 for Sorting array in ascending order\n" +
                "Press 4 for Sorting array in descending order\n" +
                "Press 5 for finding max and min elements of array\n" +
                "Press 6 to change case of array\n" +
                "Press 0 to exit");
        ch = obj.sc.nextInt(); // Use the instance variable sc of AllFunctions
        switch (ch) {
            case 1:
                obj.sumOfAllElements();
                break;
            case 2:
                obj.countEvenOddElements();
                break;
            case 3:
                obj.ascendingOrder();
                break;
            case 4:
                obj.descendingOrder();
                break;
            case 5:
                obj.minMax();
                break;
            case 6:
                obj.changingCase();
                break;
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice!!");
                break;
        }
    } while (ch != 0);
    obj.sc.close(); // Close the Scanner
}
}


