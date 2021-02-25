
package databuku;

import java.sql.*;

public class class_koneksi {
    
    Connection conn;
    public Connection getConSQL(){
        try{
            String url = "jdbc:sqlserver://LAPTOP-HTFI5LEL:1433;"
                    + "databaseName=db_buku;user=sa;password=010599";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return conn;
    }
}
