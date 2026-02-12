package com.connectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ToReadData {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/school";
        String un = "postgres";
        String pwd = "root";

        try {
            Class.forName("org.postgresql.Driver");
            Connection connect = DriverManager.getConnection(url, un, pwd);

            String sql = "insert into student values(?,?,?,?)";
            PreparedStatement pstm = connect.prepareStatement(sql);

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter id: ");
            pstm.setInt(1, scan.nextInt());

            System.out.println("Enter name: ");
            pstm.setString(2, scan.next());

            System.out.println("Enter email: ");
            pstm.setString(3, scan.next());

            System.out.println("Enter gender: ");
            pstm.setString(4, scan.next());

            pstm.execute();
            System.out.println("Data inserted successfully");

            connect.close();
            scan.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
