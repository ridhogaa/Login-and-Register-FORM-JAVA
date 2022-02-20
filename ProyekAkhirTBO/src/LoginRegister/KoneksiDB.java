/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginRegister;
import java.sql.*;

/**
 *
 * @author Ridho Gymnastiar Al Rasyid 
 */
public class KoneksiDB {
    public static Connection conn;
    
    public static void main(String[] args) {
        new KoneksiDB().koneksiDatabase();
    }
    
    public void koneksiDatabase(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/tbo";
            String user = "root";
            String pass = "";
            
            conn = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println("koneksi gagal" + e.getMessage());
        }
    }
    
    public Connection getKoneksi(){
        return conn;
    }
}
