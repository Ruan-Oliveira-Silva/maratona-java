package academy.devdojo.maratonajava.JavaCore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println("_________");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
