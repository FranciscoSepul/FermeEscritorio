package FermeEscritoriodb;
import  java.sql.*;

public class Conexion {
    
    public static Connection getConexion(){
     Connection conexion=null;
        try {
            String DriverClassName="oracle.jdbc.driver.OracleDriver";
            String driverUrl ="jdbc:oracle:thin:@localhost:1521:XE";
            Class.forName(DriverClassName);
            conexion = DriverManager.getConnection(driverUrl,"F","oracle");
        } catch (Exception e) {
            System.out.println("error de conexion"+e.getMessage());
        }
        return conexion;
    }
}
