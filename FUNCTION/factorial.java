package FUNCTION;

public class factorial {
    public static int factorial(int n){
        int f = 1;

        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }

    public static int binCoeff(int n , int r) {
           int n_fact = factorial(n);
           int r_fact = factorial(r);
           int nmr_fact = factorial(n-r);

           int binCoeff = n_fact / (r_fact * nmr_fact);

            return binCoeff;
    }

 public static void main(String[] args){
    int n = 5;
    int r = 2;
    int ans = factorial(n);
    System.out.println("factorial is :" + ans);
    System.out.println("Binomial Coefficient is : " + binCoeff(n , r));
 }
}
