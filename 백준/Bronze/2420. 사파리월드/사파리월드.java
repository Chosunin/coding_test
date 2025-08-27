import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong(), j = sc.nextLong();

        long k = i - j;
        long m = Math.abs(k);

        System.out.println(m);


    }
    }