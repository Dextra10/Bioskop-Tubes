package model;

public class FoodItem {
    private String namaItem;
    private int harga;
    private int stok;
    
    public FoodItem(){

    }

    public FoodItem(String namaItem, int harga, int stok) {
        this.namaItem = namaItem;
        this.harga = harga;
        this.stok = stok;
    }
    public String getNamaItem() {
        return namaItem;
    }
    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }    
}
