import java.io.IOException; 
public class Test18 { public static void main(String args[]) throws IOException {
     int n, sum, total=0; 
    System.out.println("Please input(0~9):");
     n = System.in.read(); n -= 48; 
     for (int j = 1; j <= n; j++)
      { sum = 1; for (int i = 1; i <=j; i++) sum *= i; total +=sum; } 
      System.out.println("各阶乘之和为: "+ total); } }
