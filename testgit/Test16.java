import java.io.IOException;
public class Test16 {
    public static void main(String args[]) throws IOException { int i, n, sum=1; 
        System.out.println("Please input(0~7):"); 
        n = System.in.read(); n -= 48; 
        for (i = 1; i <= n; i++) 
        sum *= i; 
        System.out.println(n + "!= " + sum); }
}
