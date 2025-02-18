import java.util.ArrayList;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String continuar;
        do {
            int num = 0;
            boolean entradaValida = false;
            while (!entradaValida) {
                System.out.println("Digite um número: ");
                try {
                    num = scanner.nextInt();
                    entradaValida = true;
                } catch (Exception e) {
                    System.out.println("Digite um número válido.");
                    scanner.nextLine();
                }
            }

            if (num % 2 == 0) {
                par.add(num);
            } else {
                impar.add(num);
            }

            System.out.println("Deseja continuar? (s/n)");
            continuar = scanner.next().toLowerCase();

        } while (continuar.equals("s"));
        scanner.close();

        if (par.size() == 0) {
            System.out.println("Nenhum número par foi digitado.");
        } else {
            System.out.println("Numeros pares: ");
            for (int numpar : par) {
                System.out.println(numpar);

            }
        }

        if (impar.size() == 0) {
            System.out.println("Nenhum número impar foi digitado.");
        } else {
            System.out.println("Numeros impares: ");
            for (int numimpar : impar) {
                System.out.println(numimpar);
            }
        }

    }
}
