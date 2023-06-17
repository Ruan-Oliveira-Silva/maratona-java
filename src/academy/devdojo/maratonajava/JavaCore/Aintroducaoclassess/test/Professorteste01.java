package academy.devdojo.maratonajava.JavaCore.Aintroducaoclassess.test;

import academy.devdojo.maratonajava.JavaCore.Aintroducaoclassess.dominio.Professor;
public class Professorteste01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Greg ";
        professor.idade = 29;
        professor.sexo = 'M';

        System.out.println("Nome "+professor.nome+" idade " + professor.idade+" Sexo "+professor.sexo);

    }
}
