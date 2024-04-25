import java.util.Scanner;
public class VerificaMenoridade {

    public static  void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a idade:");
        int x;
        x = entrada.nextInt();
        System.out.println("A idade digitada é:" + x);
        if (x > 17){
            System.out.println("É maior de idade");
        }else {
            System.out.println("É menor de idade");
        }
    }
}