/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelBarang;
import util.Koneksi;

/**
 *
 * @author user
 */
public class ControllerBarang {
    Koneksi lisa = new Koneksi();
    
public void simpanData(model.ModelBarang mb){
    lisa.koneksiDatabase();
    String querySimpan = "insert into tbl_barang(Nama,Jenis, Jumlah) values ('"+mb.getNama()+"'),"
            + "('"+mb.getJenis()+"'), ('"+mb.getJumlah()+"')";
    try {
        lisa.state.executeUpdate(querySimpan);
        JOptionPane.showMessageDialog(null, "DATA TELAH BERHASIL TERSIMPAN");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "DATA TIDAK BISA DISIMPAN");
        System.err.println(""+e);
    }
}
public void hapusData(model.ModelBarang mb){
    try {
    lisa.koneksiDatabase();
    String query = "delete from tbl_barang where Id=('"+mb.getId()+"')";
    lisa.state.executeUpdate(query);
    JOptionPane.showMessageDialog(null, "DATA TELAH TERHAPUS!!!");
    lisa.connect.close();
    
    } catch (SQLException e) {
        System.err.println(""+e);
        JOptionPane.showMessageDialog(null, "DATA ERROR TIDAK TERHAPUS!!! SILAHKAN ULANGI LAGI!!");
    }
}
public void ubahData(model.ModelBarang mb){
    lisa.koneksiDatabase();
    try {
        int Id = mb.getId();
        int Jumlah = mb.getJumlah();
        String Nama = mb.getNama();
        String Jenis = mb.getJenis();
        
        String query = "update tbl_barang set Nama=('"+Nama+"'), Jenis=('"+Jenis+"'),"
                + "Jumlah=('"+Jumlah+"') where Id=('"+Id+"')";
        lisa.state.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "DATA TELAH TERSIMPAN!!");
    } catch (SQLException e) {
        System.err.println(""+e);
        JOptionPane.showMessageDialog(null, "DATA ERROR TIDAH DAPAT DIUBAH!! SILAHKAN ULANGI LAGI!!");
    }
}
}
