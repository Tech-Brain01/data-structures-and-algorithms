package Pattern;

public class halfPyramid {
    public static void main(String[] args) {
        int n=10;
        for (int line = 0; line <=n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
