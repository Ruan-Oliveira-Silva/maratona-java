package academy.devdojo.maratonajava.introducao;

public class EstruturasCOndicionais06 {
    public static void main(String[] args) {
        // dados os valores de 1 a 7, imprima se é dia
        // útil ou final de semana
        byte dia = 1;
        switch(dia){
            case 1:
                System.out.println("Domingo é fim de semana !");
                break;
            case 2:
                System.out.println("Segunda é foda, mas é dia útil !");
                break;
            case 3:
                System.out.println("Terça é dia útil !");
                break;
            case 4:
                System.out.println("Quarta é dia útil !");
                break;
            case 5:
                System.out.println("Quinta é dia útil !");
                break;
            case 6:
                System.out.println("Sexta é quase fim de semana !");
                break;
            case 7:
                System.out.println("Sabado é fim de semana  !");
                break;
            default:
                System.out.println("Inválido  !");
                break;

        }
    }
}
