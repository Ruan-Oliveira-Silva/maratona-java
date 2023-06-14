package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 17 categiria juvenil
        // idade >= 18 categoria adulto
        // todas as condiçoes das variaveis precisam ser cobertas por if e else para serem usadas.
        // variaveis locais precisam ser inicializadas precisa ter uma alocação de memoria
        // como o nosso valor de string categoria.

        int idade = 30;
        String categoria;
        if(idade < 15){
           categoria = "Categoria Infantil ";
        }else if (idade >= 15 && idade < 18){
           categoria = "Categoria Juvenil";
        }else {
          categoria = "Categoria Adulto ";
        }
        System.out.println(categoria);
    }
}
