package perhitungan.gaji;

public class MVC_TambahAdmin 
{
    View_TambahAdmin viewTambah = new View_TambahAdmin();
    ModelGaji modelGaji = new ModelGaji();
    Controller_TambahAdmin controllerTambah = new Controller_TambahAdmin(viewTambah, modelGaji);
    
}
