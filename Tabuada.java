import java.util.Scanner;
import java.io.IOException;
public class Tabuada {
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar um número: ");
        int entrada = scanner.nextInt();
        int multiplicador = 0;
        while(multiplicador <= 10)
        {
            int resultado = entrada * multiplicador;
            System.out.println(resultado);   
            multiplicador++;
        }
   }    
}
