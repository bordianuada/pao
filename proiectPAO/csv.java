package pao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Date;

public class csv {

    public csv()
    {
        String csv_file = "C:\\Users\\bordi\\IdeaProjects\\1\\src\\pao\\in.csv";
        BufferedReader br = null;
        String line = "";
        String csv_split = ",";
        try {

            br = new BufferedReader(new FileReader(csv_file));
            while ((line = br.readLine()) != null) {

                String[] part = line.split(csv_split);
                Nume nume=new Nume(part);;
                Aplicant aplicant=new Aplicant(part);
                Acceptat acceptat=new Acceptat(part);
                Adresa adresa=new Adresa(part);
                System.out.println(nume.getNume()+" " +nume.getInit_tata()+" "+nume.getPrenume()+" " +" " +aplicant.getLiceu()+" "+aplicant.getCnp()+" "+acceptat.getMail()+" " +acceptat.getTelefon()+" " +adresa.getTara()+ " "+adresa.getStrada()+" "+adresa.getOras());

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public void csv_fct() {
        String csv_file = "C:\\Users\\bordi\\IdeaProjects\\1\\src\\pao\\in.csv";
        String audit="C:\\Users\\bordi\\IdeaProjects\\1\\src\\pao\\out.csv";
        BufferedReader br = null;
        String line = "";
        String csv_split = ",";
        BufferedWriter bw = null;
        BufferedWriter abw = null;
        FileWriter fw = null;
        FileWriter afw = null;

        try {
            afw = new FileWriter("C:\\Users\\bordi\\IdeaProjects\\1\\src\\pao\\out.csv");
            abw = new BufferedWriter(afw);
            abw.write("Adaugare student  "+ new Date());
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
        /*try {

            Scanner scan = new Scanner(System.in);
            fw = new FileWriter("C:\\Users\\bordi\\IdeaProjects\\1\\src\\pao\\in.csv",true);
            bw = new BufferedWriter(fw);
            String nume = scan.nextLine();
            String init_tata=scan.nextLine();
            String prenume=scan.nextLine();
            String oras=scan.nextLine();
            String strada=scan.nextLine();
            String tara=scan.nextLine();
            String liceu=scan.nextLine();
            String cnp=scan.nextLine();
            String telefon=scan.nextLine();
            String email=scan.nextLine();


            StringBuilder sb = new StringBuilder();

            sb.append('\n');
            sb.append(nume+",");
            sb.append(init_tata+',');
            sb.append(prenume+',');
            sb.append(oras+',');
            sb.append(strada+',');
            sb.append(tara+',');
            sb.append(liceu+",");
            sb.append(cnp+",");
            sb.append(telefon+",");
            sb.append(email);

            bw.write(sb.toString());
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        } finally {
            try {
                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                System.err.format("IOException: %s%n", ex);
            }
        }*/

    }



}