/*
 * Copyright 2004-2013 H2 Group. Multiple-Licensed under the H2 License,
 * Version 1.0, and under the Eclipse Public License, Version 1.0
 * (http://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package h2example;

import java.sql.*;


/**
 * A very simple class that shows how to load the driver, create a database,
 * create a table, and insert some data.
 */
public class H2Example {

    /**
     * Called when ran from command line.
     *
     * @param args ignored
     */
    public static void main(String... args) throws Exception {                

        
        //Cargamos la clase del Conector
        Class.forName("org.h2.Driver");
        //Realizamos la conexión a la base de datos con nombre "nombreDatabase
        Connection conn = DriverManager.getConnection("jdbc:h2:nombreDatabase");
        
        //Generamos de la clase que pregunta
        Statement stat = conn.createStatement();        
        //Borramos la tabla "Test" si ya existe        
        stat.execute("drop table test");
        // Creamos la tabla
        stat.execute("create table if not exists test(id bigint auto_increment primary key, name varchar(255))");
        //Insertamos dos datos en la tabla
        stat.execute("insert into test(name) values('Hello')");
        stat.execute("insert into test(name) values('world')");
        //Generamos de la clase que nos da la respuesta
        ResultSet rs;
        //Pedimos una respuesta
        rs = stat.executeQuery("select * from test where id > 0 order by id desc");
        //Buscamos todas las respuestas que nos dieron
        while (rs.next()) {
            System.out.println(rs.getString("id") + "->"+ rs.getString("name"));
        }
        
        //Finalizamos la conexión a la base de datos
        stat.close();
        conn.close();
    }

}

