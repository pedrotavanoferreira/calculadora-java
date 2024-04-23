import java.util.Scanner;
public class VerificaPar{

    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int x;
        x = entrada.nextInt();
        System.out.println("O número digitado é:" + x);
        if (x % 2 == 0){
            System.out.println("A variável é um número par");
        }else {
            System.out.println("A variável é um número ímpar");
        }
    }

}