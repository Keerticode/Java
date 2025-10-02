
import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
         if(age>=18){
            System.out.println("The Candidate is eligible for voting");
         }else{
            System.out.println("The Candidate is not eligible for voting");
         }
    }
}
