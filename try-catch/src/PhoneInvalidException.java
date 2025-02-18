import java.util.Scanner;

public class PhoneInvalidException extends Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um telefone com o DDD: ");
        String numerPhone = scanner.next();
        scanner.close();
        try {
            String numberFormatted = formatNumber(numerPhone);
            System.out.println(numberFormatted);
        } catch (PhoneInvalidException e) {
            System.out.println("Número inválido");
        }
    }

    static String formatNumber(String numberPhone) throws PhoneInvalidException {
        // Verificar se o CEP tem exatamente 8 dígitos numéricos
        if (numberPhone.length() != 11 || !numberPhone.matches("[0-9]+")) {
            throw new PhoneInvalidException();
        }

        return "(" + numberPhone.substring(0, 2) + ")" + numberPhone.substring(2, 7) + "-"
                + numberPhone.substring(7, 11);
    }
}
