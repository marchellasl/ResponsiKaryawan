package perhitungan.gaji;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class View_DataKaryawan extends JFrame
{
    JTable tabel;
    DefaultTableModel tableModel;
    Object namaKolom[] = {"ID", "Nama", "Posisi", "Gaji Pokok", "Jam Lembur", "Tunjangan", "Total Gaji"};
    JScrollPane scrollPane;
    
    JButton btnHome = new JButton ("HOME");
    JButton btnGaji = new JButton ("GAJI");
    JButton btnData = new JButton ("DATA");
    JButton btnPetunjuk = new JButton ("PETUNJUK");
    JButton btnShow = new JButton ("SHOW");
    JButton btnAdmin = new JButton ("ADMIN");
    
    public View_DataKaryawan()
    {
        setTitle("Perhitungan Gaji");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(900, 600);
        setLocation(200, 50); 
        this.getContentPane().setBackground(Color.WHITE);
        
        tableModel = new DefaultTableModel (namaKolom, 0);
        tabel = new JTable (tableModel);
        scrollPane = new JScrollPane (tabel);
        
        add(scrollPane);
        scrollPane.setBounds(200, 100, 680, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
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
        add(btnShow);
        btnShow.setBounds(450, 450, 120, 60);
    }
}
