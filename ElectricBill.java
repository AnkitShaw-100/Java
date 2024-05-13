import java.util.*;

class ElectricBill {
    public static void main(String[] args) {
        ElectricBill eb = new ElectricBill();
        eb.calculateBill();
    }

    public void calculateBill() {
        double x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the units consumed: ");
        x = sc.nextDouble();

        if (x <= 100) {
            y = (200 + (x * 2));
            System.out.println("Electricity Bill: " + y);
        } else if (x >= 100 && x < 200) {
            y = ((x * 2) + (x * 1.8));
            System.out.println("Electricity Bill: " + y);
        } else {
            y = (x * 2) + (x * 1.8) + (x * 1.5);
            System.out.println("Electricity Bill: " + y);
        }
        checkContinue();
    }

    public void checkContinue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wish to calculate another bill? (Press 0 to continue, any other key to exit)");
        int v = sc.nextInt();
        if (v == 0) {
            calculateBill();
        } else {
            System.out.println("Exiting program...");
            System.exit(0);
        }
    }
}
