package academy.devdojo.maratonajava.introducao;

public class OperadoresDeAtribuição {
    // = +=  -= *= %= /=     >>>>>> %= é resto, sendo resto sempre 0.0;
    public static void main(String[] args) {
        double bonus = 1800;
        bonus += 1000;  // 2800 é o valor do bonus nessa linha de código.
        bonus -= 1000; // 1800 é o valor de bonus nessa linha de código.
        System.out.println(bonus);

        //

        int contador = 0;
        contador += 1; // contador = contador +1 ; forma burra de fazer //
        contador++; // forma mais ou menos esperta;
        ++contador; // se colocar antes ele incrementa o valor primeiro e depois executa o código
        // no sout chamando o código contador.

        System.out.println(contador);


    }
}
