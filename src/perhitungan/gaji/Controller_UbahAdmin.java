
package perhitungan.gaji;

import java.awt.event.ActionEvent;

public class Controller_UbahAdmin {
    View_UbahAdmin viewUbah;
    ModelGaji modelGaji;
    
    public Controller_UbahAdmin(View_UbahAdmin viewUbah, ModelGaji modelGaji, String idp, String namad, String alamatd, String hpd, String posisid, String gajid)
    {
        this.viewUbah = viewUbah;
        this.modelGaji = modelGaji;

        viewUbah.tfidPegawai.setText(idp);
        viewUbah.tfnama.setText(namad);
        viewUbah.tfalamat.setText(alamatd);
        viewUbah.tftelepon.setText(hpd);
        viewUbah.cmbposisi.setSelectedItem(posisid);
        viewUbah.tfgaji.setText(gajid);
        
        viewUbah.btnUbah.addActionListener((ActionEvent e)->
        {
            String id = idp;
            String nama = viewUbah.tfnama.getText();
            String alamat = viewUbah.tfalamat.getText();
            String hp = viewUbah.tftelepon.getText();
            String posisi = (String)viewUbah.cmbposisi.getSelectedItem();
            String gaji = viewUbah.tfgaji.getText();
            
            modelGaji.updateAdmin(id, nama, alamat, hp, posisi, gaji);
        });         
        
                viewUbah.btnData.addActionListener((ActionEvent e)->
        {
            MVC_DataAdmin mvc= new MVC_DataAdmin();
        });  
    }
}
