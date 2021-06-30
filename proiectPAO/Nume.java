package pao;

public class Nume {
    private String nume,prenume,init_tata;
    public Nume(){}
    public Nume(String nume,String init_tata,String prenume)
    {
        this.nume=nume;
        this.prenume=prenume;
        this.init_tata=init_tata;
    }

    public Nume(String[] part)
    {
        this.nume=part[0];
        this.prenume=part[2];
        this.init_tata=part[1];
    }
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getInit_tata() {
        return init_tata;
    }

    public void setInit_tata(String init_tata) {
        this.init_tata = init_tata;
    }

    public String afis_nume()
    {
        return "\nNume: " + nume + " " + init_tata + ". " + prenume;
    }

}
