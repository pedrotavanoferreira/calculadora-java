import java.util.Scanner;
public class LacoSubtrair {
    public static void main(String[] args)
     {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int x;
        x = entrada.nextInt();
        for (int i = 0; i < 8; i++){
            x = x - 1;
            System.out.println("Número agora é:"+ x);
        }
    }
}