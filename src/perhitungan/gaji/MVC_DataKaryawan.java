package perhitungan.gaji;

public class MVC_DataKaryawan 
{
    View_DataKaryawan viewData = new View_DataKaryawan();
    ModelGaji modelGaji = new ModelGaji();
    Controller_DataKaryawan controllerData = new Controller_DataKaryawan(viewData, modelGaji);
}
