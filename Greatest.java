import java.util.*;
public class Greatest {
    public static void  greatestNum(int a,int b){
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
        return;
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greatestNum(a, b);
    }
}
