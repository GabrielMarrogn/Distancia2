import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int formula = 60 * a /30;
        System.out.println(formula +" minutos");
    }
}
