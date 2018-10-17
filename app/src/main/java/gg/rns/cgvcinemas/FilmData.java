package gg.rns.cgvcinemas;

import java.util.ArrayList;

public class FilmData {
    public static String[][] data = new String[][]{
            {"Venom", "When Eddie Brock acquires the powers of a symbiote, he will have to release his alter-ego \"Venom\" to save his life.",
                    "https://www.cgv.id/uploads/movie/compressed/18026700.jpg"},
                    {"On Your Wedding Day", "A story of the 10-year emotional roller-coaster romance of Woo-yeon and Seung-hee, repeating a cycle of love and heartbreak, that begun as high school crushes.",
                            "https://cdn.cgv.id/uploads/movie/compressed/18027700.jpg"},
                            {"First Man", "A look at the life of the astronaut, Neil Armstrong, and the legendary space mission that led him to become the first man to walk on the Moon on July 20, 1969.",
                                    "https://cdn.cgv.id/uploads/movie/compressed/18024900.jpg"},
                                    {"Goosebumps 2 : Haunted Halloween", "Two boys face an onslaught from witches, monsters, ghouls and a talking dummy after they discover a mysterious book by author R.L. Stine.",
                                            "https://cdn.cgv.id/uploads/movie/compressed/18025400.jpg"},
                                            {"Haloween", "Laurie Strode comes to her final confrontation with Michael Myers, the masked figure who has haunted her since she narrowly escaped his killing spree on Halloween night four decades ago.",
                                                    "https://cdn.cgv.id/uploads/movie/compressed/18025700.jpg"},
                                                    {"Office Uprising", "An employee at a weapons factory discovers that an energy drink turns his co-workers into zombies",
                                                            "https://cdn.cgv.id/uploads/movie/compressed/18028400.jpg"},
                                                            {"Johny English Strikes Again", "After a cyber-attack reveals the identity of all of the active undercover agents in Britain, Johnny English is forced to come out of retirement to find the mastermind hacker.",
                                                                    "https://cdn.cgv.id/uploads/movie/compressed/18023100.jpg"}
                                                            };
    public static ArrayList<Film> getListData(){
        Film film = null;
        ArrayList<Film> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            film = new Film();
            film.setName(data[i][0]);
            film.setRemarks(data[i][1]);
            film.setPhoto(data[i][2]);
            list.add(film);
        }
        return list;
    }

}
