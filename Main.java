import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your Number");
            int n=sc.nextInt();
            pattern(n);
        }
    }
    static void pattern(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col<=row; col++) {
                System.out.print(col);
            }
            System.out.println("");
        }
    }
}