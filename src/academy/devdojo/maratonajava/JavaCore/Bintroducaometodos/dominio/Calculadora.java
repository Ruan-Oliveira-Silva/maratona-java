package academy.devdojo.maratonajava.JavaCore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);

    }

    public void subtraiDoisNumeros() {
        System.out.println(20 - 15);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(int num1, double num2) {
        return (int) (num1 / num2);
    }

    public void imprimeDoisDivisao(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0 ");
            // para nao usar else, podemos usar um return; em forma de um break point.
        } else {
            System.out.println(num1 / num2);
        }
    }
}
