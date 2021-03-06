
package databuku;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.text.*;

public class bag_tambah extends JFrame implements ActionListener {
    //DEKLARASI KOMPONEN SWING JLabel
    JLabel lbl_isbn = new JLabel();
    JLabel lbl_isbn1 = new JLabel();
    JLabel lbl_isbn2 = new JLabel();
    JLabel lbl_isbn3 = new JLabel();
    JLabel lbl_isbn4 = new JLabel();
    JLabel lbl_judul = new JLabel();
    JLabel lbl_np1 = new JLabel();
    JLabel lbl_np2 = new JLabel();
    JLabel lbl_tahun = new JLabel();
    JLabel lbl_penerbit = new JLabel();
    JTextField txt_isbn = new JTextField();
     JTextField txt_isbn1 = new JTextField();
      JTextField txt_isbn2 = new JTextField();
       JTextField txt_isbn3= new JTextField();
        JTextField txt_isbn4 = new JTextField();
    JTextField txt_judul = new JTextField();
    JTextField txt_np1 = new JTextField();
    JTextField txt_np2 = new JTextField();
    JTextField txt_tahun = new JTextField();
    JTextField txt_penerbit = new JTextField();
    JButton btn_save = new JButton();
    JButton btn_hapus = new JButton();
    JButton btn_exit = new JButton();
    JSeparator satu = new JSeparator();
    JSeparator dua = new JSeparator();
    JSeparator tiga = new JSeparator();
    JSeparator empat = new JSeparator();
    JSeparator lima = new JSeparator();
    JLabel panel = new JLabel();
    
    String isbn, isbn1, isbn2, isbn3, isbn4, judul, nama_pengarang1, nama_pengarang2, tahun, penerbit;
    
    
    public bag_tambah(){
        this.setLayout(null);
        this.setTitle("Data Buku");
    
        //setWarnaBackground1
       JPanel content = (JPanel)getContentPane();
       content.setBackground(new java.awt.Color(0, 102, 153));
       content.setLayout(null);
       
       //SetBackground2
       panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("../image/red.png")));
       panel.setBounds(-10, -30, 370, 400);
        this.getContentPane().add(panel);
       
       //Set JSeparator
        satu.setBounds(550, 105, 200, 30);
        this.getContentPane().add(satu);
        dua.setBounds(550, 135, 200, 30);
        this.getContentPane().add(dua);
        tiga.setBounds(550, 165, 200, 30);
        this.getContentPane().add(tiga);
        empat.setBounds(550, 195, 100, 30);
        this.getContentPane().add(empat);
        lima.setBounds(550, 225, 200, 30);
        this.getContentPane().add(lima);
        
        
        lbl_isbn.setFont(new Font("Century Gothic", Font.BOLD,14));
        lbl_isbn.setForeground(new java.awt.Color(255, 255, 255));
        lbl_isbn.setText("ISBN");
        lbl_isbn.setBounds(380, 50, 200, 30);
        this.getContentPane().add(lbl_isbn);
        
        lbl_isbn1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_isbn1.setFont(new Font("Tahoma", Font.BOLD,20));
        lbl_isbn1.setText("-");
        lbl_isbn1.setBounds(605, 50, 50, 22);
        this.getContentPane().add(lbl_isbn1);
        
        lbl_isbn2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_isbn2.setFont(new Font("Tahoma", Font.BOLD,20));
        lbl_isbn2.setText("-");
        lbl_isbn2.setBounds(675, 50, 50, 22);
        this.getContentPane().add(lbl_isbn2);
        
        lbl_isbn3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_isbn3.setFont(new Font("Tahoma", Font.BOLD,20));
        lbl_isbn3.setText("-");
        lbl_isbn3.setBounds(745, 50, 50, 22);
        this.getContentPane().add(lbl_isbn3);
        
        lbl_isbn4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_isbn4.setFont(new Font("Tahoma", Font.BOLD,20));
        lbl_isbn4.setText("-");
        lbl_isbn4.setBounds(800, 50, 50, 22);
        this.getContentPane().add(lbl_isbn4);
        
        txt_isbn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_isbn.setFont(new Font("Tahoma", Font.PLAIN,12));
        txt_isbn.setText("");
        txt_isbn.setDocument(new onlydigit().getOnlyDigit());
        txt_isbn.setBounds(550, 50, 50, 20);
        this.getContentPane().add(txt_isbn);
        
        txt_isbn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_isbn1.setFont(new Font("Tahoma", Font.PLAIN,12));
        txt_isbn1.setText("");
        txt_isbn1.setDocument(new onlydigit().getOnlyDigit());
        txt_isbn1.setBounds(620, 50, 50, 20);
        this.getContentPane().add(txt_isbn1);
        
        txt_isbn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_isbn2.setFont(new Font("Tahoma", Font.PLAIN,12));
        txt_isbn2.setText("");
        txt_isbn2.setDocument(new onlydigit().getOnlyDigit());
        txt_isbn2.setBounds(690, 50, 50, 20);
        this.getContentPane().add(txt_isbn2);
        
        txt_isbn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_isbn3.setFont(new Font("Tahoma", Font.PLAIN,12));
        txt_isbn3.setText("");
        txt_isbn3.setDocument(new onlydigit().getOnlyDigit());
        txt_isbn3.setBounds(760, 50, 30, 20);
        this.getContentPane().add(txt_isbn3);
        
        txt_isbn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_isbn4.setFont(new Font("Tahoma", Font.PLAIN,12));
        txt_isbn4.setText("");
        txt_isbn4.setDocument(new onlydigit().getOnlyDigit());
        txt_isbn4.setBounds(820, 50, 20, 20);
        this.getContentPane().add(txt_isbn4);
        
        lbl_judul.setFont(new Font("Century Gothic", Font.BOLD,14));
        lbl_judul.setText("JUDUL BUKU");
        lbl_judul.setForeground(new java.awt.Color(255, 255, 255));
        lbl_judul.setBounds(380, 80, 250, 22);
        this.getContentPane().add(lbl_judul);
        
        txt_judul.setFont(new Font("Tahoma", Font.PLAIN,12));
        txt_judul.setText("");
        txt_judul.setBackground(new java.awt.Color(51, 153, 255));
        txt_judul.setBorder(null);
        txt_judul.setForeground(new java.awt.Color(255, 255, 255));
        txt_judul.setDocument(new onlyletter().getOnlyLetter());
        txt_judul.setBounds(550, 80, 200, 22);
        this.getContentPane().add(txt_judul);
        
        lbl_np1.setFont(new Font("Century Gothic", Font.BOLD,14));
        lbl_np1.setText("NAMA PENGARANG 1");
        lbl_np1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_np1.setBounds(380, 110, 200, 22);
        this.getContentPane().add(lbl_np1);
        
        txt_np1.setFont(new Font("Tahoma", Font.PLAIN,12));
        txt_np1.setText("");
        txt_np1.setForeground(new java.awt.Color(255, 255, 255));
          txt_np1.setBackground(new java.awt.Color(51, 153, 255));
        txt_np1.setBorder(null);
        txt_np1.setDocument(new onlyletter().getOnlyLetter());
        txt_np1.setBounds(550, 110, 200, 22);
        this.getContentPane().add(txt_np1);
        
        lbl_np2.setFont(new Font("Century Gothic", Font.BOLD,14));
        lbl_np2.setText("NAMA PENGARANG 2");
        lbl_np2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_np2.setBounds(380, 140, 250, 22);
        this.getContentPane().add(lbl_np2);
        
        txt_np2.setFont(new Font("Tahoma", Font.PLAIN,12));
        txt_np2.setText("");
        txt_np2.setForeground(new java.awt.Color(255, 255, 255));
          txt_np2.setBackground(new java.awt.Color(51, 153, 255));
        txt_np2.setBorder(null);
        txt_np2.setDocument(new onlyletter().getOnlyLetter());
        txt_np2.setBounds(550, 140, 200, 22);
        this.getContentPane().add(txt_np2);
        
        lbl_tahun.setFont(new Font("Century Gothic", Font.BOLD,14));
        lbl_tahun.setText("TAHUN");
        lbl_tahun.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tahun.setBounds(380, 170, 200, 22);
        this.getContentPane().add(lbl_tahun);
        
        txt_tahun.setFont(new Font("Tahoma", Font.PLAIN,12));
        txt_tahun.setText("");
        txt_tahun.setForeground(new java.awt.Color(255, 255, 255));
          txt_tahun.setBackground(new java.awt.Color(51, 153, 255));
        txt_tahun.setBorder(null);
        txt_tahun.setDocument(new onlydigit().getOnlyDigit());
        txt_tahun.setBounds(550, 170, 100, 22);
        this.getContentPane().add(txt_tahun);
        
        lbl_penerbit.setFont(new Font("Century Gothic", Font.BOLD,14));
        lbl_penerbit.setText("PENERBIT");
        lbl_penerbit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_penerbit.setBounds(380, 200, 250, 22);
        this.getContentPane().add(lbl_penerbit);
        
        txt_penerbit.setFont(new Font("Tahoma", Font.PLAIN,12));
        txt_penerbit.setText("");
        txt_penerbit.setBackground(new java.awt.Color(51, 153, 255));
        txt_penerbit.setBorder(null);
        txt_penerbit.setForeground(new java.awt.Color(255, 255, 255));
        txt_penerbit.setDocument(new onlyletter().getOnlyLetter());
        txt_penerbit.setBounds(550, 200, 200, 22);
        this.getContentPane().add(txt_penerbit);
        
        btn_save.setFont(new Font("Tahoma", Font.BOLD,14));
        btn_save.setText("SIMPAN");
        btn_save.setBackground(new java.awt.Color(255, 102, 102));
        btn_save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setBounds(550, 260, 120, 50);
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png")));
        this.getContentPane().add(btn_save);
        btn_save.addActionListener(this);
       
        btn_hapus.setBackground(new java.awt.Color(255, 102, 102));
        btn_hapus.setFont(new Font("Tahoma", Font.BOLD,14));
        btn_hapus.setText("REFRESH");
        btn_hapus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_hapus.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus.setBounds(700, 260, 120, 50);
        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rety.png")));
        this.getContentPane().add(btn_hapus);
        btn_hapus.addActionListener(this);
        
    }    
    
     public void kosong_text(){
       txt_isbn.setText("");
       txt_isbn1.setText("");
       txt_isbn2.setText("");
       txt_isbn3.setText("");
       txt_isbn4.setText("");
       txt_judul.setText("");
       txt_np1.setText("");
       txt_np2.setText("");
       txt_tahun.setText("");
       txt_penerbit.setText("");
    }
    
    public void set_data(){
        isbn = txt_isbn.getText().toString().trim();
        isbn1 = txt_isbn1.getText().toString().trim();
        isbn2 = txt_isbn2.getText().toString().trim();
        isbn3 = txt_isbn3.getText().toString().trim();
        isbn4 = txt_isbn4.getText().toString().trim();
        judul = txt_judul.getText().toString().trim();
        nama_pengarang1 = txt_np1.getText().toString().trim();
        nama_pengarang2 = txt_np2.getText().toString().trim();
        tahun = txt_tahun.getText().toString().trim();
        penerbit = txt_penerbit.getText().toString().trim();
    }
     
    public String cek_kosong(){
        String hasil = "";
        set_data();
        if(txt_isbn.getText().trim().equals("")){
            hasil = "ISBN masih kosong";
        }
        else if(txt_isbn1.getText().trim().equals("")){
            hasil = "ISBN belum lengkap";
        }
        else if(txt_isbn2.getText().trim().equals("")){
            hasil = "ISBN belum lengkap";
        }
        else if(txt_isbn3.getText().trim().equals("")){
            hasil = "ISBN belum lengkap";
        }
        else if(txt_isbn4.getText().trim().equals("")){
            hasil = "ISBN belum lengkap";
        }
        else if(txt_judul.getText().trim().equals("")){
            hasil = "Judul masih kosong";
        }
        else if(txt_np1.getText().trim().equals("")){
            hasil = "Nama Pengarang masih kosong";
        }
        else if(txt_np2.getText().trim().equals("")){
            hasil = "Nama Pengarang 2 masih kosong";
        }
        else if(txt_tahun.getText().trim().equals("")){
            hasil = "Tahun masih kosong";
        }
        else if(txt_penerbit.getText().trim().equals("")){
            hasil = "Penerbit masih kosong";
        }
        else{
            hasil = "valid";
        }
        return hasil;
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(btn_save)){
            String cek = cek_kosong();
            if (cek.equals("valid")){
                String simpan = new class_buku().tambah_data(isbn+" - "+isbn1+" - "+isbn2+" - "+isbn3+" - "+isbn4, judul, nama_pengarang1, nama_pengarang2, tahun, penerbit);
                JOptionPane.showMessageDialog(null, simpan);
                kosong_text();
            }
            else{
         JOptionPane.showMessageDialog(null, cek);
                }
        }
        if(ae.getSource().equals(btn_hapus)){
            kosong_text();
        }
    }
        
    
    public static void main(String[] args){
        bag_tambah frm = new bag_tambah();
        frm.setSize(880,400);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
