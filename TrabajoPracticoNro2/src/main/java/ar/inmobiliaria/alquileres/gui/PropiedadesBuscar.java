package ar.inmobiliaria.alquileres.gui;
import ar.inmobiliaria.alquileres.connectors.Connector;
import ar.inmobiliaria.alquileres.entities.Propiedad;
import ar.inmobiliaria.alquileres.enums.TipoInmueble;
import ar.inmobiliaria.alquileres.enums.Ubicacion;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_PropiedadRepository;
import ar.inmobiliaria.alquileres.repositories.jdbc.PropiedadRepository;
import ar.inmobiliaria.alquileres.utils.swing.Table;

public class PropiedadesBuscar extends javax.swing.JInternalFrame {
    I_PropiedadRepository pr;
    
    public PropiedadesBuscar() {
        super(
                "Formulario para Buscar Propiedad",
                false, 
                true, 
                false, 
                false);
        initComponents();
        pr = new PropiedadRepository(Connector.getConnection());
        btnGroup.add(radioMax);
        btnGroup.add(radioMin);
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

        cmbUbicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbUbicacionKeyReleased(evt);
            }
        });

        jLabel4.setText("Tipo de Inmueble:");

        cmbTipoInmueble.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbTipoInmuebleKeyReleased(evt);
            }
        });

        jLabel5.setText("Precio Alquiler:");

        radioMax.setText("Máximo");
        radioMax.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioMaxStateChanged(evt);
            }
        });

        radioMin.setText("Mínimo");
        radioMin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioMinStateChanged(evt);
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
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioMax)
                                        .addGap(33, 33, 33)
                                        .addComponent(radioMin)
                                        .addGap(122, 122, 122)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbTipoInmueble, 0, 122, Short.MAX_VALUE)
                                    .addComponent(lblCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(25, 25, 25))))
        );
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radioMax)
                    .addComponent(radioMin)
                    .addComponent(jLabel6)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        // Evento Buscar por Código
        String buscarCodigo=txtCodigo.getText();
        if(buscarCodigo==null) buscarCodigo="";
        new Table<Propiedad>().cargar(tblPropiedades, pr.getByCodigo(buscarCodigo));
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void cmbUbicacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbUbicacionKeyReleased
        // Evento Buscar por Ubicación
        new Table<Propiedad>().cargar(tblPropiedades, pr.getByUbicacion(cmbUbicacion.getItemAt(cmbUbicacion.getSelectedIndex())));
    }//GEN-LAST:event_cmbUbicacionKeyReleased

    private void cmbTipoInmuebleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbTipoInmuebleKeyReleased
        // Evento Buscar por Tipo de Inmueble
        new Table<Propiedad>().cargar(tblPropiedades, pr.getBytipoInmueble(cmbTipoInmueble.getItemAt(cmbTipoInmueble.getSelectedIndex())));
    }//GEN-LAST:event_cmbTipoInmuebleKeyReleased

    private void radioMaxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioMaxStateChanged
        // Evento Buscar por Precio Máximo
        new Table<Propiedad>().cargar(tblPropiedades, pr.max());
    }//GEN-LAST:event_radioMaxStateChanged

    private void radioMinStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioMinStateChanged
        // Evento buscar por Precio Mínimo
        new Table<Propiedad>().cargar(tblPropiedades, pr.min());
    }//GEN-LAST:event_radioMinStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
