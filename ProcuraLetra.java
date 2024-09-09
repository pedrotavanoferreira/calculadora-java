import java.util.Scanner;
public class ProcuraLetra {
    public static void main(String[] args)
     {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite uma palavra:");
        String x;
        char letraProcurada = 'a';
        int count = 0;

        x = entrada.next();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == letraProcurada) {  // Aqui o sistema compara se cada letra do texto é igual a letradaProcurada.
                count++;                                           // Se sim, soma mais um na variável count.
            }
        }
        
        System.out.print("O número de vezes que a letra a existe no texto informado é:" + count);
    }
}
