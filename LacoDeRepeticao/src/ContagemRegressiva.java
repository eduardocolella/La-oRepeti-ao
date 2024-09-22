import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inicial para a contagem regressiva: ");
        int numeroInicial = sc.nextInt();

        while (numeroInicial >= 0) {
            System.out.println(numeroInicial);
            numeroInicial--;
        }
        System.out.println("Contagem regressiva concluída");
    }
}
