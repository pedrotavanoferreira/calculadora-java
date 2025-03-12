import java.util.Scanner;
import java.io.IOException;
public class MultiplicaPar {
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
            if (resultado % 2 == 0){
                System.out.println("A variável é um número par");
            }
        }
    }
   }    