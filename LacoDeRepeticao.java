import java.util.Scanner;
public class LacoDeRepeticao {
    public static void main(String[] args)
     {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int x;
        x = entrada.nextInt();
        for (int i = 0; i < x; i++){
            System.out.println("Expansão de domínio");
        }
    }
}
