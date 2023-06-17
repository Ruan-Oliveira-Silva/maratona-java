package academy.devdojo.maratonajava.JavaCore.Aintroducaoclassess.test;

import academy.devdojo.maratonajava.JavaCore.Aintroducaoclassess.dominio.Carro;

public class Carro_Objeto {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Volks";
        carro.modelo = "Gol";
        carro.ano = 2023;

        Carro carro2= new Carro();
        carro2.nome = "Toyota";
        carro2.modelo = "Corolla";
        carro2.ano = 2023;

        System.out.println("Nome " + carro.nome +" Modelo " + carro.modelo +" Ano "+carro.ano);
        System.out.println("____________________________________________________");
        System.out.println("Nome " + carro2.nome +" Modelo " + carro2.modelo +" Ano "+carro2.ano);
    }
}
