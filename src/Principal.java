//Importamos Librerías necesarias
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JOptionPane;

/**
    * Software en su fase beta
    * diseñado para la gestión de una consultoría.
    * @author augusto
    * @version 0.1 Beta
    * @see https://github.com/augustojair/consultoria
 */

public class Principal extends javax.swing.JFrame {
    // Clase "Principal" (Ventana de la Aplicación)
    // Proveedor que servira para hacer diversas acciones en los eventos que requieran un actor.
    Proveedor proveedorejemplo = new Proveedor();
    // Cliente que servira para hacer diversas acciones en los eventos que requieran un actor.
    Cliente clienteejemplo = new Cliente();
    // Transacción que servira para hacer diversas acciones en los eventos que requieran un actor.
    Transaccion transaccionejemplo = new Transaccion();
    //Creamos el model de manejo de la Tabla de Clientes
    javax.swing.DefaultListModel mdClientes = clienteejemplo.cargarEnLista();
    //Creamos el model de manejo de la Tabla de Proveedores
    javax.swing.DefaultListModel mdProveedores = proveedorejemplo.cargarEnLista();
    //Creamos el model de manejo de la Tabla de Transacciones
    javax.swing.DefaultListModel mdTransacciones = transaccionejemplo.cargarEnLista();

    public Principal() { //Constructor de "Principal"
        initComponents();
        listaClientes.setModel(mdClientes);//Seteamos los models a sus respectivas tablas
        listaProveedores.setModel(mdProveedores);
        ListaTransacciones.setModel(mdTransacciones);
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPestañas = new javax.swing.JTabbedPane();
        jPPrincipal = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        txtapNotas = new javax.swing.JScrollPane();
        txtaNotas = new javax.swing.JTextArea();
        lblSusNotas = new javax.swing.JLabel();
        btnGuardarNotas = new javax.swing.JButton();
        txbapTransacciones = new javax.swing.JScrollPane();
        ListaTransacciones = new javax.swing.JList();
        lblTransacciones = new javax.swing.JLabel();
        btnAgregarTransacción = new javax.swing.JButton();
        txtbDescripciónTransacción = new javax.swing.JTextField();
        txtbMontoTransacción = new javax.swing.JTextField();
        lbl$ = new javax.swing.JLabel();
        txtbFecha = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        btnVerTransacción = new javax.swing.JButton();
        lblIdTransaccion = new javax.swing.JLabel();
        lblDescripcionTransaccion = new javax.swing.JLabel();
        jPClientes = new javax.swing.JPanel();
        panelListaClientes = new javax.swing.JScrollPane();
        listaClientes = new javax.swing.JList();
        btnVerCliente = new javax.swing.JButton();
        jPEditorClientes = new javax.swing.JPanel();
        lblIdC = new javax.swing.JLabel();
        lblNumeroIdC = new javax.swing.JLabel();
        lblNombreC = new javax.swing.JLabel();
        txtbNombreC = new javax.swing.JTextField();
        lblDireccionC = new javax.swing.JLabel();
        txtbDireccionC = new javax.swing.JTextField();
        lblEmailC = new javax.swing.JLabel();
        txtbEmailC = new javax.swing.JTextField();
        lblTipoC = new javax.swing.JLabel();
        txtbTipoC = new javax.swing.JTextField();
        lblTelefonoC = new javax.swing.JLabel();
        txtbTelefonoC = new javax.swing.JTextField();
        lblComentariosC = new javax.swing.JLabel();
        ctxtaComentarios = new javax.swing.JScrollPane();
        txtaComentariosC = new javax.swing.JTextArea();
        lblAuxiliarC = new javax.swing.JLabel();
        btnGuardarC = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        jPProveedores = new javax.swing.JPanel();
        panelListaProveedores = new javax.swing.JScrollPane();
        listaProveedores = new javax.swing.JList();
        btnVerProveedor = new javax.swing.JButton();
        jPEditorProveedores = new javax.swing.JPanel();
        lblIdP = new javax.swing.JLabel();
        lblNumeroIdP = new javax.swing.JLabel();
        lblNombreP = new javax.swing.JLabel();
        txtbNombreP = new javax.swing.JTextField();
        lblDireccionP = new javax.swing.JLabel();
        txtbDireccionP = new javax.swing.JTextField();
        lblEmailP = new javax.swing.JLabel();
        txtbEmailP = new javax.swing.JTextField();
        lblTipoP = new javax.swing.JLabel();
        txtbTipoP = new javax.swing.JTextField();
        lblTelefonoP = new javax.swing.JLabel();
        txtbTelefonoP = new javax.swing.JTextField();
        lblComentariosP = new javax.swing.JLabel();
        ctxtaComentarios1 = new javax.swing.JScrollPane();
        txtaComentariosP = new javax.swing.JTextArea();
        btnGuardarP = new javax.swing.JButton();
        lblAuxiliarP = new javax.swing.JLabel();
        btnNuevoProveedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultoría");

        lblBienvenido.setText("Bienvenido");

        txtaNotas.setColumns(20);
        txtaNotas.setRows(5);
        txtapNotas.setViewportView(txtaNotas);

        lblSusNotas.setText("Sus Notas");

        btnGuardarNotas.setText("Guardar");
        btnGuardarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNotasActionPerformed(evt);
            }
        });

        ListaTransacciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ListaTransaccionesFocusGained(evt);
            }
        });
        txbapTransacciones.setViewportView(ListaTransacciones);

        lblTransacciones.setText("Transacciones");

        btnAgregarTransacción.setText("Agregar");
        btnAgregarTransacción.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTransacciónActionPerformed(evt);
            }
        });

        txtbMontoTransacción.setText("Monto");
        txtbMontoTransacción.setToolTipText("");

        lbl$.setText("$");

        txtbFecha.setText("dd/mm/aa");

        lblFecha.setText("Fecha");

        btnVerTransacción.setText("Ver");
        btnVerTransacción.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTransacciónActionPerformed(evt);
            }
        });

        lblIdTransaccion.setText("0");

        lblDescripcionTransaccion.setText("Descripción");

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarNotas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBienvenido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSusNotas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtapNotas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTransacciones)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIdTransaccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txbapTransacciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnVerTransacción, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl$, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFecha)
                            .addComponent(lblDescripcionTransaccion))
                        .addGap(13, 13, 13)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbMontoTransacción, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(txtbFecha)
                            .addComponent(txtbDescripciónTransacción)
                            .addComponent(btnAgregarTransacción, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPPrincipalLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblTransacciones))
                            .addGroup(jPPrincipalLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(txtapNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerTransacción)
                            .addComponent(btnGuardarNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(lblBienvenido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSusNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txbapTransacciones, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPPrincipalLayout.createSequentialGroup()
                                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl$)
                                    .addComponent(txtbMontoTransacción, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFecha)
                                    .addComponent(txtbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtbDescripciónTransacción, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDescripcionTransaccion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregarTransacción)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIdTransaccion)
                .addContainerGap(304, Short.MAX_VALUE))
        );

        jPPestañas.addTab("Principal", jPPrincipal);

        listaClientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaClientesValueChanged(evt);
            }
        });
        listaClientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                listaClientesFocusGained(evt);
            }
        });
        panelListaClientes.setViewportView(listaClientes);

        btnVerCliente.setText("Ver");
        btnVerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerClienteActionPerformed(evt);
            }
        });

        lblIdC.setText("Id:");

        lblNumeroIdC.setText("0");

        lblNombreC.setText("Nombre del Cliente / Razón Social (*)");

        lblDireccionC.setText("Dirección (*)");

        lblEmailC.setText("E-Mail (*)");

        lblTipoC.setText("Tipo de Comercio / Ocupación (*)");

        lblTelefonoC.setText("Teléfono (*)");

        lblComentariosC.setText("Comentarios Adicionales");

        txtaComentariosC.setColumns(20);
        txtaComentariosC.setRows(5);
        txtaComentariosC.setText("No hay Comentarios.");
        ctxtaComentarios.setViewportView(txtaComentariosC);

        lblAuxiliarC.setText("Presione Guardar/Actualizar para confirmar. [Campo con  (*) = Obligatorio]");

        btnGuardarC.setText("Guardar");
        btnGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCActionPerformed(evt);
            }
        });

        btnNuevoCliente.setText("Presione para crear un Nuevo Cliente");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPEditorClientesLayout = new javax.swing.GroupLayout(jPEditorClientes);
        jPEditorClientes.setLayout(jPEditorClientesLayout);
        jPEditorClientesLayout.setHorizontalGroup(
            jPEditorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEditorClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPEditorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComentariosC, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailC, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoC)
                    .addGroup(jPEditorClientesLayout.createSequentialGroup()
                        .addGroup(jPEditorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPEditorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPEditorClientesLayout.createSequentialGroup()
                                    .addComponent(lblIdC)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblNumeroIdC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPEditorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombreC)
                                    .addComponent(lblDireccionC)))
                            .addComponent(lblTelefonoC))
                        .addGap(18, 18, 18)
                        .addGroup(jPEditorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbTelefonoC, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txtbDireccionC, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txtbNombreC, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txtbEmailC, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txtbTipoC, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(btnNuevoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPEditorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPEditorClientesLayout.createSequentialGroup()
                            .addComponent(lblAuxiliarC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardarC))
                        .addComponent(ctxtaComentarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1569, Short.MAX_VALUE))
        );
        jPEditorClientesLayout.setVerticalGroup(
            jPEditorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEditorClientesLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPEditorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIdC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPEditorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumeroIdC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevoCliente)))
                .addGap(5, 5, 5)
                .addGroup(jPEditorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreC)
                    .addComponent(txtbNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPEditorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionC)
                    .addComponent(txtbDireccionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPEditorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailC)
                    .addComponent(txtbEmailC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPEditorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoC)
                    .addComponent(txtbTipoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPEditorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoC))
                .addGap(18, 18, 18)
                .addComponent(lblComentariosC, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctxtaComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPEditorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuxiliarC)
                    .addComponent(btnGuardarC))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPClientesLayout = new javax.swing.GroupLayout(jPClientes);
        jPClientes.setLayout(jPClientesLayout);
        jPClientesLayout.setHorizontalGroup(
            jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnVerCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jPEditorClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPClientesLayout.setVerticalGroup(
            jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPClientesLayout.createSequentialGroup()
                        .addComponent(panelListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerCliente))
                    .addComponent(jPEditorClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(394, 394, 394))
        );

        jPPestañas.addTab("Clientes", jPClientes);

        listaProveedores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaProveedoresValueChanged(evt);
            }
        });
        listaProveedores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                listaProveedoresFocusGained(evt);
            }
        });
        panelListaProveedores.setViewportView(listaProveedores);

        btnVerProveedor.setText("Ver");
        btnVerProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProveedorActionPerformed(evt);
            }
        });

        lblIdP.setText("Id:");

        lblNumeroIdP.setText("0");

        lblNombreP.setText("Nombre del Proveedor / Razón Social (*)");

        lblDireccionP.setText("Dirección (*)");

        lblEmailP.setText("E-Mail (*)");

        lblTipoP.setText("Tipo de Comercio / Ocupación (*)");

        lblTelefonoP.setText("Teléfono (*)");

        lblComentariosP.setText("Comentarios Adicionales");

        txtaComentariosP.setColumns(20);
        txtaComentariosP.setRows(5);
        txtaComentariosP.setText("No hay Comentarios.");
        ctxtaComentarios1.setViewportView(txtaComentariosP);

        btnGuardarP.setText("Guardar");
        btnGuardarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPActionPerformed(evt);
            }
        });

        lblAuxiliarP.setText("Presione Guardar/Actualizar para confirmar. [Campo con  (*) = Obligatorio");

        btnNuevoProveedor.setText("Presione para crear un Nuevo Cliente");
        btnNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPEditorProveedoresLayout = new javax.swing.GroupLayout(jPEditorProveedores);
        jPEditorProveedores.setLayout(jPEditorProveedoresLayout);
        jPEditorProveedoresLayout.setHorizontalGroup(
            jPEditorProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEditorProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPEditorProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComentariosP, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPEditorProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPEditorProveedoresLayout.createSequentialGroup()
                            .addComponent(lblAuxiliarP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                            .addComponent(btnGuardarP))
                        .addComponent(ctxtaComentarios1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPEditorProveedoresLayout.createSequentialGroup()
                            .addGroup(jPEditorProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblDireccionP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEmailP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTipoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNombreP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTelefonoP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPEditorProveedoresLayout.createSequentialGroup()
                                    .addComponent(lblIdP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblNumeroIdP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPEditorProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtbNombreP, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                                .addComponent(txtbDireccionP, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                                .addComponent(txtbTipoP, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                                .addComponent(txtbTelefonoP, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                                .addComponent(txtbEmailP)
                                .addComponent(btnNuevoProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPEditorProveedoresLayout.setVerticalGroup(
            jPEditorProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEditorProveedoresLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPEditorProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdP)
                    .addComponent(lblNumeroIdP)
                    .addComponent(btnNuevoProveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPEditorProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreP)
                    .addComponent(txtbNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPEditorProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbDireccionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccionP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPEditorProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbEmailP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPEditorProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbTipoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPEditorProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbTelefonoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoP))
                .addGap(18, 18, 18)
                .addComponent(lblComentariosP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctxtaComentarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPEditorProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAuxiliarP)
                    .addComponent(btnGuardarP))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPProveedoresLayout = new javax.swing.GroupLayout(jPProveedores);
        jPProveedores.setLayout(jPProveedoresLayout);
        jPProveedoresLayout.setHorizontalGroup(
            jPProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(panelListaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPEditorProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(746, 746, 746))
        );
        jPProveedoresLayout.setVerticalGroup(
            jPProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPEditorProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPProveedoresLayout.createSequentialGroup()
                        .addComponent(panelListaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerProveedor)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPPestañas.addTab("Proveedores", jPProveedores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPPestañas, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPestañas, javax.swing.GroupLayout.PREFERRED_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        // Atributos del nuevo Cliente
        String nombre = txtbNombreC.getText();
        String direccion = txtbDireccionC.getText();
        String email = txtbEmailC.getText();
        String tipo = txtbTipoC.getText();
        String comentarios = txtaComentariosC.getText();
        String telefono = txtbTelefonoC.getText();
        // Se crea el nuevo cliente
        Cliente cliente = new Cliente(nombre, direccion, email, tipo, comentarios, telefono);
        // verificamos si es necesario actualizar, de lo contrario guardamos
        if(lblNumeroIdC.getText()== "0"){
            cliente.guardar();
            mdClientes.addElement(nombre);
        }
        else{
            // Si la actualizacion es positiva, la realizamos
            cliente.update(Integer.parseInt(lblNumeroIdC.getText()));
            int seleccionado = listaClientes.getSelectedIndex();
            mdClientes.set(seleccionado, nombre);
        }
    }//GEN-LAST:event_btnGuardarCActionPerformed

    private void btnGuardarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPActionPerformed
        // Atributos del nuevo Proveedor    
        String nombre = txtbNombreP.getText();
        String direccion = txtbDireccionP.getText();
        String email = txtbEmailP.getText();
        String tipo = txtbTipoP.getText();
        String comentarios = txtaComentariosP.getText();
        String telefono = txtbTelefonoP.getText();
        // se crea el nuevo Proveedor
        Proveedor proveedor = new Proveedor(nombre, direccion, email, tipo, comentarios, telefono);
        // verificamos si es necesario actualizar, de lo contrario guardamos
        if(lblNumeroIdP.getText()== "0"){
            proveedor.guardar();
            mdProveedores.addElement(nombre);
        }
        else{
            // Si la actualizacion es positiva, la realizamos
            proveedor.update(Integer.parseInt(lblNumeroIdP.getText()));
            int seleccionado = listaProveedores.getSelectedIndex();
            mdProveedores.set(seleccionado, nombre);
        }
    }//GEN-LAST:event_btnGuardarPActionPerformed

    private void btnGuardarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNotasActionPerformed
        //Este evento guardara las modificaciones que se realicen en el campo "Notas"
        try {
            File notass = new File("Notas.txt");
            BufferedWriter notas = new BufferedWriter(new FileWriter(notass));
            //Capura de datos y almacenaje
            notas.write(txtaNotas.getText());
            notas.close();
            //Confirmacion de alamacenaje
            JOptionPane.showMessageDialog(null,"Cambio realizado con éxito!");
        } 
        catch (Exception e) {
            //Notificación de error
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error!"+e);
        }
    }//GEN-LAST:event_btnGuardarNotasActionPerformed

    private void btnAgregarTransacciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTransacciónActionPerformed
        //Este evento crea una nueva transaccion
        try{
            // Captura de Variables
            String descripcion = txtbDescripciónTransacción.getText();  
            String fecha = txtbFecha.getText();
            String monto = txtbMontoTransacción.getText();
            // crea la nueva transaccion
            Transaccion transaccion = new Transaccion(descripcion, fecha, monto);
            transaccion.guardar(); // guarda en base de datos
            mdTransacciones.addElement(descripcion); // Agrega a la lista
        }
        catch(Exception e){JOptionPane.showMessageDialog(null, "Ha ocurrido un error"+e);}
    }//GEN-LAST:event_btnAgregarTransacciónActionPerformed

    private void btnVerProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProveedorActionPerformed
        try{
            btnGuardarP.setText("Actualizar");
            // Obtener el numero de Proveedor a Cargar.
            int id = Integer.parseInt(lblNumeroIdP.getText());
            // Creamos un proveedor al cual cargar
            Proveedor proveedorseleccionado = new Proveedor();
            // Cargamos los datos del proveedor
            proveedorseleccionado.cargar(id); 
             // Los transferimos a los textbox
            txtbNombreP.setText(proveedorseleccionado.getNombre());
            txtbDireccionP.setText(proveedorseleccionado.getDireccion());
            txtbEmailP.setText(proveedorseleccionado.getEmail());
            txtbTelefonoP.setText(proveedorseleccionado.getTelefono());
            txtbTipoP.setText(proveedorseleccionado.getTipo());
            txtaComentariosP.setText(proveedorseleccionado.getComentarios());
        }
        // Reporte de error
        catch(Exception e){JOptionPane.showMessageDialog(null, "Ha ocurrido un error"+e);}
    }//GEN-LAST:event_btnVerProveedorActionPerformed

    private void btnVerTransacciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTransacciónActionPerformed
        try{
            // Obtener el numero de Transaccion a Cargar.
            int id = Integer.parseInt(lblIdTransaccion.getText());
            // Creamos una transaccion a la cual cargar
            Transaccion transaccionseleccionada = new Transaccion();
            // Cargamos los datos de la transaccion
            transaccionseleccionada.cargar(id);
            // Los transferimos a los textbox
            txtbMontoTransacción.setText(transaccionseleccionada.getMonto());
            txtbFecha.setText(transaccionseleccionada.getFecha());
            txtbDescripciónTransacción.setText(transaccionseleccionada.getDescripcion());
        }
        // Reporte de error
        catch(Exception e){JOptionPane.showMessageDialog(null, "Ha ocurrido un error"+e);}
    }//GEN-LAST:event_btnVerTransacciónActionPerformed

    private void listaClientesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listaClientesFocusGained
        // Cuando un item es seleccionado, el indicador toma el valor de ese item
        lblNumeroIdC.setText(String.valueOf(listaClientes.getSelectedIndex()+1));
    }//GEN-LAST:event_listaClientesFocusGained

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        // Cuando se creara un nuevo cliente, el indicador, toma un valor nulo.
        lblNumeroIdC.setText("0");
        btnGuardarC.setText("Guardar");
        txtbNombreC.setText("");
        txtbDireccionC.setText("");
        txtbEmailC.setText("");
        txtbTipoC.setText("");
        txtaComentariosC.setText("");
        txtbTelefonoC.setText("");
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProveedorActionPerformed
        // Cuando se creara un nuevo proveedor, el indicador, toma un valor nulo.
        lblNumeroIdP.setText("0");
        btnGuardarP.setText("Guardar");
        txtbNombreP.setText("");
        txtbDireccionP.setText("");
        txtbEmailP.setText("");
        txtbTipoP.setText("");
        txtaComentariosP.setText("");
        txtbTelefonoP.setText("");
    }//GEN-LAST:event_btnNuevoProveedorActionPerformed

    private void listaProveedoresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listaProveedoresFocusGained
        // Cuando un item es seleccionado, el indicador toma el valor de ese item
        lblNumeroIdP.setText(String.valueOf(listaProveedores.getSelectedIndex()+1));
    }//GEN-LAST:event_listaProveedoresFocusGained

    private void btnVerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerClienteActionPerformed
        try{
            btnGuardarC.setText("Actualizar");
            // Obtener el numero de Cliente a Cargar.
            int id = Integer.parseInt(lblNumeroIdC.getText());
            // Creamos un cliente al cual cargar
            Cliente clienteseleccionado = new Cliente();
            // Cargamos los datos del cliente
            clienteseleccionado.cargar(id);
            // Los transferimos a los textbox
            txtbNombreC.setText(clienteseleccionado.getNombre());
            txtbDireccionC.setText(clienteseleccionado.getDireccion());
            txtbEmailC.setText(clienteseleccionado.getEmail());
            txtbTelefonoC.setText(clienteseleccionado.getTelefono());
            txtbTipoC.setText(clienteseleccionado.getTipo());
            txtaComentariosC.setText(clienteseleccionado.getComentarios());
        }
        // Reporte de error
        catch(Exception e){JOptionPane.showMessageDialog(null, "Ha ocurrido un error"+e);}
    }//GEN-LAST:event_btnVerClienteActionPerformed

    private void ListaTransaccionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ListaTransaccionesFocusGained
        lblIdTransaccion.setText(String.valueOf(ListaTransacciones.getSelectedIndex()+1));
    }//GEN-LAST:event_ListaTransaccionesFocusGained

    private void listaClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaClientesValueChanged
        lblNumeroIdC.setText(String.valueOf(listaClientes.getSelectedIndex()+1));
    }//GEN-LAST:event_listaClientesValueChanged

    private void listaProveedoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaProveedoresValueChanged
        lblNumeroIdP.setText(String.valueOf(listaProveedores.getSelectedIndex()+1));
    }//GEN-LAST:event_listaProveedoresValueChanged
    private void cargainicial(){ // Para cargar "Notas"
        try {
            // Abrimos el archivo
            FileInputStream archivoaleer = new FileInputStream("Notas.txt");
            // Leemos el archivo
            DataInputStream leer = new DataInputStream(archivoaleer);
            // Guardamos en memoria el texto
            BufferedReader almacenar = new BufferedReader(new InputStreamReader(leer));
            String strLinea; // variable linea de texto (de Notas)
            while ((strLinea = almacenar.readLine()) != null) {
                txtaNotas.setText(strLinea); // Seteamos el valor al campo
            }
            // Cerramos conexión con base de datos
            leer.close();
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException, IOException {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(java.security.Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(java.security.Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(java.security.Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(java.security.Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal principal = new Principal();
                principal.setVisible(true);
                principal.cargainicial(); // ejecuta la carga del campo "Notas"
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListaTransacciones;
    private javax.swing.JButton btnAgregarTransacción;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnGuardarNotas;
    private javax.swing.JButton btnGuardarP;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnNuevoProveedor;
    private javax.swing.JButton btnVerCliente;
    private javax.swing.JButton btnVerProveedor;
    private javax.swing.JButton btnVerTransacción;
    private javax.swing.JScrollPane ctxtaComentarios;
    private javax.swing.JScrollPane ctxtaComentarios1;
    private javax.swing.JPanel jPClientes;
    private javax.swing.JPanel jPEditorClientes;
    private javax.swing.JPanel jPEditorProveedores;
    private javax.swing.JTabbedPane jPPestañas;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JPanel jPProveedores;
    private javax.swing.JLabel lbl$;
    private javax.swing.JLabel lblAuxiliarC;
    private javax.swing.JLabel lblAuxiliarP;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblComentariosC;
    private javax.swing.JLabel lblComentariosP;
    private javax.swing.JLabel lblDescripcionTransaccion;
    private javax.swing.JLabel lblDireccionC;
    private javax.swing.JLabel lblDireccionP;
    private javax.swing.JLabel lblEmailC;
    private javax.swing.JLabel lblEmailP;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIdC;
    private javax.swing.JLabel lblIdP;
    private javax.swing.JLabel lblIdTransaccion;
    private javax.swing.JLabel lblNombreC;
    private javax.swing.JLabel lblNombreP;
    private javax.swing.JLabel lblNumeroIdC;
    private javax.swing.JLabel lblNumeroIdP;
    private javax.swing.JLabel lblSusNotas;
    private javax.swing.JLabel lblTelefonoC;
    private javax.swing.JLabel lblTelefonoP;
    private javax.swing.JLabel lblTipoC;
    private javax.swing.JLabel lblTipoP;
    private javax.swing.JLabel lblTransacciones;
    private javax.swing.JList listaClientes;
    private javax.swing.JList listaProveedores;
    private javax.swing.JScrollPane panelListaClientes;
    private javax.swing.JScrollPane panelListaProveedores;
    private javax.swing.JScrollPane txbapTransacciones;
    private javax.swing.JTextArea txtaComentariosC;
    private javax.swing.JTextArea txtaComentariosP;
    private javax.swing.JTextArea txtaNotas;
    private javax.swing.JScrollPane txtapNotas;
    private javax.swing.JTextField txtbDescripciónTransacción;
    private javax.swing.JTextField txtbDireccionC;
    private javax.swing.JTextField txtbDireccionP;
    private javax.swing.JTextField txtbEmailC;
    private javax.swing.JTextField txtbEmailP;
    private javax.swing.JTextField txtbFecha;
    private javax.swing.JTextField txtbMontoTransacción;
    private javax.swing.JTextField txtbNombreC;
    private javax.swing.JTextField txtbNombreP;
    private javax.swing.JTextField txtbTelefonoC;
    private javax.swing.JTextField txtbTelefonoP;
    private javax.swing.JTextField txtbTipoC;
    private javax.swing.JTextField txtbTipoP;
    // End of variables declaration//GEN-END:variables
}