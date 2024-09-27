import java.util.Scanner;
public class ContarDez {
    public static void main(String[] args)
    {
       System.out.println("Digite um número:");
       int x;
       Scanner entrada = new Scanner(System.in);
       x = entrada.nextInt();
       for (int i = 1; i < 11; i++) {     // -> aqui o i começa em 0 e vai até 9, ou seja, 10 vezes
        System.out.println(x + i);    // -> aqui soma o valor do usuário (x) com cada valor de i e mostra na tela
     }
   }
}
