package perhitungan.gaji;

public class MVC_DataAdmin {
    
    View_DataAdmin viewData = new View_DataAdmin();
    ModelGaji modelGaji = new ModelGaji();
    Controller_DataAdmin controllerTambah = new Controller_DataAdmin(viewData, modelGaji);    
}
