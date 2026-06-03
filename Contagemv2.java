import java.util.Scanner;
public class Contagemv2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira qualquer número:");
        int x;
        x = entrada.nextInt();
        for (int i = 1; i <= x; i++){
            System.out.println(i);
            if (i == x){
                System.out.println("Esta é a quantidade de números que você escolheu:" +i);
            }
        }
    }
}
