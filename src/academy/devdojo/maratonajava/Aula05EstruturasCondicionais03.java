package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salario > 5000
        // operador ternário tema de aula > 3 condiçoes para ser utilizado (condicao) ? verdadeiro : falso
        Double salario = 3200.0;

        String resultado = salario >= 5000 ? "Eu vou doar 500 pro DevDojo " : "Ainda não tenho condições, mas vou ter ! ";

        System.out.println(resultado);


    }
}
