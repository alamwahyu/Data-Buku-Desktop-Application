/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package databuku;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class contact extends JFrame implements ActionListener{
    JLabel lokasi = new JLabel();
    JLabel telp = new JLabel();
    JLabel fax = new JLabel();
    JLabel email = new JLabel();
    JLabel web = new JLabel();
    JLabel w = new JLabel();
    JButton home = new JButton();
    
    
    

public contact(){
           this.setTitle("Contact");
    
        home.setFont(new Font("Tahoma", Font.BOLD,12));
        home.setText("");
        home.setBounds(520, 245, 70, 70);
        home.setForeground(new java.awt.Color(0, 0, 255));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png")));
        this.getContentPane().add(home);
        
        lokasi.setFont(new Font("Tahoma", Font.BOLD,14));
        lokasi.setText("  Jl. Ir. H. Djuanda No.95 Ciputat 15412 Indonesia");
        lokasi.setBounds(50, 10, 400, 60);
        lokasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lokasi.png")));
        this.getContentPane().add(lokasi);
        
        telp.setFont(new Font("Tahoma", Font.BOLD,14));
        telp.setText("  (62-21)7494136");
        telp.setBounds(50, 60, 200, 60);
        telp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/telp.png")));
        this.getContentPane().add(telp);
        
        fax.setFont(new Font("Tahoma", Font.BOLD,14));
        fax.setText("  (62-21)7493175");
        fax.setBounds(50, 110, 200, 60);
        fax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fax.png")));
        this.getContentPane().add(fax);
        
        email.setFont(new Font("Tahoma", Font.BOLD,14));
        email.setText("  perpustakaan@uinjkt.ac.id");
        email.setBounds(50, 160, 250, 60);
        email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/email.png")));
        this.getContentPane().add(email);
        
        web.setFont(new Font("Tahoma", Font.BOLD,14));
        web.setText("  perpus.uinjkt.ac.id");
        web.setBounds(50, 210, 200, 60);
        web.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/web.png")));
        this.getContentPane().add(web);
        
        w.setText("");
        w.setBounds(50, 250, 200, 60);
        this.getContentPane().add(w);
        home.addActionListener(this);
        
        userInterface();
}
private void userInterface(){
        getContentPane().add(new bg("../image/kontak.jpg"));
    }
public void actionPerformed(ActionEvent ae){
        // getSource.equals untuk menentukan asal Event Source
        if(ae.getSource().equals(home)){
            this.setVisible(false);
            utama frm = new utama();
        frm.setSize(760,750);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        }
    }
public static void main (String[] args){
        contact frm = new contact();
        frm.setSize(600,350);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setResizable(false);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}