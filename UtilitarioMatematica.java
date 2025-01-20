import java.util.Scanner;

public class UtilitarioMatematica {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int x;
        x = entrada.nextInt();
        int y;
        y = entrada.nextInt();
        int w;
        w = entrada.nextInt();
        int z=x*y*w;
  
        System.out.println("o valor de x*y*w=" + z);

        if (x % 2 == 0){
          System.out.println("O primeiro número é par");
        }
        if (y % 2 == 0){
          System.out.println("O segundo número é par");
        }
        if (w % 2 == 0){
          System.out.println("O terceiro número é par");
        }
      }
}
