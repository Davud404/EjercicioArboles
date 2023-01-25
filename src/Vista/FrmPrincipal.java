/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ArbolController;
import Controlador.ListaEnlazada.ListaEnlazada;
import Controlador.PosicionController;
import Modelo.Arbol;
import Modelo.Posicion;
import Vista.ModeloTabla.ModeloTablaArbol;
import Vista.Utilidades.Utilidades;
import javax.swing.JOptionPane;

/**
 *
 * @author David Campoverde
 */
public class FrmPrincipal extends javax.swing.JFrame {
    private ArbolController ac = new ArbolController();
    private PosicionController pc = new PosicionController();
    private ModeloTablaArbol mta = new ModeloTablaArbol();
    private DialogPosicion diaPosicion;
    private FrmPosiciones frmPosicion;
    private DialogEditarArbol diaArbol;
    private DialogGrafo diaGrafo;

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        cargarDatos();
        setLocationRelativeTo(this);
//        cargarTabla();
    }

    public void cargarTabla() {
        if (ac.getArboles().getCabecera() != null) {
            mta.setArboles(ac);
            tblListaArboles.setModel(mta);
            tblListaArboles.updateUI();
        }
    }

    public void agregarPosicion() {
        diaPosicion = new DialogPosicion(this, true);
        diaPosicion.setVisible(true);
        Posicion p = diaPosicion.getPosicion();
        if (p.getLatitud() != null) {
            try {
                ac.getArboles().obtener(tblListaArboles.getSelectedRow()).getPosicion().insertar(p);
                ac.getArboles().obtener(tblListaArboles.getSelectedRow()).getPosicion().imprimir();
            } catch (Exception e) {
            }
        }

    }
    
    public void cargarDatos(){
        ac.setArboles(Utilidades.cargarArchivoJSON().getArboles());
        if (ac.getArboles().getSize() != 0) {
            cargarTabla();
        }
        
        pc.setPosiciones(Utilidades.cargarPosicones().getPosiciones());
    }

    public void limpiar() {
        txtDescripcionArbol.setText("");
        txtNombreArbol.setText("");
        txtNombreCientificoA.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreArbol = new javax.swing.JTextField();
        txtNombreCientificoA = new javax.swing.JTextField();
        txtDescripcionArbol = new javax.swing.JTextField();
        btnRegistrarArbol = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaArboles = new javax.swing.JTable();
        btnAgregarPosicion = new javax.swing.JButton();
        btnModificarArbol = new javax.swing.JButton();
        btnEliminarArbol = new javax.swing.JButton();
        btnVerGrafo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arboles");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar árbol"));

        jLabel1.setText("Nombre");

        jLabel2.setText("Nombre Cientifico");

        jLabel3.setText("Descripcion");

        btnRegistrarArbol.setText("Registrar");
        btnRegistrarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarArbolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombreCientificoA, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrarArbol)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(85, 85, 85)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescripcionArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreArbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreCientificoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcionArbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarArbol)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Arboles"));

        tblListaArboles.setModel(new javax.swing.table.DefaultTableModel(
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
        tblListaArboles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaArbolesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListaArboles);

        btnAgregarPosicion.setText("Ver Posiciones");
        btnAgregarPosicion.setEnabled(false);
        btnAgregarPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPosicionActionPerformed(evt);
            }
        });

        btnModificarArbol.setText("Modificar");
        btnModificarArbol.setEnabled(false);
        btnModificarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarArbolActionPerformed(evt);
            }
        });

        btnEliminarArbol.setText("Eliminar");
        btnEliminarArbol.setEnabled(false);
        btnEliminarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarArbolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnModificarArbol)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarPosicion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarArbol))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarPosicion)
                    .addComponent(btnModificarArbol)
                    .addComponent(btnEliminarArbol))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        btnVerGrafo.setText("Ver Adyacencia");
        btnVerGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerGrafoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnVerGrafo)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerGrafo)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarArbolActionPerformed
        Arbol a = new Arbol();
        if (txtDescripcionArbol.getText().isEmpty() || txtNombreArbol.getText().isEmpty() || txtNombreCientificoA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Rellene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            a.setNombre(txtNombreArbol.getText());
            a.setNombreCientifico(txtNombreCientificoA.getText());
            a.setDescripcion(txtDescripcionArbol.getText());
            a.setId(ac.getArboles().getSize() + 1);
            ac.getArboles().insertar(a);
            cargarTabla();
            limpiar();
            Utilidades.guardarArchivoJSON(ac);
        }
    }//GEN-LAST:event_btnRegistrarArbolActionPerformed

    private void tblListaArbolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaArbolesMouseClicked
        btnAgregarPosicion.setEnabled(true);
        btnModificarArbol.setEnabled(true);
        btnEliminarArbol.setEnabled(true);
    }//GEN-LAST:event_tblListaArbolesMouseClicked

    private void btnAgregarPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPosicionActionPerformed
        btnAgregarPosicion.setEnabled(true);
        try {
            frmPosicion = new FrmPosiciones(ac.getArboles().obtener(tblListaArboles.getSelectedRow()), ac, pc);
        } catch (Exception e) {
        }
        frmPosicion.setVisible(true);
    }//GEN-LAST:event_btnAgregarPosicionActionPerformed

    private void btnModificarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarArbolActionPerformed
        try {
            diaArbol = new DialogEditarArbol(this, true, ac.getArboles().obtener(tblListaArboles.getSelectedRow()));
        } catch (Exception e) {
        }
        diaArbol.setVisible(true);
        Utilidades.guardarArchivoJSON(ac);
        cargarTabla();
        
    }//GEN-LAST:event_btnModificarArbolActionPerformed

    private void btnEliminarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarArbolActionPerformed
        Integer i = JOptionPane.showConfirmDialog(this, "¿Esta seguro de que quiere eliminar el arbol?");
        if (i == JOptionPane.OK_OPTION) {

            try {
//                Arbol aux = ac.getArboles().obtener(tblListaArboles.getSelectedRow());
                ac.getArboles().eliminar(tblListaArboles.getSelectedRow());
//                for(int j = 0; j < aux.getPosicion().getSize(); j++){
//                    
//                }
//                
            } catch (Exception e) {
            }
            Utilidades.guardarPosiciones(pc);
            Utilidades.guardarArchivoJSON(ac);
            cargarTabla();

        }
    }//GEN-LAST:event_btnEliminarArbolActionPerformed

    private void btnVerGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerGrafoActionPerformed
        diaGrafo = new DialogGrafo(this, true, pc);
        diaGrafo.setVisible(true);
    }//GEN-LAST:event_btnVerGrafoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPosicion;
    private javax.swing.JButton btnEliminarArbol;
    private javax.swing.JButton btnModificarArbol;
    private javax.swing.JButton btnRegistrarArbol;
    private javax.swing.JButton btnVerGrafo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaArboles;
    private javax.swing.JTextField txtDescripcionArbol;
    private javax.swing.JTextField txtNombreArbol;
    private javax.swing.JTextField txtNombreCientificoA;
    // End of variables declaration//GEN-END:variables
}