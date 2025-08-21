import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int a = user.nextInt();
        String grade;
        if (a > 100 || a < 0) {
          grade = "바른 점수를 입력하시오.";
        }   else if
            (a >= 90) {
                grade = "A";
            } else if (a >= 80) {
                grade = "B";

            } else if (a >= 70) {
                grade = "C";

            } else if (a >= 60) {
                grade = "D";

            } else {
                grade = "F";
            }

            System.out.println(grade);
        }
    }