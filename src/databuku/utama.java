

package databuku;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.text.*;
public class utama extends JFrame implements ActionListener{
    JLabel biru = new JLabel();
    JLabel akhir = new JLabel();
    JButton btn_ok = new JButton();
    JButton btn_table = new JButton();
    JButton btn_contact = new JButton();
    JButton btn_exit = new JButton();
    JButton btn_home = new JButton();
    
    
    public utama(){
        this.setLayout(null);
        
        
        JPanel content = (JPanel)getContentPane();
        content.setBackground(new java.awt.Color(0, 102, 102));
       content.setLayout(null);
        
       biru.setIcon(new javax.swing.ImageIcon(getClass().getResource("../image/awal.png")));
       biru.setBounds(0, -50, 800, 800);
       this.getContentPane().add(biru);
       
       akhir.setIcon(new javax.swing.ImageIcon(getClass().getResource("../image/akhir.png")));
       akhir.setBounds(500, -50, 800, 800);
       this.getContentPane().add(akhir);
       
       
        btn_home.setText("");
        btn_home.setBorder(null);
        btn_home.setBackground(new java.awt.Color(0,204,204));
        btn_home.setBounds(100, 157, 100, 90);
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png")));
        this.getContentPane().add(btn_home);
        
        // Skrip JButton
        btn_ok.setText("");
        btn_ok.setBackground(new java.awt.Color(255,255,102));
        btn_ok.setBorder(null);
        btn_ok.setBounds(210, 157, 190, 90);
        btn_ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sigin.png")));
        this.getContentPane().add(btn_ok);
        
        // Deklarasi event source untuk pembangkit event
        btn_ok.addActionListener(this);
        btn_home.addActionListener(this);
        btn_contact.addActionListener(this);
        btn_table.addActionListener(this);
        btn_exit.addActionListener(this);
        
        btn_table.setBackground(new java.awt.Color(102,255,102));
        btn_table.setBorder(null);
        btn_table.setText("");
        btn_table.setBounds(100, 257, 190, 90);
        btn_table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/table.png")));
        this.getContentPane().add(btn_table);
        
        
        btn_contact.setBackground(new java.awt.Color(102,102,255));
        btn_contact.setBorder(null);
        btn_contact.setText("");
        btn_contact.setBounds(300, 257, 100, 90);
        btn_contact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/contact.png")));
        this.getContentPane().add(btn_contact);
        
        btn_exit.setBackground(new java.awt.Color(255, 102, 102));
        btn_exit.setBorder(null);
        btn_exit.setText("");
        btn_exit.setBounds(100, 357, 300, 70);
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png")));
        this.getContentPane().add(btn_exit);
       
    }
 
     public void actionPerformed(ActionEvent ae){
        // getSource.equals untuk menentukan asal Event Source
        if(ae.getSource().equals(btn_ok)){
            this.setVisible(false);
            login2 frm = new login2();
            frm.setVisible(true);
            frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frm.setSize(700,400);
            frm.setLocationRelativeTo(null);
            frm.setResizable(false);
          
        }
        if(ae.getSource().equals(btn_table)){
            this.setVisible(false);
        table c = new table();
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setSize(1100,650);
        c.setLocationRelativeTo(null);
        c.setResizable(false);
        c.setVisible(true);  
        }
        if(ae.getSource().equals(btn_home)){
            this.setVisible(false);
            profil obj = new profil();
        obj.setSize(700,700);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }
        if(ae.getSource().equals(btn_contact)){
            this.setVisible(false);
            contact b = new contact();
            b.setVisible(true);
            b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            b.setSize(600,350);
            b.setLocationRelativeTo(null);
            b.setResizable(false);
    }
        if(ae.getSource().equals(btn_exit)){
            int X=JOptionPane.showConfirmDialog(null,"Yakin Ingin Keluar ?","Keluar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (X==JOptionPane.YES_OPTION){
            dispose();
        }
    }}
   
    
     public static void main(String[] args){
        utama frm = new utama();
        frm.setSize(760,750);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
