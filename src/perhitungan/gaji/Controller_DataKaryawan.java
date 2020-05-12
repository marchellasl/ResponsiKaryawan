package perhitungan.gaji;

import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Controller_DataKaryawan
{
    View_DataKaryawan viewData;
    ModelGaji modelGaji;
    
    public Controller_DataKaryawan(View_DataKaryawan viewData, ModelGaji modelGaji)
    {
        this.viewData = viewData;
        this.modelGaji = modelGaji;
        
        
        viewData.btnShow.addActionListener((ActionEvent e)->
        {
           String dataGaji[][] = modelGaji.readGaji();
           viewData.tabel.setModel(new JTable(dataGaji, viewData.namaKolom).getModel());
            
        });
        
                viewData.btnAdmin.addActionListener((ActionEvent e)->
        {
            MVC_TambahAdmin mvc = new MVC_TambahAdmin();
            
        });
        

    }
}
