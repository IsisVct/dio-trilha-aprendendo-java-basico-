import java.util.Scanner;

public class CepInvalidoException extends Exception {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um cep: ");
    String cep = scanner.next();
    scanner.close();
    try {
      String cepFormatado = formatarCep(cep);
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      System.out.println("Cep inválido");
    }
  }

  static String formatarCep(String cep) throws CepInvalidoException {
    // Verificar se o CEP tem exatamente 8 dígitos numéricos
    if (cep.length() != 8 || !cep.matches("[0-9]+")) {
      throw new CepInvalidoException();
    }

    return cep.substring(0, 5) + "-" + cep.substring(5);
  }
}