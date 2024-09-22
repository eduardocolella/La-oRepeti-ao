import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        int numeroAleatorio = random.nextInt(100) + 1;
        int palpite = 0;

        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (palpite != numeroAleatorio) {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();

            if (palpite < numeroAleatorio) {
                System.out.println("Número baixo! Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Número alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou!");
            }
        }
    }
}