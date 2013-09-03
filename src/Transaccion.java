// Importamos las librerías necesarias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author augusto
 */

public class Transaccion{
    // Clase Transacción (una transacción "x" de la consultoría)
    String descripcion, fecha, monto;

    public Transaccion(String descripcion, String fecha, String monto) {
        // Evento Contructo con todos los parametros
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.monto = monto;
    }
    
    public Transaccion() { // Construye que crea una "Transacción" sin parámetros
    
    }

    public String getDescripcion() { // Get la "Descrpción" de la Transacción
        /** 
         * @return la "Descripción" de la Transacción 
        */
        return descripcion;
    }

    public void setDescripcion(String descripcion) { // Set la "Descrpción" de la Transacción
        this.descripcion = descripcion;
    }

    public String getFecha() { // Get la "Fecha" de la Transacción
        /** 
         * @return la "Fecha" de la Transacción 
        */
        return fecha;
    }

    public void setFecha(String fecha) { // Set la "Fecha" de la Transacción
        this.fecha = fecha;
    }

    public String getMonto() { // Get el "Monto" de la Transacción
        /** 
         * @return el "Monto" de la Transacción 
        */
        return monto;
    }

    public void setMonto(String monto) { // Set el "Monto" de la Transacción
        this.monto = monto;
    }
    
    public void guardar() { // Guardar una nueva Transacción
        try{
            //Cargamos la clase del Conector
            Class.forName("org.h2.Driver");
            //Realizamos la conexión a la base de datos con nombre "nombreDatabase
            Connection conn = DriverManager.getConnection("jdbc:h2:nombreDatabase");

            //Generamos de la clase que pregunta
            Statement stat = conn.createStatement();        

            // Creamos la tabla
            stat.execute("create table if not exists transacciones4"
                    + "(id bigint auto_increment primary key,descripcion "
                    + "varchar(255), fecha varchar(255),monto varchar(255))");
            //Insertamos dos datos en la tabla
            stat.execute("insert into transacciones4(descripcion, fecha, monto) "
                    + "values('"+this.getDescripcion()+"','"+this.getFecha()
                    +"','"+this.getMonto()+"')");
            //Finalizamos la conexión a la base de datos
            stat.close();
            conn.close();
            // Reporte de Éxito!
            JOptionPane.showMessageDialog(null, "Transacción cargado con exito!");
        }
        catch(Exception e) {
            // Reporte de Error
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error! Verifique datos..."+e);
        }
    }
    
    public javax.swing.DefaultListModel cargarEnLista(){
        // Cargar inicial de Transacciones en la lista de las mismas
        DefaultListModel lista = new DefaultListModel();
        try{
            //Cargamos la clase del Conector
            Class.forName("org.h2.Driver");
            //Realizamos la conexión a la base de datos con nombre "nombreDatabase
            Connection conn = DriverManager.getConnection("jdbc:h2:nombreDatabase");
            //Generamos de la clase que pregunta
            Statement stat = conn.createStatement();
            //Generamos de la clase que nos da la respuesta
            ResultSet rs;
            //Pedimos una respuesta
            rs = stat.executeQuery("select * from transacciones4 where id > 0");
            //Buscamos todas las respuestas que nos dieron
            while (rs.next()) {
                lista.addElement(rs.getString("descripcion"));
            }
            //Finalizamos la conexión a la base de datos
            stat.close();
            conn.close();
            /**
             * @return de la lista de Transacciones a cargar
            */
            return lista;
        }
        catch(Exception e){
            // Reporte de Error
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error!"+e);
            /**
             * @return de la lista de Transacciones a cargar
            */
            return lista;
        }
    }
    public void cargar(int id){
        // Una vez seleccionada una Transacción, se cargan los datos en los campos correspondientes
        try{
                //Cargamos la clase del Conector
                Class.forName("org.h2.Driver");
                //Realizamos la conexión a la base de datos con nombre "nombreDatabase"
                Connection conn = DriverManager.getConnection("jdbc:h2:nombreDatabase");
                //Generamos de la clase que pregunta
                Statement stat = conn.createStatement();
                //Generamos de la clase que nos da la respuesta
                ResultSet rs;
                //Pedimos una respuesta
                rs = stat.executeQuery("select * from transacciones4 where id = " +
                        String.valueOf(id));
                // Leeemos base de datos y seleccionamos el id necesario             
                rs.first();
                //Buscamos todas las respuestas que nos dieron
                descripcion = rs.getString("descripcion"); // Recuperacion de datos
                fecha = rs.getString("fecha");
                monto = rs.getString("monto");
                //Finalizamos la conexión a la base de datos
                stat.close();
                conn.close();
            }
            catch(Exception e){
                // Reporte de Error
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error" + e);
            }
    }
}