/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appArriendos;

/**
 *
 * @author Phobos
 */

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class frmArticuloBusca extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmArticuloBusca
     */
    public frmArticuloBusca() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtcodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/png32/tool-1.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setName("jTable1"); // NOI18N
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtcodigo.setName("txtcodigo"); // NOI18N

        jLabel1.setText("CODIGO / DESCRIPCION");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/png32/tool-1.png"))); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/png32/tool.png"))); // NOI18N
        jButton4.setText("LIMPIAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtcodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        //int row = jTable1.rowAtPoint( evt.getPoint());
        int fila = this.jTable1.getSelectedRow();

        // luego, obtengo la columna seleccionada

        int columna = this.jTable1.getSelectedColumn();

        // por ultimo, obtengo el valor de la celda

        String dato = String.valueOf(this.jTable1.getValueAt(fila, 0));

        ObtenerRegistro(dato);
    }//GEN-LAST:event_jTable1MouseClicked

    private void ObtenerRegistro(String codigo){
        
        try
        {
             ResultSet rs = null;
             Connection miConexion=(Connection) Conexion.GetConnection();
             Statement statement=(Statement) miConexion.createStatement();
             rs = statement.executeQuery("SELECT * from tb_articulo where codigo = '"+ codigo +"'");
             
             while(rs.next()){
                 
         
                 frmReservaEquipo.txtDescripcion.setText(rs.getString("descripcion"));
                 frmReservaEquipo.txtCodigo.setText(rs.getString("codigo"));
                
                 this.dispose();
             }
        }
        catch (Exception ex)
        {
           // JOptionPane.showMessageDialog(this, "Error "+ex.getMessage());
        }

    }
      
        

    public  void Listar(){
        DefaultTableModel modelo = 
         new DefaultTableModel();
 jTable1.setModel(modelo);
 
        try
        {        
        ResultSet rs = null;
        Connection miConexion=(Connection) Conexion.GetConnection();
        Statement statement=(Statement) miConexion.createStatement();
        
         rs = statement.executeQuery("SELECT * from tb_articulo");
 
         modelo.addColumn("CODIGO");
         modelo.addColumn("ESTADO");
         modelo.addColumn("DESCRIPCION");
         modelo.addColumn("MODELO");
         while(rs.next()){
            int codDisponible = rs.getInt("disponible");
            String stgDisponible = null;
            
            Object []ob=new Object[4];
            ob[0]=(rs.getInt("codigo"));
            if(codDisponible==0){ob[1]=("DISPONIBLE");}
            else{
                    if(codDisponible==1){ob[1]=("EN PRESTAMO");}
                    else{
                            if(codDisponible==2){ob[1]=("EQUIPO CON FALLA");}
                                   
                        }
                    }
            ob[2]=(rs.getString("descripcion"));
            ob[3]=(rs.getString("modelo"));
            modelo.addRow(ob);
            ob=null;
         }    
            rs.close();
            statement.close();
            miConexion.close();
            
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error "+ex.getMessage());
        }
    }  
    
    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyTyped

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        Listar();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
   Connection miConexion=(Connection) Conexion.GetConnection();
        try
        {
            
            if(txtcodigo.getText().trim().isEmpty())
            {
                 JOptionPane.showMessageDialog(this, "Debe ingresar campo código"); 
            }
            else
            {
                 Statement statement=(Statement) miConexion.createStatement(); 
                 String codigo = txtcodigo.getText();
                 
                 ResultSet rs = statement.executeQuery("SELECT COUNT(*) AS num FROM tb_articulo WHERE codigo LIKE '%"+ codigo +"%' OR  descripcion LIKE '%"+ codigo +"%' ");
                 int rows= 0;
                 if(rs.next()){
                     rows = rs.getInt("num");
                 }
                 if(rows > 0)

                 {
                      DefaultTableModel modelo = new DefaultTableModel(); jTable1.setModel(modelo);
 
                     rs = statement.executeQuery("SELECT * from tb_articulo WHERE codigo LIKE '%"+ codigo +"%' OR  descripcion LIKE '%"+ codigo +"%' ");
 
                     modelo.addColumn("CODIGO");
                     modelo.addColumn("DESCRIPCION");
                     modelo.addColumn("MODELO");
                     while(rs.next()){
                         Object []ob=new Object[4];
                         ob[0]=(rs.getInt("codigo"));
                         ob[1]=(rs.getString("descripcion"));
                         ob[2]=(rs.getString("modelo"));
                         modelo.addRow(ob);
                         ob=null;
                     }    
 
                        statement.close();
                        miConexion.close();                          
                 }                 
                 else{
                      JOptionPane.showMessageDialog(this, "No se han encontrado cohincidencias en base de datos ");
                 }
           
            }            
 
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error "+ex.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        txtcodigo.setText("");
        Listar();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables
}
