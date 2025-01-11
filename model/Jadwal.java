package model;
import java.time.LocalDate;
import java.time.LocalTime;

public class Jadwal {
    private int idJadwal;
    private LocalDate tanggal;
    private LocalTime waktu;
    private int idFilm;
    private Studio studio;

    public Jadwal(int idJadwal, LocalDate tanggal, LocalTime waktu, int idFilm, Studio studio) {
        this.idJadwal = idJadwal;
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.idFilm = idFilm;
        this.studio = studio;
    }

    // Getter dan Setter
    public int getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(int idJadwal) {
        this.idJadwal = idJadwal;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public LocalTime getWaktu() {
        return waktu;
    }

    public void setWaktu(LocalTime waktu) {
        this.waktu = waktu;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }
}
