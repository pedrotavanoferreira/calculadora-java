import java.util.Scanner;
public class LacoDeRegressao{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
       System.out.println("Digite um número:");
       int i;
       i = entrada.nextInt();
       for (int x = 1; x <= i; i--){
           System.out.println(i);
       }
   }
}