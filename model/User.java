package model;

import java.util.List;

public class User extends Account {
    private String bio;
    private List<Tiket> riwayatTiket; // Menyimpan riwayat tiket
    private List<FoodOrder> riwayatFnb; // Menyimpan riwayat makanan/minuman

    public User(String name, String email, String password, String bio) {
        super(name, email, password);
        this.bio = bio;
    }

    // Getter dan Setter
    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Tiket> getRiwayatTiket() {
        return riwayatTiket;
    }

    public void setRiwayatTiket(List<Tiket> riwayatTiket) {
        this.riwayatTiket = riwayatTiket;
    }

    public List<FoodOrder> getRiwayatFnb() {
        return riwayatFnb;
    }

    public void setRiwayatFnb(List<FoodOrder> riwayatFnb) {
        this.riwayatFnb = riwayatFnb;
    }
}
