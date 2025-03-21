package variaveis;

public class Variavel {
     {
       
        // 1 - O que são variáveis
        // tipo -> nome -> atribuir um valor;
        String nome = "Pedro";

        // nome => "Matheus"
        System.out.println(nome);

        // 2 - Atribuição de variável com outra
        String teste = "Teste";

        String testando = teste;

        System.out.println(testando);

        long numeroGrande = 999999999999999L;

        // int numeroGrandeDois = numeroGrande;

        System.out.println(numeroGrande);

        // 3 - Comentários 

        /*

        Comentario linha 1
        Linha 2
        Linha 3

        */

        /**
         * 
         * Função para somar números
         * 
         * param1: Primeiro numero
         * param2: Segunda numero
         * 
         * Retorno: A soma
         * 
         */

        //  4 - Strings

        String firstName = "Matheus";
        String lastName = "Battisti";

        System.out.println("Matheus Battisti");

        System.out.println(firstName + " " + lastName);

        System.out.println("O nome dele é: " + firstName);

        String fullName = firstName + " " + lastName;

        // concatenação = operador + nas strings, para uni-las
        System.out.println(fullName);

        // 5 - Char

        char letra = 'A';

        System.out.println(letra);

        String letra2 = "A";

        System.out.println(letra2);

        char simbolo = '$';

        System.out.println(simbolo);

        // 6 - int

        int n = 42;

        System.out.println(n);

        System.out.println(n + 5);

        System.out.println(n * 10);

        System.out.println(n / 5);

        int soma = n + 12;

        System.out.println(soma);

        // 7 - Long

        long populacaoMundial = 7800000000000L;

        System.out.println(populacaoMundial);

        long grandeNumero = 1_000_000L;

        System.out.println(grandeNumero + 1);

        // 8  - Double
        double preco = 19.99;

        System.out.println(preco);

        System.out.println(preco - 12);

        System.out.println(preco / 2);

        double pi = 3.141_592_123;

        System.out.println(pi);

        double valorComD = 12.1D;

        System.out.println(valorComD);

        // 9 - OP. aritmeticos p1

        int soma2 = 12 + 5;

        System.out.println(soma2);
        
        System.out.println(22 + 4);

        System.out.println(10 - 5);

        System.out.println(10 * 5);

        System.out.println(10 / 2.5);

        System.out.println(10.0 / 2.5);

        // para ter um resultado quebrado (1.5), pelo menos 1 num da divisao tem q ser double

        System.out.println(10 / 3);

        System.out.println(10.0 / 3);

        System.out.println(10 % 3);

        // 10 - op. aritmeticos p2

        int x = 6;

        x++;
        x++;
        x++;
        x++;
        System.out.println(x);

        int y = 5;

        y--;

        System.out.println(y);
    }
}
