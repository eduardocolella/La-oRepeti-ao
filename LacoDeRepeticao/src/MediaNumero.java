import java.util.Scanner;
public class MediaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir? ");
        int n = sc.nextInt();
        double soma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = sc.nextDouble();
            soma += numero;
        }

        double media = soma / n;
        System.out.println("A média dos números inseridos é: " + media);
    }
}