package pao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

    public class Jdbc {
            public void jdbc_function() {


                String url = "jdbc:mysql://localhost:3306/proiect";
                String username = "root";
                String password = "";


                try (Connection connection = DriverManager.getConnection(url, username, password);
                     Statement statement = connection.createStatement()) {


                    ResultSet resultSet = readAcceptat(statement," proiect.admitere");
                    while(resultSet.next()) {


                        Acceptat a = new Acceptat();
                       a.setId(resultSet.getInt("id"));
                       a.aplicant.nume.setNume(resultSet.getString("nume"));
                       a.aplicant.nume.setInit_tata(resultSet.getString("init_tata"));
                       a.aplicant.nume.setPrenume(resultSet.getString("prenume"));
                       a.aplicant.adresa.setOras(resultSet.getString("oras"));
                       a.aplicant.adresa.setTara(resultSet.getString("tara"));
                       a.aplicant.adresa.setStrada(resultSet.getString("strada"));
                       a.setTelefon(resultSet.getString("telefon"));
                       a.setMail(resultSet.getString("mail"));
                       a.aplicant.setLiceu(resultSet.getString("liceu"));
                       a.aplicant.setCnp(resultSet.getString("cnp"));

                       System.out.println(a.afis_acceptat());
                    }

                    //createAcceptat(statement,"proiect.admitere"," values('1', 'Ionescu','M.','Gabriela','Bucuresti','Mihai Eminescu','Romania','Sf. Sava','2980302480098','0723731135','ionescugabriela@yahoo.com') ");
                    //updateAcceptat(statement,"0726753246", 1);
                    deleteAcceptat(statement,1,"proiect.admitere");
                } catch (SQLException e) {
                    System.out.println("An error occurred. Maybe user/password is invalid");
                    e.printStackTrace();
                }
            }
        public ResultSet readAcceptat(Statement statement,String db_table) {

                Threads t1 = new Threads("Thread-citire");
                t1.start();
                String query = "SELECT * FROM" +db_table;
            try{
                return statement.executeQuery(query);
            } catch (SQLException e) {
                System.out.println(e);
            } return null;
        }
        public void deleteAcceptat(Statement statement, int id,String db_table) {
            String query = "DELETE FROM "+db_table+" WHERE (`id` = '" + id + "')";
            try{
                statement.executeUpdate(query);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        public void updateAcceptat(Statement statement, String telefon,int id) {
            String query = "UPDATE `proiect`.`admitere` SET `telefon` = '" + telefon +"' WHERE (`id` = '"+ id +"')";
            try{
                statement.executeUpdate(query);
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        public void createAcceptat(Statement statement, String db_table, String insert_values)
        {   String query = "INSERT INTO "+db_table+insert_values;
            try{
                statement.executeUpdate(query);
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
