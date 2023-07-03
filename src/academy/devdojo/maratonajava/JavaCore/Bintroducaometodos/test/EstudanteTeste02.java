package academy.devdojo.maratonajava.JavaCore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.JavaCore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.JavaCore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Ruan";
        estudante01.idade = 24;
        estudante01.sexo = 'M';

        estudante02.nome = "Paola";
        estudante02.idade = 26;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();

    }

}
