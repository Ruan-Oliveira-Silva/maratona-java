package academy.devdojo.maratonajava.JavaCore.Aintroducaoclassess.test;

import academy.devdojo.maratonajava.JavaCore.Aintroducaoclassess.dominio.Estudante;

public class EstudanteTest2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "James da salada de frutas ";
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
    }
}
