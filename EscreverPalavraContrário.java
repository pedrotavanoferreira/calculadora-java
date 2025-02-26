import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class EscreverPalavraContrário {
    public static void main(String[] args)
     {
        String hi = "Hello world";
        System.out.println(new StringBuilder(hi).reverse().toString());

         String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");

        String fraseInvertida = new StringBuilder(frase).reverse().toString();
        
         System.out.println(fraseInvertida);
}
}