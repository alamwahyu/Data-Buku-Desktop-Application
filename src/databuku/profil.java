package databuku;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class profil extends JFrame implements ActionListener{
    JButton home = new JButton();
    public profil(){
        setTitle("Visi Misi");
        
        home.setFont(new Font("Tahoma", Font.BOLD,14));
        home.setText("");
        home.setBounds(590, 0, 70, 70);
        home.setForeground(new java.awt.Color(0, 0, 255));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png")));
        this.getContentPane().add(home);
        
        home.addActionListener(this);
        
        userInterface();
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
    private void userInterface(){
        getContentPane().add(new bg("../image/visimisi.png"));
    }
    
    public static void main(String[] args){
        profil obj = new profil();
        obj.setSize(700,700);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }
}

