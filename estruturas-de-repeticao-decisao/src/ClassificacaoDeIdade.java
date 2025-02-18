
import java.util.Scanner;

public class ClassificacaoDeIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Menor = 0;
        int Maior = 0;
        for (int numpessoa = 1; numpessoa <= 5; numpessoa++) {
            System.out.println("Digite a idade da pessoa " + numpessoa + "°: ");
            int idade = scanner.nextInt();
            if (idade >= 18) {
                Maior++;
            } else {
                Menor++;
            }

        }
        scanner.close();
        System.out.println("Quantidade de pessoas maiores de idade: " + Maior);
        System.out.println("Quantidade de pessoas menores de idade: " + Menor);
    }
}