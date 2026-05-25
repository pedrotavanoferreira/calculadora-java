import java.util.Scanner;
public class CalculaPalavra {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite qualquer frase ou palavra: ");
        String fraseUsuario = scanner.nextLine();
        long totalLetras = fraseUsuario.chars()
        .filter(Character::isLetter)
         .count();
        System.out.println("A frase ou palavra digitada tem " + totalLetras + " letras.");
        scanner.close();
       }
   }