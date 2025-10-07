import java.util.*;
public class Average {
    public static float printAverage(int m1, int m2, int m3){
        float average = (m1+m2+m3)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
    
    float average = printAverage(m1, m2, m3);
    System.out.println("The average of the Student is : "+average);
    }
}
