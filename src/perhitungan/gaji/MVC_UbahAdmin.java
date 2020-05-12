/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhitungan.gaji;

/**
 *
 * @author ASUS
 */
public class MVC_UbahAdmin 
{
    public MVC_UbahAdmin(String id,String nama,String alamat,String hp,String posisi,String gaji)
    {
        View_UbahAdmin viewUbah = new View_UbahAdmin();
        ModelGaji modelGaji = new ModelGaji();
        Controller_UbahAdmin controllerUbah = new Controller_UbahAdmin(viewUbah, modelGaji, id, nama, alamat, hp, posisi, gaji);
    }

}
