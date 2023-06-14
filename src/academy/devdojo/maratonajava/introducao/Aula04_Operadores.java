package academy.devdojo.maratonajava.introducao;

public class Aula04_Operadores {
    public static void main(String[] args) {
        int number01 = 10;
        int number02 = 20;
        int result = number02 - number01;
        double resultdi = number01 / (double) number02;
        System.out.println(result);
        System.out.println(resultdi);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >=  == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("IsDezMaiorQueVinte " +isDezMaiorQueVinte);

        // Operadores Logicos && ( AND)  || (or) ! (ou)
        int idade = 25;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "  +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " +isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPS5 = 5000F;

        // || PIPE é igual a ou e & como função de comparação. > se alguma condição for verdadeira
        // do isPS5Compravel como a varaivel valor total conta corrente ou || valor total conta pou
        // a função faz a comparação e retorno true ou false julgando que o valor possuido é maior
        // que o valor necessitado nesse caso de 5000 temos 10200 no total poupanca + corrente.

        boolean isPS5Compravel = valorTotalContaCorrente > valorPS5 || valorTotalContaPoupanca > valorPS5;
        System.out.println("isPS5Compravel " +isPS5Compravel);

    }
}
