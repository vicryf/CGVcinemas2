package gg.rns.cgvcinemas;

import java.util.ArrayList;

public class FilmData {
    public static String[][] data = new String[][]{
            {"Venom", "Genre : Action",
                    "https://www.cgv.id/uploads/movie/compressed/18026700.jpg"},
                    {"On Your Wedding Day", "Genre : Drama",
                            "https://cdn.cgv.id/uploads/movie/compressed/18027700.jpg"},
                            {"First Man", "Genre : History",
                                    "https://cdn.cgv.id/uploads/movie/compressed/18024900.jpg"},
                                    {"Goosebumps 2 : Haunted Halloween", "Genre : Horror",
                                            "https://cdn.cgv.id/uploads/movie/compressed/18025400.jpg"},
                                            {"Haloween", "Genre: Thriller",
                                                    "https://cdn.cgv.id/uploads/movie/compressed/18025700.jpg"},
                                                    {"Office Uprising", "Genre : Thriller",
                                                            "https://cdn.cgv.id/uploads/movie/compressed/18028400.jpg"},
                                                            {"Johny English Strikes Again", "Genre : Comedy",
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
