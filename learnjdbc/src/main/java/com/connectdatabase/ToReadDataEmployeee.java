package com.connectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ToReadDataEmployeee {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/Employee";
        String un = "postgres";
        String pwd = "root";

        try {
            Class.forName("org.postgresql.Driver");
            Connection connect = DriverManager.getConnection(url, un, pwd);

           
            String sql = "INSERT INTO employeee (id, name, salary) VALUES (?,?,?)";
            PreparedStatement pstm = connect.prepareStatement(sql);

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter id:");
            pstm.setInt(1, scan.nextInt());

            System.out.println("Enter name:");
            pstm.setString(2, scan.next());

            System.out.println("Enter salary:");
            pstm.setInt(3, scan.nextInt());

            pstm.execute();
            System.out.println("Data inserted successfully");

            connect.close();
            scan.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
