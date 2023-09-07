
package guia4ej2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pc
 */
public class Guia4ej2 {

    
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
           Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/obrador2023", "root", "");
            
//           String sql="INSERT INTO empleado( dni, apellido, nombre, acceso, estado) VALUES"
//                   + " (20123456,'Ponce','Barbara',2,1),"
//                   + "(25123456,'Benitez','Señor',1,1),"
//                   + "(28123456,'Perez','Caro',3,1)";
//           
              
//            PreparedStatement ps=conexion.prepareStatement(sql);
//            int registro=ps.executeUpdate();
//            System.out.println(registro);
            
//            String sql="INSERT INTO herramienta(`nombre`, `descripcion`, `stock`, `estado`) VALUES"
//                    + " ('Pinza','pico de loro',5,1),"
//                    +"('Llave Inglesa','premium',10,1) ";
//             PreparedStatement ps=conexion.prepareStatement(sql);
//            int registro=ps.executeUpdate();
//            System.out.println(registro);
//            

//            String sql="SELECT * FROM herramienta WHERE stock>=10";  
//               PreparedStatement ps=conexion.prepareStatement(sql);
//            ResultSet registro=ps.executeQuery();
//         
//            while (registro.next()) {
//                System.out.println("Id " + registro.getInt("idHerramienta"));
//                System.out.println("nombre " + registro.getString("nombre"));
//                System.out.println("descripcion " + registro.getString("descripcion"));
//                System.out.println("Stock "+registro.getInt("stock"));
//                System.out.println("Estado "+registro.getBoolean("estado"));
//                System.out.println("------------------------------");
//            }
           String sql="UPDATE empleado SET estado=false WHERE idEmpleado=9"; 
           PreparedStatement ps=conexion.prepareStatement(sql);
            int registro=ps.executeUpdate();
             System.out.println(registro);
             
             if(registro>0){
                 JOptionPane.showMessageDialog(null, "Empleado dado de baja exitosamente");
             }
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null , "Error al cargar Drive"+ex.getMessage());
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null , "Error en la conexion con la base de datos"+ex.getMessage());

        }
            
            
          
    }
    
}
/*Scanner Datos = new Scanner(System.in);
    
    LocalDate fecha = LocalDate.of(1994,Month.SEPTEMBER,28); 
        
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/univisidadulp","root", "");
         
           /* String sql = " INSERT INTO alumno ( dni, apellido, nombre, fechaNacimiento , estado)"
            + " VALUES (?,?,?,?,?)";
PreparedStatement ps = conexion.prepareStatement(sql);

            for(int i = 0 ; i < 3 ; i++){
                System.out.println("----------------------------------");
                System.out.println("Ingrese el dni");
                ps.setInt(1, Datos.nextInt());
                System.out.println("Apellido");
                ps.setString(2, Datos.next());
                System.out.println("Nombre");
                ps.setString(3, Datos.next());
                ps.setDate(4, Date.valueOf(fecha));
                ps.setBoolean(5, true);
                 ps.executeUpdate();
            }*/