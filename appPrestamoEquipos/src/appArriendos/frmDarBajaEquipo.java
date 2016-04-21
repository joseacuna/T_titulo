/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appArriendos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.Normalizer;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Phobos
 */
public class frmDarBajaEquipo extends JInternalFrame{

    /**
     * Creates new form frmDarBajaEquipo
     */
    public frmDarBajaEquipo() {
        initComponents();
    }
    //obtengo Los datos del Equipo
public void ObtenerRegistro(String codigo){
        
        try
        {
             ResultSet rs = null;
             Connection miConexion=(Connection) Conexion.GetConnection();
             Statement statement=(Statement) miConexion.createStatement();
             rs = statement.executeQuery("SELECT * from tb_articulo where codigo = '"+ codigo +"'");
             
             while(rs.next()){
                 
         
                 txtdescripcion.setText(rs.getString("descripcion"));
                 txtcodigo.setText(rs.getString("codigo"));
                 txtnumero_serie.setText(rs.getString("numero_serie"));
                 txtmodelo.setText(rs.getString("modelo"));
                 txtObservacion.setText(rs.getString("observacion"));
                
                 int cod_categoria = rs.getInt("cod_categoria");
                 
                 int cod_marca = rs.getInt("cod_marca");

                 ResultSet rs3 = statement.executeQuery("SELECT * from tb_marca where codigo = '"+ cod_marca +"'");  
//                 String Mar = "";
                 while(rs3.next()){                
//                    Mar = rs3.getString("descripcion");
                    this.txtMarca.setText(rs3.getString("descripcion"));
                 }
//                 this.cboxMarca.setSelectedItem(Mar) ; 
                   //this.txtCategoria.setText(rs3.getString("descripcion"));

                 ResultSet rs2 = statement.executeQuery("SELECT * from tb_categoria where codigo = '"+ cod_categoria +"'");  
//                 String Cat = "";
                 while(rs2.next()){                
//                    Cat = rs2.getString("descripcion");
                      this.txtCategoria.setText(rs2.getString("descripcion"));
                 }
//                 this.cboxCategoria.setSelectedItem(Cat) ; 
                 
                 
                 
             }
        }
        catch (Exception ex)
        {
           // JOptionPane.showMessageDialog(this, "Error "+ex.getMessage());
        }

    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservacion = new javax.swing.JTextArea();
        txtnumero_serie = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDarBaja = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCategoria = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMotivo = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnReparado = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/png32/tecnologia.png"))); // NOI18N
        setVisible(true);

        jLabel7.setText("CATEGORIA");

        txtdescripcion.setEnabled(false);
        txtdescripcion.setName("txtdescripcion"); // NOI18N

        txtmodelo.setEnabled(false);
        txtmodelo.setName("txtmodelo"); // NOI18N

        jLabel8.setText("MARCA");
        jLabel8.setToolTipText("");

        txtcodigo.setEnabled(false);
        txtcodigo.setName("txtcodigo"); // NOI18N

        jLabel3.setText("NUMERO SERIE");

        txtObservacion.setColumns(20);
        txtObservacion.setRows(5);
        txtObservacion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtObservacion.setEnabled(false);
        txtObservacion.setFocusable(false);
        jScrollPane2.setViewportView(txtObservacion);

        txtnumero_serie.setEnabled(false);
        txtnumero_serie.setName("txtnumero_serie"); // NOI18N

        jLabel5.setText("OBSERVACION");

        jLabel4.setText("MODELO");

        jLabel2.setText("DESCRIPCION");

        jLabel1.setText("CODIGO");

        btnDarBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/png32/icon-31590.png"))); // NOI18N
        btnDarBaja.setText("Dar Baja");
        btnDarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarBajaActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/png32/icon-108794.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtCategoria.setEnabled(false);

        txtMarca.setEnabled(false);

        txtAreaMotivo.setColumns(20);
        txtAreaMotivo.setRows(5);
        jScrollPane1.setViewportView(txtAreaMotivo);

        jLabel6.setText("MOTIVO DE LA BAJA");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/png32/tecnologia.png"))); // NOI18N
        jLabel9.setText("MODULO DAR DE BAJA UN EQUIPO");

        btnReparado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/png32/tecnologia.png"))); // NOI18N
        btnReparado.setText("Reparado");
        btnReparado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReparadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(214, 214, 214)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnReparado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCategoria)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtnumero_serie, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnumero_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDarBaja)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReparado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarBajaActionPerformed
        // TODO add your handling code here:
        //eñ Valor para Dar de Baja es 2
            try {


               if(txtAreaMotivo.getText().trim().isEmpty()){
               JOptionPane.showMessageDialog(this, "Debe ingresar un motivo");
               }else{
                    Connection miConexion=(Connection) Conexion.GetConnection();
                    Statement statement=(Statement) miConexion.createStatement();
                   
                    String descripcion = txtdescripcion.getText();
                    String codigo = txtcodigo.getText();
                    String serie = txtnumero_serie.getText();
                    String modelo = txtmodelo.getText();
                    String observacion = txtObservacion.getText();
                    String categoria = txtCategoria.getText();
                    String marca = txtMarca.getText();
                    //el motivo
                    
                    String motivo = txtAreaMotivo.getText();
                    
                    //categoria
                    ResultSet rs = statement.executeQuery("SELECT * from tb_categoria where descripcion = '"+ categoria +"'");
                    int cod_categoria =0;
                    while(rs.next()){                
                    cod_categoria = rs.getInt("codigo");    
                    } 
                    //marca
                    rs = statement.executeQuery("SELECT * from tb_marca where descripcion = '"+ marca +"'");  
                    int cod_marca =0;
                    while(rs.next()){                
                        cod_marca = rs.getInt("codigo");    
                    } 
                    int cantidad = statement.executeUpdate("UPDATE tb_articulo SET descripcion = '"+ descripcion +"', numero_serie = '"+ serie +"', cod_categoria = '"+ cod_categoria +"', cod_marca = '"+ cod_marca +"', modelo = '"+ modelo +"', observacion = '"+"Equipo dado de baja por :"+"\n --- \n"+ motivo+"\n --- \n"+ observacion +"', disponible = '2' WHERE codigo = '"+ codigo +"'");
                if(cantidad > 0)
                {
                    JOptionPane.showMessageDialog(this, "Registro actualizado exitosamente");
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Problema actualizando registro de sistema");
                }
                    
                   miConexion.close();
                   statement.close();
                   this.dispose();
               }
            } catch (Exception e) {
            }
    }//GEN-LAST:event_btnDarBajaActionPerformed

    private void btnReparadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReparadoActionPerformed
        // TODO add your handling code here:
        try {


               if(txtAreaMotivo.getText().trim().isEmpty()){
               JOptionPane.showMessageDialog(this, "Debe ingresar un motivo");
               }else{
                    Connection miConexion=(Connection) Conexion.GetConnection();
                    Statement statement=(Statement) miConexion.createStatement();
                   
                    String descripcion = txtdescripcion.getText();
                    String codigo = txtcodigo.getText();
                    String serie = txtnumero_serie.getText();
                    String modelo = txtmodelo.getText();
                    String observacion = txtObservacion.getText();
                    String categoria = txtCategoria.getText();
                    String marca = txtMarca.getText();
                    //el motivo
                    
                    String motivo = txtAreaMotivo.getText();
                    
                    //categoria
                    ResultSet rs = statement.executeQuery("SELECT * from tb_categoria where descripcion = '"+ categoria +"'");
                    int cod_categoria =0;
                    while(rs.next()){                
                    cod_categoria = rs.getInt("codigo");    
                    } 
                    //marca
                    rs = statement.executeQuery("SELECT * from tb_marca where descripcion = '"+ marca +"'");  
                    int cod_marca =0;
                    while(rs.next()){                
                        cod_marca = rs.getInt("codigo");    
                    } 
                    int cantidad = statement.executeUpdate("UPDATE tb_articulo SET descripcion = '"+ descripcion +"', numero_serie = '"+ serie +"', cod_categoria = '"+ cod_categoria +"', cod_marca = '"+ cod_marca +"', modelo = '"+ modelo +"', observacion = '"+"Reparado :"+"\n --- \n"+ motivo+"\n --- \n"+ observacion +"', disponible = '0' WHERE codigo = '"+ codigo +"'");
                if(cantidad > 0)
                {
                    JOptionPane.showMessageDialog(this, "Registro actualizado exitosamente");
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Problema actualizando registro de sistema");
                }
                    
                   miConexion.close();
                   statement.close();
                   this.dispose();
               }
            } catch (Exception e) {
            }
    }//GEN-LAST:event_btnReparadoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDarBaja;
    private javax.swing.JButton btnReparado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAreaMotivo;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextArea txtObservacion;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtnumero_serie;
    // End of variables declaration//GEN-END:variables
}
