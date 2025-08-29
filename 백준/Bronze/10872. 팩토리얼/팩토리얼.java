import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int result = 1;
        for(int i = 1; i <= j; i++) {
            result *= i;
        }
        System.out.println(result);
        sc.close();
        }


    }