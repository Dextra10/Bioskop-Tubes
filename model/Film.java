package model;

import java.util.ArrayList;

public class Film {
    private String judul;
    private Genre genre;
    private int durasi; 
    private String sutradara;
    private String tahunRilis;
    private String pathFilm;
    private String sinopsis;

    public Film(String judul, Genre genre, int durasi, String sutradara, String tahunRilis, String pathFilm, String sinopsis) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
        this.sutradara = sutradara;
        this.tahunRilis = tahunRilis;
        this.pathFilm = pathFilm;        
        this.sinopsis = sinopsis;
    }

    public Film(){
        
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(String tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public String getPathFilm() {
        return pathFilm;
    }

    public void setPathFilm(String pathFilm) {
        this.pathFilm = pathFilm;
    }
    
    public String getSinopsis(){
        return sinopsis;
    }

    public void setSinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }
}
