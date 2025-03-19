package variaveis;

public class exercicios {
    public static void main(String[] args){

        /*
         * Exercício 1 
         * Crie uma variavel int parar armazenar um valor 10.
         * crie uma segunda variavel int para armazenar o dobro do valor da primeira variavel usando operadores aritméticos.
         */


         int valor = 10;

         int dobro = valor * 2 ;

         System.out.println(dobro);





         /*
          * Exercicio 2
            Declare uma variavel do tipo char que amacene o caractere 'B'
            Faça o casting explicito dessa variavel para int e imprima esse valor numerico.correspondente
          */

          char letra = 'B';
          int tabelaAscii = (int) letra;
          System.out.println(tabelaAscii);



          /*
           * Exercicio 3
           * Declare duas variaveis double para amarzenar os valores 15.75 e 20.40
           * some os valores dessas variaveis e armazene o resultado em uma nova variavel double
           * imprima o resultado
           */

           double valorA = 15.75;
           double valorB = 20.40;

           double soma = valorA + valorB;
           System.out.println(soma);



           long num = 2000_000_000L;
           int num2 = (int) num;
           System.out.println(num2);


           String ola = "Olá mundo!";
           String java = "Seja bem vindo ao Java!";

           System.out.println(ola + " " + java);
    }
}
