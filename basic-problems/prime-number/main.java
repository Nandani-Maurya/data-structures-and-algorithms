import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter how many times you want to check: ");
        int t = sc.nextInt();

        int i = 0;
        while (i < t) {
            System.out.print("Enter the number you want to check: ");
            int n = sc.nextInt();
            findNumberIsPrimeOrNot(n);
            i++;    
        }
    }

   
    public static void findNumberIsPrimeOrNot(int n) {

        int count = 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }

        if (count == 0 && n > 1) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
    }
}
