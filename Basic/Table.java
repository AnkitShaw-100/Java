package Basic;
import java.util.*;
class Table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, n, m, l;
        System.out.println("Enter the number of which table you want : ");
        l = sc.nextInt();
        System.out.println("Enter the limit : ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            m = l * i;
            System.out.println(l + " X " + i + " = " + m);
        }

    }
}
