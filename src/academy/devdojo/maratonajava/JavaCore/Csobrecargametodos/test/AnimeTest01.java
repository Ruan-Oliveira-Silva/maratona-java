package academy.devdojo.maratonajava.JavaCore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.JavaCore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Jujutsu Kaisen", "TV", 12,"Ação");

        anime.imprime();


    }
}
