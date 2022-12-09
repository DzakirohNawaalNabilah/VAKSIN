package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection conn=null;
    public static Connection getConnection(){
        if(conn!=null)
            return conn;
        else{
            String dburl="jdbc:mysql://localhost:3306/"+"vaksin?user=root&password";
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn=DriverManager.getConnection(dburl);
                System.out.println("BERHASIL YEY");
            }
            catch(ClassNotFoundException | SQLException e){
                System.out.println("Error loading driver : "+e.getMessage());
            }
            return conn;
        }
      
}
    public static void main(String[] args) {
        getConnection();
    }
}
