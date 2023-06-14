package academy.devdojo.maratonajava.introducao;

public class Aula29Repet03 {
    // imprima os primeiros 25 num de um dado valor
    //exemplo 50
    // um break precisa estar dentro de um switch ou de um loop para nao quebrar o codigo.
    public static void main(String[] args) {
        int valorMax = 50;
       for (int i = 0;i < valorMax ; i++ ){
           if (i > 25){
               break;
           }
           System.out.println(i);
        }

    }
}
