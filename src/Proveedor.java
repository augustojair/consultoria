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

public class Proveedor{
    // Clase Proveedor (un proveedor "x" de la consultoría)
    String nombre, direccion, email, tipo, comentarios, telefono;

    public Proveedor(String nombre, String direccion, String email, String tipo, 
            String comentarios, String telefono) { 
        // Evento Constructor
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.tipo = tipo;
        this.comentarios = comentarios;
        this.telefono = telefono;
    }
    
    public Proveedor() { // Construye que crea un "Proveedor" sin parámetros
    
    }

    public String getNombre() { // Get el "Nombre" del Proveedor
        /** 
         * @return el "Nombre" del Proveedor 
        */
        return nombre;
    }

    public void setNombre(String nombre) { // Set el "Nombre" del Proveedor
        this.nombre = nombre;
    }

    public String getDireccion() { // Get la "Dirección" del Proveedor
        /** 
         * @return la "Dirección" del Proveedor 
        */
        return direccion;
    }

    public void setDireccion(String direccion) { // Set la "Dirección" del Proveedor
        this.direccion = direccion;
    }

    public String getEmail() { // Get el "E-mail" del Proveedor
        /** 
         * @return el "E-mail" del Proveedor 
        */
        return email;
    }

    public void setEmail(String email) { // Set el "E-mail" del Proveedor
        this.email = email;
    }

    public String getTelefono() { // Get el "Teléfono" del Proveedor
        /** 
         * @return el "Teléfono" del Proveedor 
        */
        return telefono;
    }

    public void setTelefono(String telefono) { // Set el "Teléfono" del Proveedor
        this.telefono = telefono;
    }

    public String getTipo() { // Get el "Tipo" del Proveedor
        /** 
         * @return el "Tipo" del Proveedor 
        */
        return tipo;
    }

    public void setTipo(String tipo) { // Set el "Tipo" del Proveedor
        this.tipo = tipo;
    }

    public String getComentarios() { // Get los "Comentarios" del Proveedor
        /** 
         * @return los "Comentarios" del Proveedor 
        */
        return comentarios;
    }

    public void setComentarios(String comentarios) { // Set los "Comentarios" del Proveedor
        this.comentarios = comentarios;
    }
    
    public void guardar() { // Guardar un nueva/editar un Proveedor
        try{
            //Cargamos la clase del Conector
            Class.forName("org.h2.Driver");
            //Realizamos la conexión a la base de datos con nombre "nombreDatabase
            Connection conn = DriverManager.getConnection("jdbc:h2:nombreDatabase");

            //Generamos de la clase que pregunta
            Statement stat = conn.createStatement();        

            // Creamos la tabla
            stat.execute("create table if not exists proveedores2(id bigint auto_increment"
                    + " primary key,nombre varchar(255), direccion varchar(255),"
                    + "email varchar(255),tipo varchar(255),comentarios "
                    + "varchar(1000),telefono varchar(255))");
            //Insertamos dos datos en la tabla
            stat.execute("insert into proveedores2(nombre,direccion,email,tipo,"
                    + "comentarios,telefono) values('"+this.getNombre()+"','"
                    +this.getDireccion()+"','"+this.getEmail()+"','"+this.getTipo()+
                    "','"+this.getComentarios()+"',"+this.getTelefono()+")");
            //Finalizamos la conexión a la base de datos
            stat.close();
            conn.close();
            // Reporte de Éxito!
            JOptionPane.showMessageDialog(null, "Proveedor cargado con exito!");
        }
        catch(Exception e) {
            // Reporte de Error
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error! Verifique datos..."+e);
        }
    }
    
    public javax.swing.DefaultListModel cargarEnLista(){
        // Cargar inicial de Proveedores en la lista de los mismos
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
            rs = stat.executeQuery("select * from proveedores2 where id > 0");
            //Buscamos todas las respuestas que nos dieron
            while (rs.next()) {
                lista.addElement(rs.getString("nombre"));
            }
            //Finalizamos la conexión a la base de datos
            stat.close();
            conn.close();
            /**
             * @return de la lista de Proveedores a cargar
            */
            return lista;
        }
        catch(Exception e){
            // Reporte de Error
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error!"+e);
            /**
             * @return de la lista de Proveedores a cargar
            */
            return lista;
        }
    }
    public void cargar(int id){
        // Una vez seleccionada un Proveedor, se cargan los datos en los campos correspondientes
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
                rs = stat.executeQuery("select * from proveedores2 where id = " +
                        String.valueOf(id));
                // Leeemos base de datos y seleccionamos el id necesario             
                rs.first();
                //Buscamos todas las respuestas que nos dieron
                nombre = rs.getString("nombre"); // Recuperacion de datos
                direccion = rs.getString("direccion");
                email = rs.getString("email");
                tipo = rs.getString("tipo");
                comentarios = rs.getString("comentarios");
                telefono = rs.getString("telefono");
                //Finalizamos la conexión a la base de datos
                stat.close();
                conn.close();
            }
            catch(Exception e){
                // Reporte de Error
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error" + e);
            }
    }
    public void update(int id){
        try{
            //Cargamos la clase del Conector
            Class.forName("org.h2.Driver");
            //Realizamos la conexión a la base de datos con nombre "nombreDatabase"
            Connection conn = DriverManager.getConnection("jdbc:h2:nombreDatabase");

            //Generamos de la clase que pregunta
            Statement stat = conn.createStatement();
            //Insertamos dos datos en la tabla
            // Reingresamos los datos para actualizar
            stat.execute("UPDATE clientes1 SET nombre='"+this.getNombre() +
                    "', direccion='" + this.getDireccion() + "', email='"
                    + this.getEmail() + "', tipo='" + this.getTipo() +
                    "', comentarios='" + this.getComentarios() +
                    "', telefono='" + this.getTelefono() + "' WHERE id=" + String.valueOf(id));
            
            //Finalizamos la conexión a la base de datos
            stat.close();
            conn.close();
            // Informe de Exito!
            JOptionPane.showMessageDialog(null, "Proveedor actualizado con exito!");
        }
        // Informe de Error!
        catch(Exception e) {JOptionPane.showMessageDialog(null,
                "Ha ocurrido un error! Verifique datos..."+e);}
    }
}