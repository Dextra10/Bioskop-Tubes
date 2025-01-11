package model;

public class Studio {
    private int idStudio;
    private int nomorStudio;
    private StudioType tipeStudio;

    public Studio(int idStudio, int nomorStudio, StudioType tipeStudio) {
        this.idStudio = idStudio;
        this.nomorStudio = nomorStudio;
        this.tipeStudio = tipeStudio;
    }

    // Getter dan Setter
    public int getIdStudio() {
        return idStudio;
    }

    public void setIdStudio(int idStudio) {
        this.idStudio = idStudio;
    }

    public int getNomorStudio() {
        return nomorStudio;
    }

    public void setNomorStudio(int nomorStudio) {
        this.nomorStudio = nomorStudio;
    }

    public StudioType getTipeStudio() {
        return tipeStudio;
    }

    public void setTipeStudio(StudioType tipeStudio) {
        this.tipeStudio = tipeStudio;
    }
}
