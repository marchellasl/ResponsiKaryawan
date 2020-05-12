package perhitungan.gaji;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controller_GajiKaryawan
{
    String pajak, tunjangan, total;
    View_GajiKaryawan viewGaji;
    ModelGaji modelGaji;
    
    public Controller_GajiKaryawan(View_GajiKaryawan viewGaji, ModelGaji modelGaji)
    {
        this.viewGaji = viewGaji;
        this.modelGaji = modelGaji;
        
        
        viewGaji.btnHitung.addActionListener((ActionEvent e)->
        {
            String gajipokok = viewGaji.getGaji();
            int gaji = Integer.parseInt(gajipokok);
            String jamlembur = viewGaji.getJam();
            int jam = Integer.parseInt(jamlembur);
            int pajakint = gaji/100*1;
            int tunjanganint = jam*15000;
            int totalint = gaji-pajakint+tunjanganint;
            pajak = Integer.toString(pajakint);
            viewGaji.setPajak(pajak);
            tunjangan = Integer.toString(tunjanganint);
            viewGaji.setTunjangan(tunjangan);
            total = Integer.toString(totalint);
            viewGaji.setTotal(total);
        });
        
        viewGaji.btnSimpan.addActionListener((ActionEvent e)->
        {
            String id = viewGaji.getIDPegawai();
            String nama = viewGaji.getNama();
            String alamat = viewGaji.getAlamat();
            String hp = viewGaji.getHP();
            String posisi = viewGaji.getPosisi();
            String gaji = viewGaji.getGaji();
            String jam = viewGaji.getJam();
            String pajakk = viewGaji.tfpajak.getText();
            String tunjangann = viewGaji.tftunjangan.getText();
            String totall = viewGaji.tftotal.getText();
            
            modelGaji.insertPegawai(id, nama, alamat, hp, posisi, gaji, jam, pajakk, tunjangann, totall);
            
        });
        
        viewGaji.btnData.addActionListener((ActionEvent e)->
        {
            MVC_DataKaryawan mvcData = new MVC_DataKaryawan();
            viewGaji.dispose();
            
        });

        
        
                
    }
}
