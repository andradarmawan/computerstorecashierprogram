/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasir_komputer;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.DriverManager;


/**
 *
 * @author Andra
 */
public class kasir_craftComputer {
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String dbUrl = "jdbc:mysql://localhost/db_kasir";
    String user = "root";
    String password = "";
    
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    private boolean respons;
    
    public kasir_craftComputer(){
        try{
            Class.forName(jdbcDriver);
            System.out.println("Driver berhasil di load");
        } catch (ClassNotFoundException ex){
            System.out.println("Driver tidak ditemukan");
            Logger.getLogger(kasir_craftComputer.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            con = DriverManager.getConnection(dbUrl, user, password);
            System.out.println("Berhasil terhubung dengan MySQL");
        }
        catch (SQLException ex){
            System.out.println("Gagal terhubung dengan MySQL");
            Logger.getLogger(kasir_craftComputer.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public boolean insertKasir(
        String nama_barang, int harga_barang, int jumlah_beli,
        int total_harga, int jumlah_bayar, int jumlah_kembalian){
        String query="insert into tabel_kasir(nama_barang, harga_barang, jumlah_beli, total_harga, jumlah_bayar, jumlah_kembalian)values(?, ?, ?, ?, ?, ?)";
        
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, nama_barang);
            ps.setString(2, Integer.toString(harga_barang));
            ps.setString(3, Integer.toString(jumlah_beli));
            ps.setString(4, Integer.toString(total_harga));
            ps.setString(5, Integer.toString(jumlah_bayar));
            ps.setString(6, Integer.toString(jumlah_kembalian));
            ps.executeUpdate();
            respons = true;
            System.out.println("Sukses insert");
        } catch (SQLException ex) {
            respons = false;
            System.out.println("Gagal insert");
            Logger.getLogger(kasir_craftComputer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respons;
    }
    
    public ResultSet getAllKasir(){
        String query = "select * from tabel_kasir";
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(kasir_craftComputer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    public boolean updateKasir (
        String nama_barang, int harga_barang, int jumlah_beli,
        int total_harga, int jumlah_bayar, int jumlah_kembalian){
        String query = "update tabel_kasir set nama_barang = ?, harga_barang = ?, jumlah_beli = ?, total_harga = ?, jumlah_bayar = ?, jumlah_kembalian = ?";
        try {
            
            ps = con.prepareStatement(query);
            ps.setString(1, nama_barang);
            ps.setString(2, Integer.toString(harga_barang));
            ps.setString(3, Integer.toString(jumlah_beli));
            ps.setString(4, Integer.toString(total_harga));
            ps.setString(5, Integer.toString(jumlah_bayar));
            ps.setString(6, Integer.toString(jumlah_kembalian));
            ps.executeUpdate();
            respons=true;
            System.out.println("Berhasil Update");
            
        } catch (SQLException ex) {
            respons=false;
            System.out.println("Gagal Update");
            Logger.getLogger(kasir_craftComputer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respons;
    }
    
    public void hapusKasir(String nama_barang){
            String query="delete from tabel_kasir where nama_barang=?";
        try {
            ps=con.prepareStatement(query);
            ps.setString(1, nama_barang);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(kasir_craftComputer.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}