import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        long fatorial = 1;

        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        numero = sc.nextInt();


        if (numero < 0) {
            System.out.println("Fatorial não definido para números negativos.");
        } else {
            int i = 1;

            do {
                fatorial *= i;
                i++;
            } while (i <= numero);

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
}