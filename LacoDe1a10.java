import java.util.Scanner;
public class LacoDe1a10 {
    public static void main(String[] args)
     {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10:");
        int x;
        x = entrada.nextInt();
        for (int i = 1; i <= 10; i++){
           System.out.println(i);
            if (i == x){
                System.out.println("você digitou:"+i);
            }
        }
    }
}