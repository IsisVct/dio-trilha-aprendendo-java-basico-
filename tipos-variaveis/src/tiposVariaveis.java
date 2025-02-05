public class tiposVariaveis {
    public static void main(String[] args) {
        // Variáveis primitivas
        int idade = 25; // Inteiro
        double altura = 1.75; // Ponto flutuante
        char genero = 'M'; // Caractere
        boolean estudante = true; // Booleano
        final double RA = 665464;// contante

        // Variáveis de referência (objetos)
        String nome = "João Silva"; // String é uma classe em Java
        Integer numero = 100; // Integer é uma classe wrapper para o tipo primitivo int

        // Exibindo os valores das variáveis
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Gênero: " + genero);
        System.out.println("É estudante? " + estudante);
        System.out.println("Número: " + numero);
        System.out.println("RA: " + RA);

        // Modificando os valores das variáveis
        idade = 30;
        altura = 1.80;
        genero = 'F';
        estudante = false;
        nome = "Maria Oliveira";
        numero = 200;

        // Exibindo os novos valores das variáveis
        System.out.println("\nApós a modificação:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Gênero: " + genero);
        System.out.println("É estudante? " + estudante);
        System.out.println("Número: " + numero);
    }
}
