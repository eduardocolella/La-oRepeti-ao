import java.util.Scanner;

public class ValidacaoDeEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 0;


             do {
                System.out.print("Digite sua idade: ");
                idade = sc.nextInt();

                if (idade <= 0) {
                    System.out.println("Idade inválida, tente novamente.");
                }
            } while (idade <= 0);

            System.out.println("Idade válida: " + idade);
        }
    }

