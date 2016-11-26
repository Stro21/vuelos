
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lbarrera
 */
@Path("vuelo")
public class vuelo {
    
    private String fecha_origen_ida;
    private String fecha_Destino_ida;
    private String lugar_Origen_ida;
    private String lugar_Destino_ida;
    private String fecha_origen_vuelta;
    private String fecha_Destino_vuelta;
    private String lugar_Origen_vuelta;
    private String lugar_Destino_vuelta;
    private String tipo_Cliente; //premium economico, bussiness
    private int precio;
    
    private int cant_Asientos;
    
    @GET
    public String preguntar_Vuelo(@QueryParam("fecha") String fecha, 
            @QueryParam("tipo_cliente") String tipo_cliente, @QueryParam("origen") String origen,
            @QueryParam("destino") String destino) throws SQLException
    {
        
       // Establecemos la conexión con la base de datos. 
        //Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/sistema_pasajes","root", "MyNewPass"); 
        
        //Statement s = conexion.createStatement(); 
        //ResultSet rs = s.executeQuery ("select * from vuelos where fecha="+fecha+" AND tipo_cliente="+tipo_cliente+" AND origen="+origen+" AND destino="+destino);
        
       return  /*String.valueOf(rs.getInt(5))*/ tipo_cliente;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}








