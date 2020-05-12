package perhitungan.gaji;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class View_HomeAdmin extends JFrame
{
    JButton btnHome = new JButton ("HOME");
    JButton btnTambah = new JButton ("TAMBAH");
    JButton btnData = new JButton ("DATA");
    JButton btnPetunjuk = new JButton ("PETUNJUK");
    JButton btnKaryawan = new JButton ("KARYAWAN");
    
    public View_HomeAdmin()
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
        add(btnTambah);
        btnTambah.setBounds(20, 100, 120, 60);
        add(btnData);
        btnData.setBounds(20, 180, 120, 60);
        add(btnPetunjuk);
        btnPetunjuk.setBounds(20, 260, 120, 60);
        add(btnKaryawan);
        btnKaryawan.setBounds(740, 20, 120, 60);
        
    }    
}
