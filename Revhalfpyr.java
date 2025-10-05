import java.util.*;
public class Revhalfpyr {
    public static void main(String[] args){
        int a=4;
        for(int i=1;i<=a;i++){
            for(int j=i;j<=a;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    } 
}
//we can also invert outer for loop by this syntax as well
//for(int i=n;i>=1;i--)
