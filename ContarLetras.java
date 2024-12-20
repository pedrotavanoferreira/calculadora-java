import java.util.Scanner;
public class ContarLetras{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
       System.out.println("Digite uma palavra:");
       String x;
       x = entrada.nextLine();
       System.out.println("A quantidade de letras é:"+ x.length());
   }
}
