import java.util.Scanner;
public class VerificaDivisivelPor3 {
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int x;
        x = entrada.nextInt();
        System.out.println("O número digitado é:" + x);
        if (x % 3 == 0){
            System.out.println("A variável é divisível por 3");
        }else {
            System.out.println("A variável não é divisível por 3");
        }
    }
}
