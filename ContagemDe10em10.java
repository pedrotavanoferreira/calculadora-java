import java.util.Scanner;
public class ContagemDe10em10 {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
       System.out.println("Digite um número:");
       int x;
       x = entrada.nextInt();
       for (int i = 1; i <= x; i++){
           System.out.println(i*10);
       }
   }
}
