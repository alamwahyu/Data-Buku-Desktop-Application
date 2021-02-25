
package databuku;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;



public class table extends JFrame implements ActionListener{
    JLabel lbl_waktu = new JLabel();
    JLabel tgl = new JLabel();
    JLabel lbl_cari = new JLabel();
    JTextField txt_cari = new JTextField();
    
    JButton btn_search = new JButton();
    JButton btn_refresh = new JButton();
    JButton btn_exit = new JButton();
    
    DefaultTableModel DftTabMode;
    JTable tb_databuku = new JTable();
    JScrollPane jspane = new JScrollPane();
    
    Object currentWindow = this;
    
    
    java.util.Date tglsekarang = new java.util.Date();
    private SimpleDateFormat jam = new SimpleDateFormat("dd MMMMMMMMM yyyy",Locale.getDefault());
    
    private String tanggal = jam.format(tglsekarang);
    
public final void setJam(){
    ActionListener taskPerformer = new ActionListener(){
        
        
        @Override
        public void actionPerformed(ActionEvent evt){
            String nol_jam="",nol_menit="",nol_detik="";
            
            java.util.Date dateTime = new java.util.Date();
            int nilai_jam = dateTime.getHours();
            int nilai_menit = dateTime.getMinutes();
            int nilai_detik = dateTime.getSeconds();
            
            if(nilai_jam<=9)nol_jam="0";
            if(nilai_menit<=9)nol_menit="0";
            if(nilai_detik<=9)nol_detik="0";
            
            String jam=nol_jam+Integer.toString(nilai_jam);
            String menit=nol_menit+Integer.toString(nilai_menit);
            String detik=nol_detik+Integer.toString(nilai_detik); 
        
        tgl.setText(tanggal);    
        tgl.setFont(new Font("Showcard Gothic", Font.BOLD,28));    
        tgl.setBounds(new Rectangle(790,30,350,50));
        tgl.setForeground(new java.awt.Color(255, 241, 27));
        
        
        lbl_waktu.setFont(new Font("Showcard Gothic", Font.BOLD,28));    
        lbl_waktu.setText(jam+":"+menit+":"+detik+"");
        lbl_waktu.setBounds(new Rectangle(870,70,350,50));
        lbl_waktu.setForeground(new java.awt.Color(255, 241, 27));
        }
    };
    new Timer(1000, taskPerformer).start();
}

    
    public table(){
        this.setTitle("DATA BUKU UIN JAKARTA");
        
        this.getContentPane().add(lbl_waktu);
        this.getContentPane().add(tgl);
        
        lbl_cari.setText("CARI JUDUL BUKU");
        lbl_cari.setFont(new Font("Tahoma", Font.BOLD,12));
        lbl_cari.setBounds(new Rectangle(80,115,150,22));
        lbl_cari.setForeground(new java.awt.Color(255, 241, 27));
        this.getContentPane().add(lbl_cari);
        
        txt_cari.setBounds(new Rectangle(250,115,180,22));
        this.getContentPane().add(txt_cari);
        
        btn_search.setText("Search");
        btn_search.setBounds(450,110,120,30);
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cari.png")));
        btn_search.addActionListener(this);
        this.getContentPane().add(btn_search);
        
        btn_refresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_refresh.setBackground(new java.awt.Color(204,204,255));
        btn_refresh.setText("REFRESH");
        btn_refresh.setFont(new Font("Tahoma", Font.BOLD,14));
        btn_refresh.setBounds(50,525,150,75);
        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/segar.png")));
        btn_refresh.addActionListener(this);
        this.getContentPane().add(btn_refresh);
        
        btn_exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_exit.setBackground(new java.awt.Color(204, 204, 204));
        btn_exit.setText("");
        btn_exit.setBounds(990,530,70,60);
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png")));
        btn_exit.addActionListener(this);
        this.getContentPane().add(btn_exit);
        
        
        Object[] baris = {"ISBN","JUDUL BUKU","NAMA PENGARANG 1","NAMA PENGARANG 2","TAHUN","PENERBIT"};
        
        DftTabMode = new DefaultTableModel(null, baris);
        tb_databuku.setModel(DftTabMode);
        
        tb_databuku.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb_databuku.getColumnModel().getColumn(0).setPreferredWidth(150);
        tb_databuku.getColumnModel().getColumn(1).setPreferredWidth(190);
        tb_databuku.getColumnModel().getColumn(2).setPreferredWidth(190);
        tb_databuku.getColumnModel().getColumn(3).setPreferredWidth(190);
        tb_databuku.getColumnModel().getColumn(4).setPreferredWidth(100);
        tb_databuku.getColumnModel().getColumn(5).setPreferredWidth(120);
        
        jspane.setBounds(new Rectangle(90,160,935,330));
        jspane.getViewport().add(tb_databuku,null);
        this.getContentPane().add(jspane);
         
        userInterface();
        
        tampil_data();
        
        setJam();
    }
    
    
    private void userInterface(){
        getContentPane().add(new bg("../image/tbl.png"));
    }
    
    public void tampil_data(){
        List data = new class_buku().tampil_data();
        Object[] a = data.toArray();
        String[] sl = (String[]) data.toArray(new String[0]);
        
        for(int i =0; i<sl.length; i=i+6){
            String[] dF = {sl[i], sl[i+1], sl[i+2], sl[i+3], sl[i+4], sl[i+5]};
            DftTabMode.addRow(dF);
        }
    }
    
    public void cari_data(String str){
        List data = new class_buku().cari_data(str);
        Object[] a = data.toArray();
        String[] sl = (String[]) data.toArray(new String[0]);
        
        for(int i =0; i<sl.length; i=i+6){
            String[] dF = {sl[i], sl[i+1], sl[i+2], sl[i+3], sl[i+4], sl[i+5]};
            DftTabMode.addRow(dF);
        }
    }
    
    public void kosong_table(){
        int baris = DftTabMode.getRowCount();
        for(int i=0; i<baris; i++){
            DftTabMode.removeRow(0);
        }
    }
    
    public void refresh(){
        txt_cari.setText("");
        kosong_table();
        tampil_data();
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(btn_search)){
            if(txt_cari.getText().length() != 0){
                kosong_table();
                cari_data(txt_cari.getText().toString().trim());
            }
            else{
                JOptionPane.showMessageDialog(null, "Harap masukan judul buku");
            }
        }
        if(ae.getSource().equals(btn_refresh)){
            refresh();
        }
        if(ae.getSource().equals(btn_exit)){
            int X=JOptionPane.showConfirmDialog(null,"Yakin Ingin Keluar ?","LOGOUT",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (X==JOptionPane.YES_OPTION){
            dispose();
         utama frm = new utama();
        frm.setSize(760,750);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        }
    }
    }
    public static void main(String[] args){
        table frm = new table();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(1100,650);
        frm.setLocationRelativeTo(null);
        frm.setResizable(false);
        frm.setVisible(true);    }

    }