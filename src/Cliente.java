// Importamos librerías necesarias
import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author augusto
 */

public class Cliente {
    // Clase Cliente (un cliente "x" de la consultoría)
    String nombre, direccion, email, tipo, comentarios, telefono;
    
    public Cliente(String nombre, String direccion, String email, String tipo,
            String comentarios, String telefono) {
        // Evento Constructor
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.tipo = tipo;
        this.comentarios = comentarios;
        this.telefono = telefono;
    }
    
    public Cliente(){ // Construye que crea un "Cliente" sin parámetros
        
    }

    public String getNombre() { // Get el "Nombre" del Cliente
        /** 
         * @return el "Nombre" del Cliente 
        */
        return nombre;
    }

    public void setNombre(String nombre) { // Set el "Nombre" del Cliente
        this.nombre = nombre;
    }

    public String getDireccion() { // Get la "Dirección" del Cliente
        /** 
         * @return la "Dirección" del Cliente 
        */
        return direccion;
    }

    public void setDireccion(String direccion) { // Set la "Dirección" del Cliente
        this.direccion = direccion;
    }

    public String getEmail() { // Get el "E-mail" del Cliente
        /** 
         * @return el "E-mail" del Cliente 
        */
        return email;
    }

    public void setEmail(String email) { // Set el "E-mail" del Cliente
        this.email = email;
    }

    public String getTelefono() { // Get el "Teléfono" del Cliente
        /** 
         * @return el "Teléfono" del Cliente 
        */
        return telefono;
    }

    public void setTelefono(String telefono) { // Set el "Teléfono" del Cliente
        this.telefono = telefono;
    }

    public String getTipo() { // Get el "Tipo" del Cliente
        /** 
         * @return el "Tipo" del Cliente 
        */
        return tipo;
    }

    public void setTipo(String tipo) { // Set el "Tipo" del Cliente
        this.tipo = tipo;
    }

    public String getComentarios() { // Get los "Comentarios" del Cliente
        /** 
         * @return los "Comentarios" del Cliente 
        */
        return comentarios;
    }

    public void setComentarios(String comentarios) { // Set los "Comentarios" del Cliente
        this.comentarios = comentarios;
    }
    
    public void guardar() { // Guardar un nueva/editar un Cliente
        try{
            //Cargamos la clase del Conector
            Class.forName("org.h2.Driver");
            //Realizamos la conexión a la base de datos con nombre "nombreDatabase
            Connection conn = DriverManager.getConnection("jdbc:h2:nombreDatabase");

            //Generamos de la clase que pregunta
            Statement stat = conn.createStatement();        

            // Creamos la tabla
            stat.execute("create table if not exists clientes2(id bigint auto_increment "
                    + "primary key,nombre varchar(255),direccion varchar(255), "
                    + "email varchar(255),tipo varchar(255),comentarios varchar(1000), "
                    + "telefono varchar(255))");
            //Insertamos dos datos en la tabla
            stat.execute("insert into clientes2(nombre,direccion,email,tipo,comentarios,telefono)"
                    + " values('"+this.getNombre()+"','"+this.getDireccion()+
                    "','"+this.getEmail()+"','"+this.getTipo()+"','"
                    +this.getComentarios()+"',"+this.getTelefono()+")");
            
            //Finalizamos la conexión a la base de datos
            stat.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Cliente cargado con exito!");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error! Verifique datos..."+e);
            System.out.println("Error: "+e.toString());
        }
    }
    public javax.swing.DefaultListModel cargarEnLista(){
        // Cargar inicial de Clientes en la lista de los mismos
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
            rs = stat.executeQuery("select * from clientes2 where id > 0");
            //Buscamos todas las respuestas que nos dieron
            while (rs.next()) {
                 lista.addElement(rs.getString("nombre"));
            }
            //Finalizamos la conexión a la base de datos
            stat.close();
            conn.close();
            /**
             * @return de la lista de Clientes a cargar
            */
            return lista;
        }
        catch(Exception e){
            // Reporte de Error
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error!"+e);
            /**
             * @return de la lista de Clientes a cargar
            */
            return lista;
        }
}
        public void cargar(int id){
            // Una vez seleccionada un Cliente, se cargan los datos en los campos correspondientes
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
                rs = stat.executeQuery("select * from clientes2 where id = " 
                        + String.valueOf(id));
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
                //Reporte de error
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
            stat.execute("UPDATE clientes2 SET nombre='"+this.getNombre() +
                    "', direccion='" + this.getDireccion() + "', email='"
                    + this.getEmail() + "', tipo='" + this.getTipo() +
                    "', comentarios='" + this.getComentarios() +
                    "', telefono='" + this.getTelefono() + "' WHERE id=" + String.valueOf(id));
            
            //Finalizamos la conexión a la base de datos
            stat.close();
            conn.close();
            // Informe de Exito!
            JOptionPane.showMessageDialog(null, "Cliente actualizado con exito!");
        }
         // Informe de Error
        catch(Exception e) {JOptionPane.showMessageDialog(null,
                "Ha ocurrido un error! Verifique datos..."+e);}
    }
}