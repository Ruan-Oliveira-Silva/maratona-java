package academy.devdojo.maratonajava.JavaCore.Aintroducaoclassess.test;

import academy.devdojo.maratonajava.JavaCore.Aintroducaoclassess.dominio.Carro;

public class Carro_Objeto {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2= new Carro();

        carro1.nome = "Volks";
        carro1.modelo = "Gol";
        carro1.ano = 2023;

        carro2.nome = "Toyota";
        carro2.modelo = "Corolla";
        carro2.ano = 2023;

        System.out.println("Nome " + carro1.nome +" Modelo " + carro1.modelo +" Ano "+carro1.ano);
        System.out.println("____________________________________________________");
        System.out.println("Nome " + carro2.nome +" Modelo " + carro2.modelo +" Ano "+carro2.ano);
    }
}
