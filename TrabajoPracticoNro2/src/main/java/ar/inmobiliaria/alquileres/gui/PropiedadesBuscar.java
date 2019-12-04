package ar.inmobiliaria.alquileres.gui;
import ar.inmobiliaria.alquileres.connectors.Connector;
import ar.inmobiliaria.alquileres.entities.Propiedad;
import ar.inmobiliaria.alquileres.enums.TipoInmueble;
import ar.inmobiliaria.alquileres.enums.Ubicacion;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_ClienteRepository;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_PropiedadRepository;
import ar.inmobiliaria.alquileres.repositories.jdbc.ClienteRepository;
import ar.inmobiliaria.alquileres.repositories.jdbc.PropiedadRepository;
import ar.inmobiliaria.alquileres.utils.swing.Table;
import ar.inmobiliaria.alquileres.utils.swing.Validator;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class PropiedadesBuscar extends javax.swing.JInternalFrame {
    I_PropiedadRepository pr;
    I_ClienteRepository cr;
    public PropiedadesBuscar() {
        super(
                "Formulario para Buscar Propiedad",
                false, 
                true, 
                false, 
                true);
        initComponents();
        pr = new PropiedadRepository(Connector.getConnection());
        cr = new ClienteRepository(Connector.getConnection());
        btnGroup.add(radioMax);
        btnGroup.add(radioMin);
        new Validator(txtCodigo).limit(8);
        cargar();
    }
    
    public void cargar() {
        // cmbUbicacion
        cmbUbicacion.removeAllItems();
        for(Ubicacion u:Ubicacion.values()) cmbUbicacion.addItem(u);
        
        // cmbTipoInmueble
        cmbTipoInmueble.removeAllItems();
        for(TipoInmueble t:TipoInmueble.values())  cmbTipoInmueble.addItem(t);
        
        //cargar tblCursos
        new Table<Propiedad>().cargar(tblPropiedades, pr.getList());
        
        // actualizar la cantidad de Propiedades
        lblCantidad.setText(String.valueOf(pr.getCount()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbUbicacion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbTipoInmueble = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        radioMax = new javax.swing.JRadioButton();
        radioMin = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPropiedades = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Criterios de Búsqueda");

        jLabel2.setText("Código:");

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });

        jLabel3.setText("Ubicación:");

        cmbUbicacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUbicacionItemStateChanged(evt);
            }
        });

        jLabel4.setText("Tipo de Inmueble:");

        cmbTipoInmueble.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoInmuebleItemStateChanged(evt);
            }
        });

        jLabel5.setText("Precio Alquiler:");

        radioMax.setText("Máximo");
        radioMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaxActionPerformed(evt);
            }
        });

        radioMin.setText("Mínimo");
        radioMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMinActionPerformed(evt);
            }
        });

        jLabel6.setText("Cantidad de Propiedades:");

        tblPropiedades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPropiedades);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnAlta.setText("Dar de Alta una Propiedad");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioMax)
                                        .addGap(33, 33, 33)
                                        .addComponent(radioMin)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbTipoInmueble, 0, 175, Short.MAX_VALUE)
                                    .addComponent(lblCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(btnAlta)
                        .addGap(29, 29, 29))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnActualizar, btnAlta, btnEliminar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTipoInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(radioMax)
                        .addComponent(radioMin)
                        .addComponent(jLabel6)))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnActualizar, btnAlta, btnEliminar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        // Evento Buscar por Código
        String buscarCodigo=txtCodigo.getText();
        if(buscarCodigo==null) buscarCodigo="";
        new Table<Propiedad>().cargar(tblPropiedades, pr.getLikeCodigo(buscarCodigo));
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void cmbUbicacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbUbicacionItemStateChanged
        // Evento Buscar por Ubicación
        new Table<Propiedad>().cargar(tblPropiedades, pr.getByUbicacion(cmbUbicacion.getItemAt(cmbUbicacion.getSelectedIndex())));
    }//GEN-LAST:event_cmbUbicacionItemStateChanged

    private void cmbTipoInmuebleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoInmuebleItemStateChanged
        // Evento Buscar por Tipo de Inmueble
        new Table<Propiedad>().cargar(tblPropiedades, pr.getBytipoInmueble(cmbTipoInmueble.getItemAt(cmbTipoInmueble.getSelectedIndex())));
    }//GEN-LAST:event_cmbTipoInmuebleItemStateChanged

    private void radioMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMinActionPerformed
        // Evento buscar por Precio Mínimo
        new Table<Propiedad>().cargar(tblPropiedades,
                pr
                .getList()
                .stream()
                .filter(v -> v.getPrecioAlquiler()== pr.max().getPrecioAlquiler())
                .collect(Collectors.toList()));
    }//GEN-LAST:event_radioMinActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Evento Eliminar
        int index=tblPropiedades.getSelectedRow();
        if(index==-1) return;
        Propiedad propiedad=pr.getByCodigo(
                tblPropiedades.getValueAt(index, 0).toString());
        if(!(cr.getByPropiedad(propiedad).getCodigoPropiedad() == null)){
            JOptionPane.showMessageDialog(this, 
                    "¡No se puede borrar la propiedad porque tiene un Cliente!");
            return;
        }
        if(JOptionPane.showConfirmDialog(this, 
            "¿Desea borrar la propiedad "+propiedad.getCodigoPropiedad()+", con Ubicación en "+propiedad.getUbicacion()+", Tipo de Inmueble: "
                    +propiedad.getTipoInmueble()+" y Precio de Alquiler: "+propiedad.getPrecioAlquiler()+" "
                    +"?")!=0) 
            return;
        pr.remove(propiedad);
        cargar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void radioMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaxActionPerformed
        // Evento Buscar por precio Máximo
        new Table<Propiedad>().cargar(tblPropiedades, 
                pr
                .getList()
                .stream()
                .filter(v -> v.getPrecioAlquiler()== pr.min().getPrecioAlquiler())
                .collect(Collectors.toList()));
    }//GEN-LAST:event_radioMaxActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // Evento Actualizar
        txtCodigo.setText("");
        txtCodigo.requestFocus();
        cargar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        // Evento Ir al Formulario PropiedadAlta
        if (Inmobiliaria.propiedadesAlta == null || Inmobiliaria.propiedadesAlta.isClosed()) {
            Inmobiliaria.propiedadesAlta= new PropiedadesAlta();
            Inmobiliaria.addJInternalFrame(Inmobiliaria.propiedadesAlta);
        }
        Inmobiliaria.propiedadesAlta.toFront();
        Inmobiliaria.propiedadesAlta.show();
    }//GEN-LAST:event_btnAltaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JComboBox<TipoInmueble> cmbTipoInmueble;
    private javax.swing.JComboBox<Ubicacion> cmbUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JRadioButton radioMax;
    private javax.swing.JRadioButton radioMin;
    private javax.swing.JTable tblPropiedades;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
