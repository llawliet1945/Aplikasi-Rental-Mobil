package connection;
import java.sql.*;
/*
 * @author https://github.com/llawliet1945
 */
public class connection{
    private Connection Connection;
    public Connection connect(){
        try{
            Class.forName ("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        }catch (ClassNotFoundException ex){
            System.out.println("Gagal Koneksi"+ex);
        }
        String url = "jdbc:mysql://localhost/sewa_mobil";
        try{
            Connection = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Koneksi Database");
        }catch (SQLException ex){
            System.out.println("Gagal Koneksi Database"+ex);
        }
        return Connection;
    }
}
