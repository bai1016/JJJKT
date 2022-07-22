public class Test17 {
    public static void main(String args[]){
    int length = 70; 
    int firstYear = 1970; 
    int year;
     for (int i =0; i < length; i++) 
     { year = firstYear + i; 
        if((year%4==0&&year%100!=0)|| year%400==0)
         System.out.println(year); }
    
}
}