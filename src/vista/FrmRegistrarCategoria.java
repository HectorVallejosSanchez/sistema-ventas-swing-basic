/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.model.beans.Categoria;
import com.model.logic.CategoriaLogic;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class FrmRegistrarCategoria extends javax.swing.JDialog {

    private String codigo;
    private String nombre;
    private int num = 1;
    
    private File fichero; // Ruta del fichero a modificar
    private JFrame ventanaPadre; // Ventana anterior de trabajo
    private LinkedList categoriasGuardar = new LinkedList();// Contraseñas a guardar en el archivo
    
    /**
     * Creates new form FrmRegistrarCategoria
     */
    public FrmRegistrarCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //cargar();
        cargarTabla();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategoria = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("datos"));

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(txtnombre))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("lista de categorias"));

        tblCategoria.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategoria);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("mantenimiento"));

        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/insertar.gif"))); // NOI18N
        btnInsertar.setText("insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N
        btnModificar.setText("modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.gif"))); // NOI18N
        btnEliminar.setText("eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir.png"))); // NOI18N
        btnSalir.setText("salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInsertar)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir)
                    .addComponent(btnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        codigo = txtcodigo.getText();
        nombre = txtnombre.getText();
        Categoria oCategoria = new Categoria();

        oCategoria.setIdCategoria(codigo);
        oCategoria.setNombre(nombre);
        if(codigo.equals("") || nombre.equals("")){
            JOptionPane.showMessageDialog(this, "ERROR: Faltan datos", "Mensaje de Error", JOptionPane.WARNING_MESSAGE);
          
        }else{
            if (CategoriaLogic.insertarCategoria(oCategoria)) {
                System.out.println("se inserto correptamente");
                JOptionPane.showMessageDialog(this, "se inserto correptamente", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, null);
                num++;
                txtcodigo.setText("C00" + num);
                txtnombre.setText("");
            } else {
                System.out.println("no pudo insertarse");
                JOptionPane.showMessageDialog(this, "no pudo insertarse", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, null);
    //            txtcodigo.setText("C00" + num);
    //            txtnombre.setText("");
            }
        }
        String nuevaCategoria; // String con nombre, usuario y contraseña que queremos guardar
        nuevaCategoria = codigo + " " + nombre + " \n";
        categoriasGuardar.add(nuevaCategoria);
        
        modeloTabla = CategoriaLogic.obtenerModeloTabla();
        tblCategoria.setModel(modeloTabla);

    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        codigo = txtcodigo.getText();
        nombre = txtnombre.getText();
        Categoria oCategoria = new Categoria();

        oCategoria.setIdCategoria(codigo);
        oCategoria.setNombre(nombre);

        if(codigo.equals("") || nombre.equals("")){
            JOptionPane.showMessageDialog(this, "ERROR: Faltan datos", "Mensaje de Error", JOptionPane.WARNING_MESSAGE);
          
        }else{
            if (CategoriaLogic.modificarCategoria(oCategoria)) {
                System.out.println("se modifico correptamente");
                JOptionPane.showMessageDialog(this, "se modifico correptamente", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, null);
                
                txtcodigo.setText("C00" + num);
                txtnombre.setText("");

            } else {
                System.out.println("no pudo modificarse");
                JOptionPane.showMessageDialog(this, "no pudo modificarse", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, null);
    //            txtcodigo.setText("C00" + num);
    //            txtnombre.setText("");
            }
        }
        int indice;
        indice = this.tblCategoria.getSelectedRow();
        String nuevaCategoria; // String con nombre, usuario y contraseña que queremos guardar
        nuevaCategoria = codigo + " " + nombre + " \n";
        categoriasGuardar.set(indice,nuevaCategoria);
        modeloTabla = CategoriaLogic.obtenerModeloTabla();
        tblCategoria.setModel(modeloTabla);

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        codigo = txtcodigo.getText();
        nombre = txtnombre.getText();

        Categoria oCategoria = new Categoria();

        oCategoria.setIdCategoria(codigo);
        oCategoria.setNombre(nombre);

        if (CategoriaLogic.eliminarCategoria(oCategoria)) {
            System.out.println("se eliminó correptamente");
            JOptionPane.showMessageDialog(this, "se eliminó correptamente", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, null);
            txtcodigo.setText("C00" + num);
            txtnombre.setText("");
        } else {
            System.out.println("no pudo eliminarse");
            JOptionPane.showMessageDialog(this, "no pudo eliminarse", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, null);
//            txtcodigo.setText("C00" + num);
//            txtnombre.setText("");
        }
        String nuevaCategoria; // String con nombre, usuario y contraseña que queremos guardar
        nuevaCategoria = codigo + " " + nombre + " \n";
        categoriasGuardar.remove(nuevaCategoria);
        
        modeloTabla = CategoriaLogic.obtenerModeloTabla();
        tblCategoria.setModel(modeloTabla);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriaMouseClicked
        // TODO add your handling code here:
        int indice;
        indice = this.tblCategoria.getSelectedRow();
        txtcodigo.setText((String) tblCategoria.getValueAt(indice, 0));
        txtnombre.setText((String) tblCategoria.getValueAt(indice, 1));
    }//GEN-LAST:event_tblCategoriaMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        BufferedWriter writer; //Para escribir en el fichero

        if (fichero == null) {
            //Activamos el filtro para que nos muestre, por defecto, los archivos de texto
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
            JFileChooser fileChooserGuardar = new JFileChooser();
            fileChooserGuardar.setFileFilter(filtro);
            fileChooserGuardar.setDialogTitle("Guardar");
            int seleccion = fileChooserGuardar.showSaveDialog(this);

            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = fileChooserGuardar.getSelectedFile();
                fileChooserGuardar.setFileSelectionMode(JFileChooser.FILES_ONLY);
                try {
                    writer = new BufferedWriter(new FileWriter(fichero + ".txt")); // Ponemos .txt para darle extension al archivo que creamos
                    while (!categoriasGuardar.isEmpty()) {
                        writer.write(categoriasGuardar.poll().toString());
                        writer.newLine();
                    }
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error guardar archivo", JOptionPane.ERROR_MESSAGE);
                }

                JOptionPane.showMessageDialog(this, "El fichero de texto se ha guardado correctamente con los datos introducidos");
            }
        } else if (!(fichero == null)) // Añadimos al fichero existente
        {
            try {
                writer = new BufferedWriter(new FileWriter(fichero, true));
                while (!categoriasGuardar.isEmpty()) {
                    writer.write(categoriasGuardar.poll().toString());
                    writer.newLine();
                }
                writer.flush();
                writer.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error guardar archivo", JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(this, "El fichero de texto se ha guardado correctamente con los datos introducidos");
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: Error al guardar", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }

        // Volvemos al menu principal
        this.setVisible(false);
        ventanaPadre.setVisible(true);
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void cargarTabla() {
        modeloTabla = CategoriaLogic.obtenerModeloTabla();
        tblCategoria.setModel(modeloTabla);
        num++;
    }

    public void cargar() {
        Categoria oCategoria1 = new Categoria();
        oCategoria1.setIdCategoria("C001");
        oCategoria1.setNombre("ELECTRO");

        Categoria oCategoria2 = new Categoria();
        oCategoria2.setIdCategoria("C002");
        oCategoria2.setNombre("ABARROTES");

        Categoria oCategoria3 = new Categoria();
        oCategoria3.setIdCategoria("C003");
        oCategoria3.setNombre("LIMPIEZA");

        if (CategoriaLogic.insertarCategoria(oCategoria1)) {
            System.out.println("Se inserto correctamente");
            num++;
            txtcodigo.setText("C00" + num);
        }

        if (CategoriaLogic.insertarCategoria(oCategoria2)) {
            System.out.println("Se inserto correctamente");
            num++;
            txtcodigo.setText("C00" + num);
        }

        if (CategoriaLogic.insertarCategoria(oCategoria3)) {
            System.out.println("Se inserto correctamente");
            num++;
            txtcodigo.setText("C00" + num);
        }

        modeloTabla = CategoriaLogic.obtenerModeloTabla();
        tblCategoria.setModel(modeloTabla);
    }

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
            java.util.logging.Logger.getLogger(FrmRegistrarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmRegistrarCategoria dialog = new FrmRegistrarCategoria(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCategoria;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modeloTabla;
}
