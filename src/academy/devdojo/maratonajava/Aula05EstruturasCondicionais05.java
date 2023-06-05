package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imrpima o dia da semana, considerando 1 como domingo;
        byte dia = 5;
        // char, int , byte, short, enum, String >> valores pra usar no swtich
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção invalida");
                break;
                 // break no final da linha serve pra parar a instrução:
        }
                char sexo ='M';
                switch (sexo) {
                    case 'M':
                        System.out.println("Mulher");
                        break;
                    case 'H':
                        System.out.println("Homem");
                        break;
                    default:
                        System.out.println("Opção invalida");
                        break;
                }
    }
}