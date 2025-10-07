import java.util.*;
<<<<<<< HEAD
public class Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
=======
public class Numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive=0; int negative=0; int zeros=0;
        char choice;

        do {
            System.err.print("Enter a number: ");
            int num = sc.nextInt();
            
            if(num>0){
                positive++;
            }else if (num<0){
                negative++;
            } else{
                zeros++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);  
        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nCount of positive numbers: " + positive);
        System.out.println("\nCount of negative numbers: "+ negative);
        System.out.println("\nCount of negative numbers: "+ zeros);

        sc.close();
    
    }
}
>>>>>>> fc51a52 (Add exercise files)
