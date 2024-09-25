import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args)
    {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite seus kilos:");
       int Kilos;
       Kilos = entrada.nextInt();
       System.out.println("Digite sua altura em cm:");
       int Altura;
       Altura = entrada.nextInt();
       System.out.println("Digite sua altura em cm 2:");
       int Altura2;
       Altura2 = entrada.nextInt();
       int IMC;
       IMC = Kilos / (Altura * Altura2);
       System.out.print("Seu IMC é: "+ IMC);

   }
}
