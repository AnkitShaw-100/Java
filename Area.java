import java.util.*;
class Area{
    void square(){
        int a,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of a sqaure : ");
        a = sc.nextInt();
        area = a*a;
        System.out.println("Area of Square : " +area);
        
    }
    void rectangle(){
        int l,b,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle : ");
        l = sc.nextInt();
        System.out.println("Enter breadth of reactangle : ");
        b = sc.nextInt();
        area = l*b;
        System.out.println("Area of Rectangle : " +area);
        
    }
    void circle(){
        int r,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        r = sc.nextInt();
        area = (22/7)*r*r;
        System.out.println("Area of circle : " +area);
    }
    void triangle(){
        int h,b;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of triangle : ");
        h = sc.nextInt();
        System.out.println("Enter base of triangle : ");
        b = sc.nextInt();
        area = 0.5 * h * b;
        System.out.println("Area of Triangle : " +area);
    }
    void trapezium(){
        int a,h,b,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of figure ");
        a = sc.nextInt();
        System.out.println("Enter height of figure ");
        h = sc.nextInt();
        System.out.println("Enter base of figure ");
        b = sc.nextInt();
        area = ((a+b)/2)*h;
        System.out.println("Area of Trapezium : " +area);    
    }
    void main(){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("For area of Sqaure      Press 1");
        System.out.println("For area of Rectangle   Press 2");
        System.out.println("For area of Circle      Press 3");
        System.out.println("For area of Triangle    Press 4");
        System.out.println("For area of Trapezium   Press 5");
        a = sc.nextInt();
        if (a==1){ 
           square();
        }
        if (a==2){ 
           rectangle();
        }
        if (a==3){ 
           circle();
        }
        if (a==4)
        { 
           triangle();
        }
        if (a==5)
        { 
           trapezium();
        }
        System.out.println("To reuse the program press 0 \nTo Exit the program press 1");
        b = sc.nextInt();
        if(b==0){
            main();
        }
        if (b==1){
           System.exit(0); 
        
        }
        else{
           System.out.println("Invalid input");
           System.exit(0); 
        }
       }
    }
