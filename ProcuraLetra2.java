import java.util.Scanner;
public class ProcuraLetra2 {
    public static void main(String[] args)
     {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite uma palavra e eu vou achar quantas letras b existem nela:");
        String x;
        char letraProcurada = 'b';
        int count = 0;

        x = entrada.next();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == letraProcurada) {
                count++;
            }
        }
        
        System.out.print("O número de vezes que a letra b existe no texto informado é:" + count);
    }
}
