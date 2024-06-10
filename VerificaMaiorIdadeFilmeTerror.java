import java.util.Scanner;
public class VerificaMaiorIdadeFilmeTerror {

    public static  void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a idade:");
        int x;
        x = entrada.nextInt();
        System.out.println("A idade digitada é:" + x);
        if (x > 13){
            System.out.println("Pode assistir, você tem 14 anos ou mais");
        }else {
            System.out.println("É menor de 14 anos, não pode assistir sozinho");
        }
    }
}