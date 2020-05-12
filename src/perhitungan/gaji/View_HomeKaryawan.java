package perhitungan.gaji;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class View_HomeKaryawan extends JFrame
{
    JButton btnHome = new JButton ("HOME");
    JButton btnGaji = new JButton ("GAJI");
    JButton btnData = new JButton ("DATA");
    JButton btnPetunjuk = new JButton ("PETUNJUK");
    JButton btnAdmin = new JButton ("ADMIN");
    
    public View_HomeKaryawan()
    {
        setTitle("Perhitungan Gaji");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(900, 600);
        setLocation(200, 50); 
        this.getContentPane().setBackground(Color.WHITE);
        
        add(btnHome);
        btnHome.setBounds(20, 20, 120, 60);
        add(btnGaji);
        btnGaji.setBounds(20, 100, 120, 60);
        add(btnData);
        btnData.setBounds(20, 180, 120, 60);
        add(btnPetunjuk);
        btnPetunjuk.setBounds(20, 260, 120, 60);
        add(btnAdmin);
        btnAdmin.setBounds(740, 20, 120, 60);
        
    }
}
