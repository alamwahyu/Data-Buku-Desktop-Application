

package databuku;

import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class class_buku {
    Connection con = null;
    
    public List get_data(String str){
        List<String> assetList = new ArrayList<String>();
        try{
            con = new class_koneksi().getConSQL();
            PreparedStatement pr = con.prepareStatement("SELECT * FROM tb_databuku WHERE isbn = ?");
            pr.setString(1,str);
            
            ResultSet rs = pr.executeQuery();
            rs.next();
            
            String isbn = rs.getString("isbn").trim();
            String judul = rs.getString("judul").trim();
            String nama_pengarang1 = rs.getString("nama_pengarang1").trim();
            String nama_pengarang2 = rs.getString("nama_pengarang2").trim();
            String tahun = rs.getString("tahun").trim();
            String penerbit = rs.getString("penerbit").trim();
            
            String[] dataField = {isbn, judul, nama_pengarang1, nama_pengarang2, tahun, penerbit};
            Collections.addAll(assetList, dataField);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return assetList;
    }
    
    public List tampil_data(){
        List<String> assetList = new ArrayList<String>();
        try{
            con = new class_koneksi().getConSQL();
            PreparedStatement pr = con.prepareStatement("SELECT * FROM tb_databuku ORDER BY judul ASC");
            ResultSet rs = pr.executeQuery();
            while (rs.next()){
                String isbn = rs.getString("isbn").trim();
                String judul = rs.getString("judul").trim();
                String nama_pengarang1 = rs.getString("nama_pengarang1").trim();
                String nama_pengarang2 = rs.getString("nama_pengarang2").trim();
                String tahun = rs.getString("tahun").trim();
                String penerbit = rs.getString("penerbit").trim();
                
                String[] dataField = {isbn, judul, nama_pengarang1, nama_pengarang2, tahun, penerbit};
                Collections.addAll(assetList, dataField);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return assetList;
    }
    
    public List cari_data(String str){
        List<String> assetList = new ArrayList<String>();
        try{
            con = new class_koneksi().getConSQL();
            PreparedStatement pr = con.prepareStatement("SELECT * FROM tb_databuku WHERE judul LIKE ? ORDER BY judul ASC");
            pr.setString(1,str + "%");
            ResultSet rs = pr.executeQuery();
            while (rs.next()){
                String isbn = rs.getString("isbn").trim();
                String judul = rs.getString("judul").trim();
                String nama_pengarang1 = rs.getString("nama_pengarang1").trim();
                String nama_pengarang2 = rs.getString("nama_pengarang2").trim();
                String tahun = rs.getString("tahun").trim();
                String penerbit = rs.getString("penerbit").trim();
                
                String[] dataField = {isbn, judul, nama_pengarang1, nama_pengarang2, tahun, penerbit};
                Collections.addAll(assetList, dataField);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return assetList;
    }
    
    public String tambah_data(String isbn, String judul, String nama_pengarang1, String nama_pengarang2, String tahun, String penerbit){
        String result = "";
        try{
            con = new class_koneksi().getConSQL();
            String str = "INSERT INTO tb_databuku(isbn, judul, nama_pengarang1, nama_pengarang2, tahun, penerbit) VALUES(?,?,?,?,?,?)";
            PreparedStatement pr = con.prepareStatement(str);
            
            pr.setString(1,isbn);
            pr.setString(2,judul);
            pr.setString(3,nama_pengarang1);
            pr.setString(4,nama_pengarang2);
            pr.setString(5,tahun);
            pr.setString(6,penerbit);
            
            int i = pr.executeUpdate();
            if(i!=0){
                result = "Data Berhasil Disimpan";
            }
            else{
                result = "Data Gagal Disimpan";
            }
            
            con.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return result;
    }
    
    public String ubah_data(String isbn, String judul, String nama_pengarang1, String nama_pengarang2, String tahun, String penerbit){
        String result = "";
        try{
            con = new class_koneksi().getConSQL();
            String str = "UPDATE tb_databuku SET judul=?, nama_pengarang1=?, nama_pengarang2=?, tahun=?, penerbit=? WHERE isbn=?";
            PreparedStatement pr = con.prepareStatement(str);
            
            pr.setString(1,judul);
            pr.setString(2,nama_pengarang1);
            pr.setString(3,nama_pengarang2);
            pr.setString(4,tahun);
            pr.setString(5,penerbit);
            pr.setString(6,isbn);
            
            int i = pr.executeUpdate();
            if(i!=0){
                result = "Data Berhasil Di Ubah";
            }
            else{
                result = "Data Gagal Di Ubah";
            }
            con.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return result;
    }
    
    public String hapus_data(String isbn){
        String result = "";
        try{
            con = new class_koneksi().getConSQL();
            String str = "DELETE tb_databuku WHERE isbn=?";
            PreparedStatement pr = con.prepareStatement(str);
            
            pr.setString(1,isbn);
            
            int i = pr.executeUpdate();
            if(i!=0){
                result = "Data Berhasil Di Hapus";
            }
            else{
                result = "Data Gagal Di Hapus";
            }
            con.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return result;
    }
}