import java.util.HashMap;

public class TwoSixFiveTwo_solution {


    public int sumOfMultiples(int n) {
        return f(n,3)+f(n,5)+f(n,7)-f(n,15)-f(n,21)-f(n,35)+f(n,105);
    }

    public int f(int n,int m){
        return (n/m)*m*(1+(n/m))/2;
    }

}
