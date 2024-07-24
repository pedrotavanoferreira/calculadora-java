import java.util.Scanner;
public class FraseDia {
    public static void main(String[] args)
     {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 2:");
        int x = entrada.nextInt();
        if (x==1){
            System.out.println("Expansão de domínio");
        }else if (x==2){
            System.out.println("hoje é lindo");
        }else{
            System.out.println("Você digitou um número errado");
        }
    }
}