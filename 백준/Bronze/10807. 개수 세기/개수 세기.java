import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        int[] arry1 = new int[a];
        for(int i = 0; i < a; i++ ){
            arry1[i] = sc.nextInt();
        }
        int v = sc.nextInt();
     for(int i = 0; i < a; i++){
       
         if (arry1[i] == v){count++;}
     }
     System.out.println(count);

    }
}
