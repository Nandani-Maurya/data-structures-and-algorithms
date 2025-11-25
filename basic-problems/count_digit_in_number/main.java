 import java.util.*;
 public class main{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int i = 0;
    while (n > 0){
        n = n/10 ;
        i++;
    }
    System.out.println(i);
 }
}