package model;
public class Tiket {
    private int idTiket;
    private Jadwal jadwal;
    private String nomorKursi;
    private SeatStatus statusSeat;

    public Tiket(int idTiket, Jadwal jadwal, String nomorKursi, SeatStatus statusSeat) {
        this.idTiket = idTiket;
        this.jadwal = jadwal;
        this.nomorKursi = nomorKursi;
        this.statusSeat = statusSeat;
    }

    // Getter dan Setter
    public int getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(int idTiket) {
        this.idTiket = idTiket;
    }

    public Jadwal getJadwal() {
        return jadwal;
    }

    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }

    public void setNomorKursi(String nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    public SeatStatus getStatusSeat() {
        return statusSeat;
    }

    public void setStatusSeat(SeatStatus statusSeat) {
        this.statusSeat = statusSeat;
    }
}
