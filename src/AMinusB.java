import java.io.InputStream;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1001
public class AMinusB {
    public static void main(String[] args) {
        InputStream input = System.in;
        Scanner sc = new Scanner(input);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a - b);
    }
}
