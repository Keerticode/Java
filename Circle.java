import java.util.Scanner;

public class Circle {
    public static float circumferenceCircle(int r,float pie){
        float circum = 2*pie*r;
        return circum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        float pie = sc.nextFloat();
        float circum = circumferenceCircle(r, pie);
        System.out.println("The circumference of the circle is : "+circum);
    }
}
