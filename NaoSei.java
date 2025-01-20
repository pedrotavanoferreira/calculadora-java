import java.util.Scanner;

public class NaoSei {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int x;
        x = entrada.nextInt();
        int y;
        y = entrada.nextInt();
        int w;
        w = entrada.nextInt();
        int z=x*y*w;
  
        System.out.println("o valor de x+y+w=" + z);
      }
}
