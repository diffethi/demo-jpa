package fr.diginamic;

public class Region {
    private int idRegion;
    private String nomRegion;

    public Region(int idRegion, String nomRegion) {
        this.idRegion = idRegion;
        this.nomRegion = nomRegion;
    }

    public int getIdRegion() {
        return idRegion;
    }

    @Override
    public String toString() {
        return "Region{" +
                "idRegion=" + idRegion +
                ", nomRegion='" + nomRegion + '\'' +
                '}';
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }
}
