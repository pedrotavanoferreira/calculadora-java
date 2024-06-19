import java.util.Scanner;
public class VerificaParFazerFrase {
    public static void main(String[] args)
     {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int x;
        x = entrada.nextInt();
        for (int i = 0; i < x; i++){
            if (i % 2 == 0){
                System.out.println("Este é um laço par: "+ i);
            }
        }
    }
}
