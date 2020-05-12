package perhitungan.gaji;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class View_DataAdmin extends JFrame
{
    JTable tabel;
    DefaultTableModel tableModel;
    Object namaKolom[] = {"ID", "Nama", "Alamat", "No. HP", "Posisi", "Gaji Pokok"};
    JScrollPane scrollPane;
    
    JButton btnHome = new JButton ("HOME");
    JButton btnTambah = new JButton ("TAMBAH");
    JButton btnData = new JButton ("DATA");
    JButton btnPetunjuk = new JButton ("PETUNJUK");
    JButton btnShow = new JButton ("SHOW");
    JButton btnKaryawan = new JButton ("KARYAWAN");
    JButton btnUpdate = new JButton ("UPDATE");
    JButton btnDelete = new JButton ("DELETE");
    JLabel lidPegawai = new JLabel ("ID Pegawai");
    JTextField tfidPegawai = new JTextField();
    
    public View_DataAdmin()
    {
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
        add(btnTambah);
        btnTambah.setBounds(20, 100, 120, 60);
        add(btnData);
        btnData.setBounds(20, 180, 120, 60);
        add(btnPetunjuk);
        btnPetunjuk.setBounds(20, 260, 120, 60);  
        add(btnKaryawan);
        btnKaryawan.setBounds(740, 20, 120, 60);
        add(btnShow);
        btnShow.setBounds(450, 480, 120, 60);
        add(btnUpdate);
        btnUpdate.setBounds(300, 480, 120, 60);
        add(btnDelete);
        btnDelete.setBounds(600, 480, 120, 60);
        
        add(lidPegawai);
        lidPegawai.setBounds(240, 410, 120, 20);
        add(tfidPegawai);
        tfidPegawai.setBounds(340, 410, 200, 20);
        
    }    
}
