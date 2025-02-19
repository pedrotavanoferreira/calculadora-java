import java.util.Scanner;
public class ContarAteX {
    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
      System.out.println("Digite um número:");
      int x;
      x = entrada.nextInt();
      for (int i = 1; i <= 10; i++){
          System.out.println(i);
          if (i == x) {
            System.out.println("esse é o número que você escolheu:" +i);
          }
      }
  }
}
