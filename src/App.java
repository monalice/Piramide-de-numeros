import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Qual o tamanho da piramide?");

        Scanner s1 = new Scanner(System.in);
        int num = s1.nextInt();

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
