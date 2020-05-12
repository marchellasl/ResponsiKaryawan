package perhitungan.gaji;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class View_GajiKaryawan extends JFrame
{
    String setposisi;
    JLabel lidPegawai = new JLabel ("ID Pegawai : ");
    JTextField tfidPegawai = new JTextField ();
    JLabel lnama = new JLabel ("Nama : ");
    JTextField tfnama = new JTextField ();
    JLabel lposisi = new JLabel ("Posisi : ");
    String[] posisi = {"Direktur", "Manager", "Programmer", "Marketing", "Surveyor"};
    JComboBox cmbposisi = new JComboBox (posisi);
    JLabel lalamat = new JLabel ("Alamat : ");
    JTextField tfalamat = new JTextField ();
    JLabel ltelepon = new JLabel ("No. HP : ");
    JTextField tftelepon = new JTextField ();
    JLabel lgaji = new JLabel ("Gaji Pokok : ");
    JTextField tfgaji = new JTextField ();
    JLabel ljam = new JLabel ("Jam Lembur : ");
    JTextField tfjam = new JTextField ();
    JLabel ltunjangan = new JLabel ("Tunjangan : ");
    JTextField tftunjangan = new JTextField ();
    JLabel lpajak = new JLabel ("Pajak : ");
    JTextField tfpajak = new JTextField ();
    JLabel ltotal = new JLabel ("Total Gaji : ");
    JTextField tftotal = new JTextField ();
    
    JButton btnHome = new JButton ("HOME");
    JButton btnGaji = new JButton ("GAJI");
    JButton btnData = new JButton ("DATA");
    JButton btnPetunjuk = new JButton ("PETUNJUK");
    JButton btnHitung = new JButton ("HITUNG");
    JButton btnSimpan = new JButton ("SIMPAN");
    JButton btnAdmin = new JButton ("ADMIN");
    
    public View_GajiKaryawan()
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
        add(btnHitung);
        btnHitung.setBounds(740, 250, 120, 60);
        add(btnSimpan);
        btnSimpan.setBounds(740, 330, 120, 60);
        
        add(lidPegawai);
        lidPegawai.setBounds(200, 50, 120, 20);
        add(tfidPegawai);
        tfidPegawai.setBounds(300, 50, 300, 20);
        add(lnama);
        lnama.setBounds(200, 80, 120, 20);
        add(tfnama);
        tfnama.setBounds(300, 80, 300, 20);
        add(lposisi);
        lposisi.setBounds(200, 110, 120, 20);
        add(cmbposisi);
        cmbposisi.setBounds(300, 110, 120, 20);
        add(lalamat);
        lalamat.setBounds(200, 140, 120, 20);
        add(tfalamat);
        tfalamat.setBounds(300, 140, 300, 20);
        add(ltelepon);
        ltelepon.setBounds(200, 170, 120, 20);
        add(tftelepon);
        tftelepon.setBounds(300, 170, 300, 20);
        add(lgaji);
        lgaji.setBounds(200, 200, 120, 20);
        add(tfgaji);
        tfgaji.setBounds(300, 200, 300, 20);
        add(ljam);
        ljam.setBounds(200, 230, 120, 20);
        add(tfjam);
        tfjam.setBounds(300, 230, 300, 20);
        add(ltunjangan);
        ltunjangan.setBounds(200, 260, 120, 20);
        add(tftunjangan);
        tftunjangan.setBounds(300, 260, 300, 20);
        add(lpajak);
        lpajak.setBounds(200, 290, 120, 20);
        add(tfpajak);
        tfpajak.setBounds(300, 290, 300, 20);
        add(ltotal);
        ltotal.setBounds(200, 320, 120, 20);
        add(tftotal);
        tftotal.setBounds(300, 320, 300, 20);
    }
    
    public String getIDPegawai()
    {
        return tfidPegawai.getText();
    }
    
    public String getNama()
    {
        return tfnama.getText();
    }
    
    public String getPosisi()
    {
        setposisi = (String) cmbposisi.getSelectedItem();
        return setposisi;
    }
    
    public String getAlamat()
    {
        return tfalamat.getText();
    }
    
    public String getHP()
    {
        return tftelepon.getText();
    }
    
    public String getGaji()
    {
        return tfgaji.getText();
    }
    
    public String getJam()
    {
        return tfjam.getText();
    }
    
    public void setTunjangan(String tunjangan)
    {
        tftunjangan.setText(tunjangan);
    }
    
    public void setPajak(String pajak)
    {
        tfpajak.setText(pajak);
    }
    
    public void setTotal(String total)
    {
        tftotal.setText(total);
    }
}
