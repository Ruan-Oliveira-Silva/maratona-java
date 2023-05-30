package academy.devdojo.maratonajava;

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

    }
}
