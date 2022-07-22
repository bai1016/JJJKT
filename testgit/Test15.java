import java.io.IOException;
 class Test15 {
    public static void main(String args[]) throws IOException { char c; StringBuffer buffer = new StringBuffer(); 
        System.out.println("输入一句子以.表示结束"); 
        do { c = (char) System.in.read(); buffer.append(c); } 
        while (c != '.');
     System.out.println("Output = " + buffer.toString()); }
}
