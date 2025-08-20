import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int a = user.nextInt(), b = 1;
        if (1 <= a && a <= 9) {
            for (; b <= 9; b++) {

                System.out.println(a + " * " + b + " = " + a * b);
            }
        } else {
            System.out.println("1에서 9 사이의 숫자를 입력해주세요");
        }
    }
}