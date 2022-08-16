/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

/**
 *
 * @author naol
 */
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

public class DBController {
    private static final String URL = "jdbc:mysql://localhost/BusTransportSystem";
    private static final String USER = "root";
    private static final String PASS = "";

    private static Connection conn;

    static void connect() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER, PASS);
            } catch (SQLException e) {
                System.out.println("Connection Error");
                e.printStackTrace();
            }
        }
    }

    public static Connection getConn() {
        connect();
        return conn;
    }

    public static Statement getStmt() {
        try {
            return getConn().createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static PreparedStatement getPreparedStmt(String sql) {
        try {
            return  getConn().prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String hash_md5(String word) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hash = md.digest(word.getBytes("UTF-8"));

        return String.format("%032x", new BigInteger(1, hash));
    }

}
