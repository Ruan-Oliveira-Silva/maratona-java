package academy.devdojo.maratonajava.JavaCore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.JavaCore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizado CalculadoraTest01");

        calculadora.subtraiDoisNumeros();

    }
}
