import java.util.Scanner;
public class For10a20 {
    public static void main(String[] args)
     {
        Scanner entrada = new Scanner(System.in);
        System.ou.println("Digite um número de 10 a 20:");
        int x;
        x = entrada.nextInt();
        for (int i = 10; i <= 20; i++){
              System.out.println(i);
              if (i == x){
                System.out.println("Você digitou:"+i);
              }
        }
    }
}