package pao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.lang.*;
import java.util.Date;

public class Admitere  {

    public static void main(String[] args) {

        Jdbc jdbc = new Jdbc();
        csv csv=new csv();
        csv.csv_fct();

        Departament depmate = new Departament("Matematica", 4, 2);
        Departament depinfo = new Departament("Informatica", 3, 1);
        Departament depcti = new Departament("CTI", 3, 1);

        ArrayList<Acceptat> mate = new ArrayList<Acceptat>();
        ArrayList<Acceptat> info = new ArrayList<Acceptat>();
        ArrayList<Acceptat> cti = new ArrayList<Acceptat>();

        List<Departament> departaments = new ArrayList<>();

        String line = "";
        String csv_split = ",";
        BufferedWriter abw = null;
        FileWriter afw = null;

        departaments.add(depmate);
        departaments.add(depinfo);
        departaments.add(depcti);
        try {
            afw = new FileWriter("C:\\Users\\bordi\\IdeaProjects\\1\\src\\pao\\out.csv",true);
            abw = new BufferedWriter(afw);
            abw.write("\n"+"Adaugare departamente  " + new Date());
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        } finally {
            try {
                if (abw != null)
                    abw.close();

                if (afw != null)
                    afw.close();
            } catch (IOException ex) {
                System.err.format("IOException: %s%n", ex);
            }
        }


        Informatii informatii = new Informatii("FMI", "Bucuresti", departaments);

        Medie medie1 = new Medie(10.00, 10.00);
        Nume nume1 = new Nume("Ionescu", "M.", "Gabriela");
        Adresa adresa1 = new Adresa("Bucuresti", "Mihai Eminescu", "Romania");
        Aplicant aplicant1 = new Aplicant("Sf. Sava", "2980302480098", nume1, adresa1, medie1);
        Acceptat acceptat1 = new Acceptat("0723731135", "ionescugabriela@yahoo.com", aplicant1, depmate);

        Medie medie2 = new Medie(9.70, 9.30);
        Nume nume2 = new Nume("Burcea", "I", "Adrian");
        Adresa adresa2 = new Adresa("Bucuresti", "Dreptatii", "Romania");
        Aplicant aplicant2 = new Aplicant("Tudor Vianu", "1990809345678", nume2, adresa2, medie2);
        Acceptat acceptat2 = new Acceptat("0728654456", "adi.bucea@gmail", aplicant2, depmate);

        Medie medie3 = new Medie(9.15, 9.00);
        Nume nume3 = new Nume("Velicu", "G", "Ana");
        Adresa adresa3 = new Adresa("Buzau", "Azurului", "Romania");
        Aplicant aplicant3 = new Aplicant("Spiru Haret", "2970111098876", nume3, adresa3, medie3);
        Acceptat acceptat3 = new Acceptat("0726753246", "a.velicu@yahoo.com", aplicant3, depmate);

        Medie medie4 = new Medie(9.00, 9.00);
        Nume nume4 = new Nume("Vasile", "A", "Anita");
        Adresa adresa4 = new Adresa("Botosani", "Botos", "Romania");
        Aplicant aplicant4 = new Aplicant("Mihai Viteazu", "2970111098863", nume4, adresa4, medie4);
        Acceptat acceptat4 = new Acceptat("0726753221", "a.vaasile@yahoo.com", aplicant4, depmate);

        Medie medie5 = new Medie(10.00, 9.90);
        Nume nume5 = new Nume("Diaconescu", "A", "Vladimir");
        Adresa adresa5 = new Adresa("Galati", "Desrobirii", "Romania");
        Aplicant aplicant5 = new Aplicant("Mihai Viteazu", "1970111098863", nume5, adresa5, medie5);
        Acceptat acceptat5 = new Acceptat("0726753221", "diaconescuvladimir@yahoo.com", aplicant5, depinfo);

        Medie medie6 = new Medie(9.70, 9.70);
        Nume nume6 = new Nume("Andrei", "A", "Alexandru");
        Adresa adresa6 = new Adresa("Bucuresti", "Unirii", "Romania");
        Aplicant aplicant6 = new Aplicant("Mihai Eminescu", "1990111098534", nume6, adresa6, medie6);
        Acceptat acceptat6 = new Acceptat("0726283221", "alexandrei99@yahoo.com", aplicant6, depinfo);

        Medie medie7 = new Medie(9.00, 9.60);
        Nume nume7 = new Nume("Calinescu", "D", "Maria");
        Adresa adresa7 = new Adresa("Galati", "Morari", "Romania");
        Aplicant aplicant7 = new Aplicant("Tudor Vladimirescu", "2990111098845", nume7, adresa7, medie7);
        Acceptat acceptat7 = new Acceptat("0726789221", "calimaria@yahoo.com", aplicant7, depinfo);

        Medie medie8 = new Medie(10.00, 9.70);
        Nume nume8 = new Nume("Badea", "A", "George");
        Adresa adresa8 = new Adresa("Bacau", "Bacaniei", "Romania");
        Aplicant aplicant8 = new Aplicant("Ion Neculce", "1970132198863", nume8, adresa8, medie8);
        Acceptat acceptat8 = new Acceptat("0726753221", "badeag97@yahoo.com", aplicant8, depcti);

        Medie medie9 = new Medie(9.70, 9.70);
        Nume nume9 = new Nume("Mihalache", "A", "Gina");
        Adresa adresa9 = new Adresa("Bucuresti", "Bacaniei", "Romania");
        Aplicant aplicant9 = new Aplicant("Ion Neculce", "1970132123863", nume9, adresa9, medie9);
        Acceptat acceptat9 = new Acceptat("0726753221", "badeag97@yahoo.com", aplicant9, depcti);

        Medie medie10 = new Medie(9.50, 9.40);
        Nume nume10 = new Nume("Dumitru", "A", "Viorica");
        Adresa adresa10 = new Adresa("Bucuresti", "Aviatiei", "Romania");
        Aplicant aplicant10 = new Aplicant("Gheorhe Lazar", "2901230198863", nume10, adresa10, medie10);
        Acceptat acceptat10 = new Acceptat("0726123225", "viodumitru@yahoo.com", aplicant10, depcti);

        ArrayList<Acceptat> students = new ArrayList<>();
        students.add(acceptat1);
        students.add(acceptat2);
        students.add(acceptat3);
        students.add(acceptat4);
        students.add(acceptat5);
        students.add(acceptat6);
        students.add(acceptat7);
        students.add(acceptat8);
        students.add(acceptat9);
        students.add(acceptat10);
        try {
            afw = new FileWriter("C:\\Users\\bordi\\IdeaProjects\\1\\src\\pao\\out.csv",true);
            abw = new BufferedWriter(afw);
            abw.write("\n"+"Adaugare lista studenti  " + new Date());
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        } finally {
            try {
                if (abw != null)
                    abw.close();

                if (afw != null)
                    afw.close();
            } catch (IOException ex) {
                System.err.format("IOException: %s%n", ex);
            }
        }


        for (Acceptat st : students) {
            if (st.departament.getDenumire().equals("Informatica"))
                info.add(st);
            if (st.departament.getDenumire().equals("Matematica"))
                mate.add(st);
            if (st.departament.getDenumire().equals("CTI"))
                cti.add(st);
        }

        Collections.sort(students, new cmp_name());
        for(Acceptat i :students) {
            System.out.println(i.afis_acceptat());
        }


        jdbc.jdbc_function();

        Threads t1 = new Threads("Thread-Afisare");
        t1.start();
    }
}

