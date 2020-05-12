package perhitungan.gaji;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class View_TambahAdmin extends JFrame
{
    JLabel lidPegawai = new JLabel ("ID Pegawai : ");
    JTextField tfidPegawai = new JTextField ();
    JLabel lnama = new JLabel ("Nama : ");
    JTextField tfnama = new JTextField ();
    JLabel lalamat = new JLabel ("Alamat : ");
    JTextField tfalamat = new JTextField ();
    JLabel ltelepon = new JLabel ("No. HP : ");
    JTextField tftelepon = new JTextField ();
    JLabel lposisi = new JLabel ("Posisi : ");
    JTextField tfposisi = new JTextField ();
    JLabel lgaji = new JLabel ("Gaji Pokok : ");
    JTextField tfgaji = new JTextField ();
    
    JButton btnHome = new JButton ("HOME");
    JButton btnTambah = new JButton ("TAMBAH");
    JButton btnData = new JButton ("DATA");
    JButton btnPetunjuk = new JButton ("PETUNJUK");
    JButton btnKaryawan = new JButton ("KARYAWAN");
    JButton btnSimpan = new JButton ("SIMPAN");
    
    public View_TambahAdmin()
    {
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
        add(btnSimpan);
        btnSimpan.setBounds(450, 250, 120, 60);
        
        add(lidPegawai);
        lidPegawai.setBounds(200, 50, 120, 20);
        add(tfidPegawai);
        tfidPegawai.setBounds(300, 50, 300, 20);
        add(lnama);
        lnama.setBounds(200, 80, 120, 20);
        add(tfnama);
        tfnama.setBounds(300, 80, 300, 20);
        add(lalamat);
        lalamat.setBounds(200, 110, 120, 20);
        add(tfalamat);
        tfalamat.setBounds(300, 110, 300, 20);
        add(ltelepon);
        ltelepon.setBounds(200, 140, 120, 20);
        add(tftelepon);
        tftelepon.setBounds(300, 140, 300, 20);
        add(lposisi);
        lposisi.setBounds(200, 170, 120, 20);
        add(tfposisi);
        tfposisi.setBounds(300, 170, 300, 20);
        add(lgaji);
        lgaji.setBounds(200, 200, 120, 20);
        add(tfgaji);
        tfgaji.setBounds(300, 200, 300, 20);        
        
    }
    
    public String getIDPegawai()
    {
        return tfidPegawai.getText();
    }
}
