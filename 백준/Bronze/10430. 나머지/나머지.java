import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner user = new Scanner(System.in);
        int a = user.nextInt(),b =user.nextInt(),c =user.nextInt();
        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }
}

