import java.util.Scanner;
public class VerificaNota {
    public static void main(String[] args)
     {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma nota:");
        int x = entrada.nextInt();
        System.out.println("Digite uma segunda nota:");
        int y = entrada.nextInt();
        int m = (x + y) / 2;
        System.out.println("sua média final é "+ m);
    };
}
