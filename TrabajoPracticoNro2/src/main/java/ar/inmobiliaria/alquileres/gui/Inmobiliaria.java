package ar.inmobiliaria.alquileres.gui;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Inmobiliaria extends javax.swing.JFrame {
    
    public Inmobiliaria() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        mniClientes = new javax.swing.JMenuItem();
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

        mniClientes.setText("Clientes");
        mniClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClientesActionPerformed(evt);
            }
        });
        mnuVentanas.add(mniClientes);

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
        PropiedadesAlta propiedades = new PropiedadesAlta();
        desktop.add(propiedades);
        Dimension desktopSize = desktop.getSize();
        Dimension FrameSize = propiedades.getSize();
        propiedades.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        propiedades.setVisible(true);
    }//GEN-LAST:event_mniPropiedadesActionPerformed

    private void mniClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClientesActionPerformed
        // Clientes
        Clientes clientes = new Clientes();
        desktop.add(clientes);
        clientes.setVisible(true);
    }//GEN-LAST:event_mniClientesActionPerformed

    private void mniContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniContratosActionPerformed
        // Contratos
        Contratos contratos = new Contratos();
        desktop.add(contratos);
        contratos.setVisible(true);
    }//GEN-LAST:event_mniContratosActionPerformed

    private void mniFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFacturasActionPerformed
        // Facturas
        Facturas facturas = new Facturas();
        desktop.add(facturas);
        facturas.setVisible(true);
    }//GEN-LAST:event_mniFacturasActionPerformed

    private void mniHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHistoriaActionPerformed
        // Historia
        HistoriaInmobiliaria historia = new HistoriaInmobiliaria();
        desktop.add(historia);
        historia.setVisible(true);
    }//GEN-LAST:event_mniHistoriaActionPerformed

    private void mniBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBuscarActionPerformed
        // PropiedadesBuscar
        PropiedadesBuscar propiedades = new PropiedadesBuscar();
        desktop.add(propiedades);
        Dimension desktopSize = desktop.getSize();
        Dimension FrameSize = propiedades.getSize();
        propiedades.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        propiedades.setVisible(true);
    }//GEN-LAST:event_mniBuscarActionPerformed

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
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniAcerca;
    private javax.swing.JMenuItem mniBuscar;
    private javax.swing.JMenuItem mniClientes;
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
