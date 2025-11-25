import java.util.*;
 public class main{
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the lowest number:");
      int n1 = sc.nextInt();
      System.out.println("Enter the highest mumber:");
      int n2 = sc.nextInt();
      for(int i = n1 ; i <= n2; i ++){
        int count = 0;
        for(int j = 2; j*j <= i; j++){
            if(i%j==0){
                count++;
            }
        }
        if(count == 0 && i>1){
          System.out.println(i + " is prime number.");   
        }
        else{
             System.out.println(i + " is not a prime number.");   
        }
      }  
    }
}