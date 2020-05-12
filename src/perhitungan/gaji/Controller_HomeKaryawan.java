package perhitungan.gaji;

import java.awt.event.ActionEvent;

public class Controller_HomeKaryawan
{
    View_HomeKaryawan viewHome;
    ModelGaji modelGaji;
    
    public Controller_HomeKaryawan(View_HomeKaryawan viewHome, ModelGaji modelGaji)
    {
        this.viewHome = viewHome;
        this.modelGaji = modelGaji;
        
        viewHome.btnGaji.addActionListener((ActionEvent e)->
        {
//            MVC_Nota mvcNota = new MVC_Nota(no_nota, id_order, total_harga);
//            viewBeli.dispose();
        });
    }
}
