import java.util.Scanner;
public class VerificaNumeroValido {

    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10:");
        int x;
        x = entrada.nextInt();
        System.out.println("O número digitado é:" + x);
        if (x > 0 && x <= 10){
            System.out.println("O número é válido");
        }else {
            System.out.println("O número é inválido");
        }
    }
}