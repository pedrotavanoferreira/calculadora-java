import java.util.Scanner;
public class Switch {
    public static void main(String[] args)
     {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um dia da semana:");
        int x = entrada.nextInt();
        switch(x) {
            case 1:
              System.out.println("segunda");
              break;
            case 2:
              System.out.println("terça");
              break;
            case 3:
              System.out.println("quarta");
              break;
            case 4:
              System.out.println("quinta");
              break;
            case 5:
              System.out.println("sexta");
              break;
            default:
              System.out.println("Não é um dia útil");
          }
    }
}
