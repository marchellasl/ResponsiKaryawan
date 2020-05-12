package perhitungan.gaji;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTable;

public class Controller_TambahAdmin 
{
    View_TambahAdmin viewTambah;
    ModelGaji modelGaji;
    
    public Controller_TambahAdmin (View_TambahAdmin viewTambah, ModelGaji modelGaji)
    {
        this.viewTambah = viewTambah;
        this.modelGaji = modelGaji;
        
        
        
        viewTambah.tfidPegawai.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                String id = viewTambah.getIDPegawai();
                
                modelGaji.tambahAdmin(id);
                
                String nama = modelGaji.Tnama;
                String alamat = modelGaji.Talamat;
                String hp = modelGaji.Thp;
                String posisi = modelGaji.Tposisi;
                String gaji = modelGaji.Tgaji;
                
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    viewTambah.tfnama.setText(nama);
                    viewTambah.tfalamat.setText(alamat);
                    viewTambah.tftelepon.setText(hp);
                    viewTambah.tfposisi.setText(posisi);
                    viewTambah.tfgaji.setText(gaji);
                }  
            }   
        });
        
        viewTambah.btnSimpan.addActionListener((ActionEvent e)->
        {
            String id = viewTambah.getIDPegawai();
            String nama = viewTambah.tfnama.getText();
            String alamat = viewTambah.tfalamat.getText();
            String hp = viewTambah.tftelepon.getText();
            String posisi = viewTambah.tfposisi.getText();
            String gaji = viewTambah.tfgaji.getText();
            
            modelGaji.insertAdmin(id, nama, alamat, hp, posisi, gaji);
        });       
        
        viewTambah.btnData.addActionListener((ActionEvent e)->
        {
            MVC_DataAdmin mvcAdmin = new MVC_DataAdmin();
        });  
    }
}
