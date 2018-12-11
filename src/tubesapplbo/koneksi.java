
package tubesapplbo;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Angga
 */
public class koneksi {
    
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/learnjava","root","");    
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        
        return con;
    }
    
}
