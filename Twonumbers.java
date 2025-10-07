import java.util.*;
public class Twonumbers {
    public static double printExponent(int x,int n) {
        double exponent = Math.pow(x,n);
        return exponent;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        double exponent = printExponent(x, y);
        System.out.println("The exponent of x and n are :"+exponent);
    }
}
