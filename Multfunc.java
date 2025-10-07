import java.util.*;
public class Multfunc {
    public static int multiplyNum(int a,int b){
        int multiply=a*b;
        return multiply;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiply = multiplyNum(a,b);
        System.out.println("The product of a and b is : "+multiply);
    }
    
}
