package perhitungan.gaji;

public class MVC_GajiKaryawan 
{
    View_GajiKaryawan viewGaji = new View_GajiKaryawan();
    ModelGaji modelGaji = new ModelGaji();
    Controller_GajiKaryawan controllerGaji = new Controller_GajiKaryawan (viewGaji, modelGaji);
}
