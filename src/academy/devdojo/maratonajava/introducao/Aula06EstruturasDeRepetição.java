package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição {
    public static void main(String[] args) {
        // while, do while, for
        // while sempre precisa retornar um valor booleano, entao usamos expressoes de comparação;
        // do while sempre executa seu sout 1 vez antes da sua condição, sendo true ou false n importa.
        int count = 0;
        while(count < 10){
            System.out.println(++count);
            do{
                System.out.println("Dentro do do-while" + ++count);
            }while (count < 10);
        // for usamos dois ; primeiro para  a variavel, segundo para a comparação e o terceiro
            // com o que voce quer incrementar como exemplo ++ para adicionar mais um

            for(int i=0;i <10 ;i++){
                System.out.println("For " +i);
            }

        }
    }
}
