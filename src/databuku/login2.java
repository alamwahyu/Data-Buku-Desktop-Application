

package databuku;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.swing.event.*;

public class login2 extends JFrame implements ActionListener{
    JLabel tema = new JLabel();
    JLabel lbl_user = new JLabel();
    JLabel lbl_pass = new JLabel();
    JLabel captcha = new JLabel();
    JLabel gmb_captcha = new JLabel();
    JLabel masukan = new JLabel();
    JLabel a = new JLabel();
    JLabel b = new JLabel();
    JTextField txt_isi = new JTextField();
    JTextField txt_user = new JTextField();
    JPasswordField txt_pass = new JPasswordField();
    JButton btn_login = new JButton();
    JButton btn_batal = new JButton();
    JButton home = new JButton();
    JButton refresh = new JButton();
    JSeparator satu = new JSeparator();
    JSeparator dua = new JSeparator();
    JSeparator tiga = new JSeparator();
    JCheckBox robot = new JCheckBox();
    JLabel aqua = new JLabel();

    
    String user, pass;
    int login;
    
    
    public login2(){
    
        this.setLayout(null);
        this.setTitle("Login");
        
        JPanel content = (JPanel)getContentPane();
        content.setBackground(new java.awt.Color(0, 102, 102));
       content.setLayout(null);
        
        aqua.setBounds(-30, 0, 380,400);
        aqua.setIcon(new javax.swing.ImageIcon(getClass().getResource("../image/aquas.png")));
        this.getContentPane().add(aqua);
        
        
        satu.setBounds(450, 105, 200, 30);
        this.getContentPane().add(satu);
        dua.setBounds(450, 165, 200, 30);
        this.getContentPane().add(dua);
        tiga.setBounds(450, 275, 200, 30);
        this.getContentPane().add(tiga);
        
        
        robot.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        robot.setForeground(new java.awt.Color(255, 255, 255));
        robot.setText("I'm not a Robot");
        robot.setBounds(450, 280, 150, 30);
        robot.setBackground(new java.awt.Color(0, 102, 102));
        this.getContentPane().add(robot);
        
        masukan.setFont(new java.awt.Font("Airstrike", 0, 18)); // NOI18N
        masukan.setForeground(new java.awt.Color(255, 255, 255));
        masukan.setText("Masukan Kode");
        masukan.setBounds(450, 170, 150, 30);
        this.getContentPane().add(masukan);
        
        refresh.setBackground(new java.awt.Color(0, 102, 102));
        refresh.setBorder(null);
        refresh.setBounds(630, 205, 30, 30);
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh.png")));
        this.getContentPane().add(refresh);
        refresh.addActionListener(this);
        
        captcha.setFont(new Font("Tahoma", Font.BOLD,22));
        captcha.setText("");
        captcha.setBounds(475, 185, 150, 70);
        this.getContentPane().add(captcha);
        
        gmb_captcha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/captcha.png")));
        gmb_captcha.setBounds(450, 200, 195, 40);
        this.getContentPane().add(gmb_captcha);
       
        txt_isi.setBackground(new java.awt.Color(0, 102, 102));
        txt_isi.setForeground(new java.awt.Color(255, 255, 255));
        txt_isi.setBorder(null);
        txt_isi.setBounds(450, 250, 195, 22);
        txt_isi.setFont(new Font("Tahoma", Font.PLAIN,12));
        txt_isi.setText("");
        this.getContentPane().add(txt_isi);

        
        home.setText("");
        home.setBorder(null);
        home.setBounds(625,0, 70, 70);
        home.setBackground(new java.awt.Color(0, 102, 102));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png")));
        this.getContentPane().add(home);
        
        home.addActionListener(this);
        
        lbl_user.setFont(new java.awt.Font("Airstrike", 0, 18)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user.setText("USERNAME");
        lbl_user.setBounds(450, 50, 110, 30);
        this.getContentPane().add(lbl_user);
     
        txt_user.setBackground(new java.awt.Color(0, 102, 102));
        txt_user.setFont(new Font("Tahoma", Font.PLAIN,12));
        txt_user.setText("");
        txt_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_user.setBorder(null);
        txt_user.setBounds(450, 80, 195, 22);
        this.getContentPane().add(txt_user);
        
        lbl_pass.setFont(new java.awt.Font("Airstrike", 0, 18));
        lbl_pass.setText("PASSWORD");
        lbl_pass.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pass.setBounds(450, 115, 110, 30);
        //lbl_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iKey.png")));
        this.getContentPane().add(lbl_pass);
        
        txt_pass.setBackground(new java.awt.Color(0, 102, 102));
        txt_pass.setForeground(new java.awt.Color(255, 255, 255));
        txt_pass.setFont(new Font("Tahoma", Font.PLAIN,12));
        txt_pass.setText("");
        txt_pass.setBorder(null);
        txt_pass.setBounds(450, 140, 195, 22);
        this.getContentPane().add(txt_pass);
        
        btn_login.setFont(new Font("Tahoma", Font.BOLD,14));
        btn_login.setText("SIGN IN");
        btn_login.setBackground(new java.awt.Color(0, 204, 204));
        btn_login.setBorder(null);
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setBounds(400, 320, 130, 30);
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png")));
        btn_login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.getContentPane().add(btn_login);
       
        this.getRootPane().setDefaultButton(btn_login);
        btn_login.addActionListener(this);
        
        btn_batal.setBackground(new java.awt.Color(0, 204, 204));
        btn_batal.setBorder(null);
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setFont(new Font("Tahoma", Font.BOLD,14));
        btn_batal.setText("BATAL");
        btn_batal.setBounds(550, 320, 110, 30);
        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png")));

        this.getContentPane().add(btn_batal);
        btn_batal.addActionListener(this);

        
        setKode();
   
    }
    
    
    public void setKode()
    {
    	RandomGenerator random = new RandomGenerator();        
        String str = random.generateActivationCode(8);  
        captcha.setText(str);
    }
    
    public void kosong_text(){
        txt_user.setText("");
        txt_pass.setText("");
    }

   
    //private void userInterface(){
        //getContentPane().add(new bg("../image/putih.jpg"));
    //}
        
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(btn_login)){
            login = login +1;
                String user = "admin";
                String pass = "informatika";
                
        if(user.equalsIgnoreCase(txt_user.getText()) && pass.equalsIgnoreCase(txt_pass.getText())){
            String kode = txt_isi.getText();
            if(kode.equals(captcha.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Anda Benar! Login Berhasil");
                txt_isi.setText("");
                this.setVisible(false);
            
        bag_buku frm = new bag_buku();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(1100,650);
        frm.setLocationRelativeTo(null);
        frm.setResizable(false);
        frm.setVisible(true);    
            }
            else {
                JOptionPane.showMessageDialog(null, "Kode Salah"); 
                setKode();
                txt_isi.setText("");
            }
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(null,"Kombinasi nama dan Password Salah");
            if (login>=3){
                javax.swing.JOptionPane.showMessageDialog(null,"Login tidak berhasil, Silahkan coba kembali");
                this.setVisible(false);
        utama frm = new utama();
        frm.setSize(500,740);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
            }
            txt_user.setText("");
            txt_user.requestFocus();
            txt_pass.setText("");
        }
    }
        if (ae.getSource().equals(refresh)){
                setKode();
            }
        if(ae.getSource().equals(btn_batal)){
        kosong_text();
    }
        if(ae.getSource().equals(home)){
            this.setVisible(false);
            utama frm = new utama();
        frm.setSize(500,740);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        }
        }
    //private void txt_userKeyPressed(java.awt.event.KeyEvent evt){
        //if (evt.getKeyCode()== evt.VK_ENTER)
            //txt_pass.requestFocus();
    //}                                        
    //private void txtPassKeyPressed(java.awt.event.KeyEvent evt){
        //if(evt.getKeyCode()==evt.VK_ENTER)
            //btn_login.doClick();
    //}
    
    
    public static void main (String[] args){
        login2 frm = new login2();
        frm.setSize(700,400);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setResizable(false);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
