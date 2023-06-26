package academy.devdojo.maratonajava.JavaCore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.JavaCore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);

        System.out.println("_______________________");
        calculadora.imprimeDoisDivisao(86,0);


    }
}
