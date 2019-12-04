package ar.inmobiliaria.alquileres.gui;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class Inmobiliaria extends javax.swing.JFrame {
    static PropiedadesBuscar propiedadesBuscar=null;
    static PropiedadesAlta propiedadesAlta=null;
    static ClientesAlta clientesAlta=null;
    static ClientesBuscar clientesBuscar=null;
    Facturas facturas=null;
    Contratos contratos=null;
    Historia historia=null;
    
    public Inmobiliaria() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public static void addJInternalFrame(JInternalFrame internalFrame) {
        desktop.add(internalFrame);
        Dimension desktopSize = desktop.getSize();
        Dimension FrameSize = internalFrame.getSize();
        internalFrame.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        internalFrame.toFront();
        internalFrame.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuVentanas = new javax.swing.JMenu();
        mnuPropiedades = new javax.swing.JMenu();
        mniPropiedades = new javax.swing.JMenuItem();
        mniBuscar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mniClientesAlta = new javax.swing.JMenuItem();
        mniBuscarCliente = new javax.swing.JMenuItem();
        mniContratos = new javax.swing.JMenuItem();
        mniFacturas = new javax.swing.JMenuItem();
        mniHistoria = new javax.swing.JMenuItem();
        mnuOpciones = new javax.swing.JMenu();
        mniAcerca = new javax.swing.JMenuItem();
        mniSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuVentanas.setText("Ventanas");

        mnuPropiedades.setText("Propiedades");

        mniPropiedades.setText("Dar de Alta");
        mniPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPropiedadesActionPerformed(evt);
            }
        });
        mnuPropiedades.add(mniPropiedades);

        mniBuscar.setText("Buscar Propiedad");
        mniBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBuscarActionPerformed(evt);
            }
        });
        mnuPropiedades.add(mniBuscar);

        mnuVentanas.add(mnuPropiedades);

        jMenu1.setText("Clientes");

        mniClientesAlta.setText("Dar de Alta");
        mniClientesAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClientesAltaActionPerformed(evt);
            }
        });
        jMenu1.add(mniClientesAlta);

        mniBuscarCliente.setText("Buscar Cliente");
        mniBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBuscarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mniBuscarCliente);

        mnuVentanas.add(jMenu1);

        mniContratos.setText("Contratos");
        mniContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniContratosActionPerformed(evt);
            }
        });
        mnuVentanas.add(mniContratos);

        mniFacturas.setText("Facturas");
        mniFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniFacturasActionPerformed(evt);
            }
        });
        mnuVentanas.add(mniFacturas);

        mniHistoria.setText("Historia Inmobiliaria");
        mniHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHistoriaActionPerformed(evt);
            }
        });
        mnuVentanas.add(mniHistoria);

        jMenuBar1.add(mnuVentanas);

        mnuOpciones.setText("Opciones");

        mniAcerca.setText("Acerca");
        mniAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAcercaActionPerformed(evt);
            }
        });
        mnuOpciones.add(mniAcerca);

        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        mnuOpciones.add(mniSalir);

        jMenuBar1.add(mnuOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void mniAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAcercaActionPerformed
        // Evento ACERCA
        JOptionPane.showMessageDialog(this, "Sistema de Alquileres Inmobiliaria 2019");
    }//GEN-LAST:event_mniAcercaActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        // Evento SALIR
        System.exit(0);
    }//GEN-LAST:event_mniSalirActionPerformed

    private void mniPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPropiedadesActionPerformed
        // PropiedadesAlta
        if (propiedadesAlta == null || propiedadesAlta.isClosed()) {
            propiedadesAlta = new PropiedadesAlta();
            addJInternalFrame(propiedadesAlta);
        }
        propiedadesAlta.toFront();
        propiedadesAlta.setVisible(true);
    }//GEN-LAST:event_mniPropiedadesActionPerformed

    private void mniClientesAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClientesAltaActionPerformed
        // ClienteAlta
        if (clientesAlta == null || clientesAlta.isClosed()) {
            clientesAlta = new ClientesAlta();
            addJInternalFrame(clientesAlta);
        }
        clientesAlta.toFront();
        clientesAlta.setVisible(true);
    }//GEN-LAST:event_mniClientesAltaActionPerformed

    private void mniContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniContratosActionPerformed
        // Contratos
        if (contratos == null || contratos.isClosed()) {
            contratos = new Contratos();
            addJInternalFrame(contratos);
        }
        contratos.toFront();
        contratos.setVisible(true);
    }//GEN-LAST:event_mniContratosActionPerformed

    private void mniFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFacturasActionPerformed
        // Facturas
        if (facturas == null || facturas.isClosed()) {
            facturas = new Facturas();
            addJInternalFrame(facturas);
        }
        facturas.toFront();
        facturas.setVisible(true);
    }//GEN-LAST:event_mniFacturasActionPerformed

    private void mniHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHistoriaActionPerformed
        // Historia
        if (historia == null || historia.isClosed()) {
            historia = new Historia();
            addJInternalFrame(historia);
        }
        historia.toFront();
        historia.setVisible(true);
    }//GEN-LAST:event_mniHistoriaActionPerformed

    private void mniBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBuscarActionPerformed
        // PropiedadesBuscar
        if (propiedadesBuscar == null || propiedadesBuscar.isClosed()) {
            propiedadesBuscar = new PropiedadesBuscar();
            addJInternalFrame(propiedadesBuscar);
        }
        propiedadesBuscar.toFront();
        propiedadesBuscar.setVisible(true);
    }//GEN-LAST:event_mniBuscarActionPerformed

    private void mniBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBuscarClienteActionPerformed
        // ClientesBuscar
        if (clientesBuscar == null || clientesBuscar.isClosed()) {
            clientesBuscar = new ClientesBuscar();
            addJInternalFrame(clientesBuscar);
        }
        clientesBuscar.toFront();
        clientesBuscar.setVisible(true);
    }//GEN-LAST:event_mniBuscarClienteActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inmobiliaria().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniAcerca;
    private javax.swing.JMenuItem mniBuscar;
    private javax.swing.JMenuItem mniBuscarCliente;
    private javax.swing.JMenuItem mniClientesAlta;
    private javax.swing.JMenuItem mniContratos;
    private javax.swing.JMenuItem mniFacturas;
    private javax.swing.JMenuItem mniHistoria;
    private javax.swing.JMenuItem mniPropiedades;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenu mnuOpciones;
    private javax.swing.JMenu mnuPropiedades;
    private javax.swing.JMenu mnuVentanas;
    // End of variables declaration//GEN-END:variables
}
