import java.util.Scanner;
public class If {
    public static void main(String args[]) 
    { 
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println("favor digitar um número:");
        x = entrada.nextInt();
        System.out.println("O número digitado é:" + x);
        if (x==0){
            System.out.println("a variável é o número 0");
        }else if (x==2){
            System.out.println("a variável é o número 2");
        }
         else {
            System.out.println("a variável não é o numero 0");
        }
    }
}
