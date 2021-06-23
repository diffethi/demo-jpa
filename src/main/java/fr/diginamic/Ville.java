package fr.diginamic;

public class Ville {
    private int idVille;
    private String nomVille;

    public Ville(int idVille, String nom) {
        this.idVille = idVille;
        this.nomVille = nomVille;
    }

    public int getIdVille() {
        return idVille;
    }

    public void setIdVille(int idVille) {
        this.idVille = idVille;
    }

    public String getNom() {
        return nomVille;
    }

    public void setNom(String nom) {
        this.nomVille = nomVille;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "idVille=" + idVille +
                ", nomVille='" + nomVille + '\'' +
                '}';
    }
}
