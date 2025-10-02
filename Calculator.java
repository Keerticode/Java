import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("1:+(Addition)");
        System.out.println("2:-(Substraction)");
        System.out.println("3:*(Multiplication)");
        System.out.println("4:/(Division)");
        System.out.println("5:%(Remainder)");
        System.out.println("Enter your choice(+,-,*,/%):");
        int choice=sc.nextInt();
        switch(choice){
            case 1 : System.out.println(a+b);
            break;

            case 2 : System.out.println(a-b);
            break;

            case 3 : System.out.println(a*b);
            break;

            case 4 : System.out.println(a/b);
            break;

            case 5 : System.out.println(a%b);
            break;

            default : System.out.println("Invalid Operator");
        }
    }
}
