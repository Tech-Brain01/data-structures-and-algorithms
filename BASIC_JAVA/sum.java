import java.util.*;

public class sum {
    public static void main(String[] args) {
        System.out.print("Enter the raduies :");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = 3.14f*r*r ;
        System.out.println("The area of a circle is :"+area);


        sc.close();
    }
}
