import java.util.*;
public class Vote {
    public static void eligibleVote(int n){
        if(n>18){
            System.out.println("The person is eligible to vote");
        }else{
            System.out.println("The person is not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        eligibleVote(n);
    }
    
}
