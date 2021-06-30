package pao;

public class Medie {
    private double medie_bac;
    private double medie_finala;
    private double medie_admitere;
    public Medie(){}
    public Medie(double medie_bac, double medie_admitere)
    {
        this.medie_bac = medie_bac;
        this.medie_admitere=medie_admitere;
    }

    public double getMedie_admitere() {
        return medie_admitere;
    }

    public void setMedie_admitere(double medie_admitere) {
        this.medie_admitere = medie_admitere;
    }

    public double getMedie_bac() {
        return medie_bac;
    }

    public void setMedie_bac(double medie_bac) {
        this.medie_bac = medie_bac;
    }

    public double getMedie_finala() {
        return medie_finala;
    }

    public double getNota_finala(double medie_bac, double medie_admitere) {
        medie_finala =(medie_bac+medie_admitere)/2;
        return medie_finala;
    }

    public String afis_note()
    {
        return "\nAdmitere: " + medie_admitere + " Bacalaureat: " + medie_bac + " Medie fianala: " + getNota_finala(medie_bac,medie_admitere);
    }
}
