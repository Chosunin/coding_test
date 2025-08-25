import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt(), j = sc.nextInt();
        int j1 = j % 10;
        int j2 = (j / 10) % 10;
        int j3 = j / 100;

        System.out.println(i * j1);
        System.out.println(i * j2);
        System.out.println(i * j3);
        System.out.println(i * j);
    }
}