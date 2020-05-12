package perhitungan.gaji;

import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Controller_DataAdmin
{
    View_DataAdmin viewData;
    ModelGaji modelGaji;
    
    public Controller_DataAdmin (View_DataAdmin viewData, ModelGaji modelGaji)
    {
        this.viewData = viewData;
        this.modelGaji = modelGaji;
        
         viewData.btnShow.addActionListener((ActionEvent e)->
        {
           String dataKaryawan[][] = modelGaji.readKaryawan();
           viewData.tabel.setModel(new JTable(dataKaryawan, viewData.namaKolom).getModel());
            
        });
         
         viewData.btnUpdate.addActionListener((ActionEvent e)->
        {
            String id = viewData.tfidPegawai.getText();
            modelGaji.dataUbah(id);
            String namad = modelGaji.Unama;
            String alamatd = modelGaji.Ualamat;
            String hpd = modelGaji.Uhp;
            String posisid = modelGaji.Uposisi;
            String gajid = modelGaji.Ugaji;
            
            modelGaji.dataUbah(id);
            MVC_UbahAdmin mvc = new MVC_UbahAdmin(id, namad, alamatd, hpd, posisid, gajid);
        });    
         
                  viewData.btnDelete.addActionListener((ActionEvent e)->
        {
            String id = viewData.tfidPegawai.getText();
            modelGaji.dataHapus(id);
        });    
    }
}
