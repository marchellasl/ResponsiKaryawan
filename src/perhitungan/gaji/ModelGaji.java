package perhitungan.gaji;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ModelGaji 
{
    String Tnama, Talamat, Thp, Tposisi, Tgaji;
    String Unama, Ualamat, Uhp, Uposisi, Ugaji;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/gaji_karyawan";
    static final String USER = "root";
    static final String PASS = "root";
    
    Connection koneksi;
    Statement statement;
    
    public ModelGaji()
    {
        try //koneksi database
        {
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Connection Failed");
        }
    }
    
    public void insertPegawai(String id, String nama, String alamat, String hp, String posisi, String gaji, String jam, String pajak, String tunjangan, String total)
    {
        try
        {
            String sql = "INSERT INTO `pegawai` (`id_karyawan`, `nama`, `alamat`, `nomor_hp`, `posisi`, `gaji_pokok`, `jam_lembur`, `pajak`, `tunjangan`, `total`)"
                    + "VALUES ('"+id+"', '"+nama+"', '"+alamat+"', '"+hp+"', '"+posisi+"', '"+gaji+"', '"+jam+"', '"+pajak+"', '"+tunjangan+"', '"+total+"')";  
            statement = koneksi.createStatement();
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Tersimpan"); 
        }
        catch(Exception sql)
        {
            System.out.println(sql.getMessage());         
        }
    }
    
    public int getBanyakDataHitung()
    {
        int jmlData = 0;
        try
        {
            statement = koneksi.createStatement();
            String query = "SELECT * FROM `pegawai`";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next())
            {
                jmlData++;
            }
            return jmlData;
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public String[][] readGaji()
    {
        
        try
        {
            int jmlData = 0;
            
            String data[][] = new String[getBanyakDataHitung()][7];
            String query = "SELECT * FROM `pegawai`";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next())
            {
                data[jmlData][0] = resultSet.getString("id_karyawan");
                data[jmlData][1] = resultSet.getString("nama");
                data[jmlData][2] = resultSet.getString("posisi");
                data[jmlData][3] = resultSet.getString("gaji_pokok");
                data[jmlData][4] = resultSet.getString("jam_lembur");
                data[jmlData][5] = resultSet.getString("tunjangan");   
                data[jmlData][6] = resultSet.getString("total");                
                jmlData++;
            }
            return data;
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public void tambahAdmin(String id)
    {
        try
        {
            String query = "SELECT * FROM `pegawai` WHERE `id_karyawan` = '"+id+"';";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next())
            {
                Tnama = resultSet.getString("nama");
                Talamat = resultSet.getString("alamat");
                Thp = resultSet.getString("nomor_hp");
                Tposisi = resultSet.getString("posisi");
                Tgaji = resultSet.getString("gaji_pokok");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    }
    
    public void insertAdmin(String id, String nama, String alamat, String hp, String posisi, String gaji)
    {
        try
        {
            String sql = "INSERT INTO `karyawan` (`id_karyawan`, `nama`, `alamat`, `nomor_hp`, `posisi`, `gaji_pokok`)"
                    + "VALUES ('"+id+"', '"+nama+"', '"+alamat+"', '"+hp+"', '"+posisi+"', '"+gaji+"')";  
            statement = koneksi.createStatement();
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Tersimpan"); 
        }
        catch(Exception sql)
        {
            System.out.println(sql.getMessage());         
        }
    }
    
    public int getBanyakDataKaryawan()
    {
        int jmlData = 0;
        try
        {
            statement = koneksi.createStatement();
            String query = "SELECT * FROM `karyawan`";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next())
            {
                jmlData++;
            }
            return jmlData;
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public String[][] readKaryawan()
    {
        
        try
        {
            int jmlData = 0;
            
            String data[][] = new String[getBanyakDataHitung()][6];
            String query = "SELECT * FROM `karyawan`";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next())
            {
                data[jmlData][0] = resultSet.getString("id_karyawan");
                data[jmlData][1] = resultSet.getString("nama");
                data[jmlData][2] = resultSet.getString("alamat");
                data[jmlData][3] = resultSet.getString("nomor_hp");
                data[jmlData][4] = resultSet.getString("posisi");
                data[jmlData][5] = resultSet.getString("gaji_pokok");                  
                jmlData++;
            }
            return data;
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }    
    
    public void updateAdmin (String id, String nama, String alamat, String hp, String posisi, String gaji)
    {
        try
        {
            String sql = "UPDATE `karyawan` SET `nama` = '"+nama+"', `alamat` = '"+alamat+"', `nomor_hp` = '"+hp+"', `posisi` = '"+posisi+"'"
                    + ", `gaji_pokok` = '"+gaji+"' WHERE `id_karyawan` = '"+id+"'";

            statement = koneksi.createStatement();
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Diubah"); 
        }
        catch(Exception sql)
        {
            System.out.println(sql.getMessage());         
        }
    }
    
    public void dataUbah (String id)
    {
        try
        {
            String query = "SELECT * FROM `karyawan` WHERE `id_karyawan` = '"+id+"';";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next())
            {
                Unama = resultSet.getString("nama");
                Ualamat = resultSet.getString("alamat");
                Uhp = resultSet.getString("nomor_hp");
                Uposisi = resultSet.getString("posisi");
                Ugaji = resultSet.getString("gaji_pokok");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    }
    
        public void dataHapus(String id){
        try{
            String query = "DELETE FROM `karyawan` WHERE `id_karyawan` = '"+id+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");       
        }catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
}
