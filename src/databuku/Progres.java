package databuku;

// ProgressBar 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Progres extends JFrame
{
    final static int interval = 100;
    int i;
    JLabel label = new JLabel();
    JProgressBar pb = new JProgressBar(0, 100);
    Timer timer;	
    JLabel form = new JLabel(new ImageIcon("src/image/progres.png"));
    ImageIcon ikon = new ImageIcon("src/image/logo.png");
	
    public Progres() {
 
        this.setTitle("Applikasi Data Buku");
        form.setBounds(new Rectangle(0,0,500,430)); 
       
        pb.setValue(0);
        pb.setStringPainted(true);
        pb.setBounds(new Rectangle(200,200,235,30));
        this.getContentPane().add(pb);
                
        label.setBounds(new Rectangle(200,150,200,80));
        label.setText("keterangan");
        this.getContentPane().add(label);
        this.getContentPane().add(form);
        this.setIconImage(ikon.getImage());
		
        //Buat timer.
        timer = new Timer(interval, new ActionListener() {
            public void actionPerformed(ActionEvent evt) 
            {
                if (i == 100){
                    timer.stop();                    
                    pb.setValue(0);
        setVisible(false);            		
        utama a = new utama();
        a.setSize(760, 750);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setLocationRelativeTo(null);
        
                }
                i = i + 1;
                pb.setValue(i);
            }
        });
		
        i = 0;
        label.setText("Sedang Proses ...");
        timer.start();
     
    }
	
    public static void main(String[] args) {    	
        Progres m = new Progres();
        m.setSize(600,400);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
        m.setResizable(false);
    }
}

