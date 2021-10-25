/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrInt1.java
 *
 * Created on 30/06/2011, 11:05:09 AM
 */
package com.soltelec.eventos.igrafica;

import com.soltelec.eventos.exceptions.NonexistentEntityException;
import com.soltelec.eventos.dao.EventoCdaJpaController;
import com.soltelec.eventos.model.EstadosEvento;
import com.soltelec.eventos.model.EventoCda;
import com.soltelec.eventos.utils.CMensajes;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.beans.PropertyVetoException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SOLTELEC
 */
public class EventoCDA extends javax.swing.JInternalFrame {

    JTable jTable1 = new javax.swing.JTable();
    JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    DefaultTableModel modelo;
    private EventoCdaJpaController crud;
    private EventoCda eventoCda;
    private int modo;
    private Integer idEvento;

    /**
     * Creates new form FrInt1
     */
    
    public static void main(String[] arg){
        EventoCDA eventoCda = new EventoCDA();
        eventoCda.eventocda();
        eventoCda.setVisible(true);      
    }
    
    public EventoCDA() {
        super("EventoCda",
                true, //resizable
                true, //closable
               false, //maximizable
                true);

        initComponents();
        dimension();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgEditarEvento = new javax.swing.JDialog();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollTxtArea = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jToolBar2 = new javax.swing.JToolBar();
        btnNuevoEvento = new javax.swing.JButton();
        btnEditarEvento = new javax.swing.JButton();
        btnEliminarEvento = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_eventos = new javax.swing.JTable();
        EventoCdaJpaController mprop = new EventoCdaJpaController();
        pnlFiltro = new javax.swing.JPanel();
        btn_busqueda = new javax.swing.JButton();
        dteFechaInicio = new org.jdesktop.swingx.JXDatePicker();
        dteFechaFin = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txarea_accion = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txarea_descripcion = new javax.swing.JTextArea();

        dlgEditarEvento.setMinimumSize(new java.awt.Dimension(460, 352));
        dlgEditarEvento.setModal(true);
        dlgEditarEvento.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                dlgEditarEventoWindowOpened(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/servidor/images/block.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/servidor/images/accept.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion"));

        txtDescripcion.setColumns(20);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        jScrollTxtArea.setViewportView(txtDescripcion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollTxtArea, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollTxtArea, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dlgEditarEventoLayout = new javax.swing.GroupLayout(dlgEditarEvento.getContentPane());
        dlgEditarEvento.getContentPane().setLayout(dlgEditarEventoLayout);
        dlgEditarEventoLayout.setHorizontalGroup(
            dlgEditarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgEditarEventoLayout.createSequentialGroup()
                .addGroup(dlgEditarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgEditarEventoLayout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgEditarEventoLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        dlgEditarEventoLayout.setVerticalGroup(
            dlgEditarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgEditarEventoLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dlgEditarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        setClosable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(835, 470));

        jToolBar2.setFloatable(false);
        jToolBar2.setAutoscrolls(true);

        btnNuevoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/servidor/images/new.png"))); // NOI18N
        btnNuevoEvento.setToolTipText("Nuevo Evento");
        btnNuevoEvento.setFocusable(false);
        btnNuevoEvento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoEvento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEventoActionPerformed(evt);
            }
        });
        jToolBar2.add(btnNuevoEvento);

        btnEditarEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/servidor/images/edit.png"))); // NOI18N
        btnEditarEvento.setToolTipText("Editar Evento");
        btnEditarEvento.setEnabled(false);
        btnEditarEvento.setFocusable(false);
        btnEditarEvento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarEvento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEventoActionPerformed(evt);
            }
        });
        jToolBar2.add(btnEditarEvento);

        btnEliminarEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/servidor/images/delete.png"))); // NOI18N
        btnEliminarEvento.setToolTipText("Eliminar Evento");
        btnEliminarEvento.setEnabled(false);
        btnEliminarEvento.setFocusable(false);
        btnEliminarEvento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarEvento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEventoActionPerformed(evt);
            }
        });
        jToolBar2.add(btnEliminarEvento);

        modelo = new DefaultTableModel();

        List<EventoCda> results = mprop.findEventoCda1();

        // Ahora sólo hay que rellenar el DefaultTableModel con los datos del ResultSet. La forma "manual" de hacer esto es la siguiente
        // Creamos las columnas.

        modelo.addColumn("Serie");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Accion");
        modelo.addColumn("Estado");
        modelo.addColumn("Fecha de registro");
        modelo.addColumn("Fecha de cierre");

        // Bucle para cada resultado en la consulta

        for (int i = 0; i < results.size(); i++) {

            // Se crea un array que será una de las filas de la tabla.
            EventoCda fila = new EventoCda(); // Hay tres columnas en la tabla
            fila = (EventoCda) results.get(i);

            /*
            * // Se rellena cada posición del array con una de las columnas de
            * la tabla en base de datos. fila[0] = result[0]; fila[1] =
            * result[1]; fila[2] = result[2]; fila[3] = result[3]; fila[4] =
            * result[4]; fila[5] = result[5];
            */

            // Se añade al modelo la fila completa.
            // modelo.addRow(null);
        }

        tabla_eventos.setModel(modelo);
        //  tabla_eventos.setEnabled(false);
        jScrollPane2.setViewportView(tabla_eventos);
        tabla_eventos.setModel(modelo);
        tabla_eventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_eventosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_eventos);

        pnlFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Crear Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 51, 204))); // NOI18N
        pnlFiltro.setPreferredSize(new java.awt.Dimension(700, 113));

        btn_busqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/servidor/images/search.png"))); // NOI18N
        btn_busqueda.setText("Buscar");
        btn_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busquedaActionPerformed(evt);
            }
        });

        dteFechaInicio.setName("Fecha Inicio"); // NOI18N

        dteFechaFin.setName("Fecha Fin"); // NOI18N

        jLabel1.setText("Fecha Inicio");

        jLabel2.setText("Fecha Fin");

        javax.swing.GroupLayout pnlFiltroLayout = new javax.swing.GroupLayout(pnlFiltro);
        pnlFiltro.setLayout(pnlFiltroLayout);
        pnlFiltroLayout.setHorizontalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltroLayout.createSequentialGroup()
                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFiltroLayout.createSequentialGroup()
                        .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dteFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(dteFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlFiltroLayout.setVerticalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFiltroLayout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dteFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dteFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txarea_accion.setEditable(false);
        txarea_accion.setColumns(20);
        txarea_accion.setLineWrap(true);
        txarea_accion.setRows(5);
        jScrollPane4.setViewportView(txarea_accion);

        txarea_descripcion.setEditable(false);
        txarea_descripcion.setColumns(20);
        txarea_descripcion.setLineWrap(true);
        txarea_descripcion.setRows(5);
        jScrollPane5.setViewportView(txarea_descripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                        .addComponent(jScrollPane4)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editar1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int fila = tabla_eventos.getSelectedRow();
        int columna = 0;
        int resultado = 0;
        if ((fila > -1) && (columna > -1)) {
            try {
                resultado = Integer.parseInt(String.valueOf(modelo.getValueAt(fila, columna)));
            } catch (Exception ex) {
            }
        }
        modo = 2;
        idEvento = resultado;
        dlgEditarEvento.setLocationRelativeTo(null);
        dlgEditarEvento.setVisible(true);
    }

    private void borrar1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        EventoCdaJpaController even = new EventoCdaJpaController();
        int fila = tabla_eventos.getSelectedRow();
        int columna = 0;
        int resultado;
        if (CMensajes.mensajePregunta("Desea borrar el evento elegido?")) {
            if ((fila > -1) && (columna > -1)) {
                try {
                    resultado = Integer.parseInt(String.valueOf(modelo.getValueAt(fila, columna)));
                    even.destroy(resultado);
                    JOptionPane.showMessageDialog(this, "Se logro eliminar el registro");
                } catch (NumberFormatException | NonexistentEntityException | HeadlessException ex) {
                    CMensajes.mostrarExcepcion(ex);
                }
                System.out.println("hola " + modelo.getValueAt(fila, columna));
            }
            btn_busquedaActionPerformed(evt);
        }
    }

    protected void eventocda() {
        JDesktopPane desktop = new JDesktopPane();
        EventoCDA frame = new EventoCDA();
        frame.setVisible(true);
        desktop.add(frame);

        try {
            frame.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }                                                                    //--------------------------------------
    }

    private void dimension() {
        Dimension dim = super.getToolkit().getScreenSize();
        setSize((int) dim.getWidth() - ((int) dim.getWidth() * 1) / 100, (int) dim.getHeight() - 97);
    }

    private void btn_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busquedaActionPerformed
        EventoCdaJpaController mveh = new EventoCdaJpaController();
        List<EventoCda> results = null;
        
        if (dteFechaInicio.getDate() != null && dteFechaFin.getDate() != null) {
            Date fechaI = dteFechaInicio.getDate();
            Date fechaF = dteFechaFin.getDate();
            
            String fechaInicio = (fechaI.getYear() + 1900) + "-" + (fechaI.getMonth() + 1) + "-" + fechaI.getDate();
            String fechaFin = (fechaF.getYear() + 1900) + "-" + (fechaF.getMonth() + 1) + "-" + fechaF.getDate();
            
            String[] campos = {"finicial","finicial"};
            String[] valores = {fechaInicio, fechaFin};
            String[] condicion = {">=","<="};
            results = mveh.findEventoCdaByMultiParameters(valores, campos, condicion);            
        } else {
            results = mveh.findEventoCda1();
        }
        
        if (results.isEmpty()) {
            CMensajes.mensajeAdvertencia("No hay resultados para su busqueda");
            tabla_eventos.setModel(new DefaultTableModel());
            return;
        }
        
        //limpiar_modelo();
        modelo = new DefaultTableModel();
        // Ahora sólo hay que rellenar el DefaultTableModel con los datos del ResultSet. La forma "manual" de hacer esto es la siguiente
        // Creamos las columnas.
        modelo.addColumn("Serie");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Accion");
        modelo.addColumn("Estado");
        modelo.addColumn("Fecha de registro");
        modelo.addColumn("Fecha de cierre");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // Bucle para cada resultado en la consulta
        for (int i = 0; i < results.size(); i++) {
            // Se crea un array que será una de las filas de la tabla.
            Object[] fila = new Object[6]; // Hay tres columnas en la tabla
            // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
            fila[0] = results.get(i).getIdEvento();
            fila[1] = results.get(i).getDescripcion();
            fila[2] = results.get(i).getAccion();
            fila[3] = results.get(i).getIdEstado().getDescripcion();
            fila[4] = dateFormat.format(results.get(i).getFinicial());
            try {
                fila[5] = dateFormat.format(results.get(i).getFfinal());
            } catch (Exception e) {
            }
            // Se añade al modelo la fila completa.
            modelo.addRow(fila);
        }
        tabla_eventos.setModel(modelo);
        jScrollPane2.setViewportView(tabla_eventos);
        txarea_accion.setText("");
        txarea_descripcion.setText("");
    }//GEN-LAST:event_btn_busquedaActionPerformed
    
    private void tabla_eventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_eventosMouseClicked
        try {
            btnEditarEvento.setEnabled(true);
            btnEliminarEvento.setEnabled(true);
            int fila = tabla_eventos.rowAtPoint(evt.getPoint());
            if (fila > -1) {
                txarea_descripcion.setText(modelo.getValueAt(fila, 1).toString());
                txarea_accion.setText(modelo.getValueAt(fila, 2).toString());
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_tabla_eventosMouseClicked

    private void btnNuevoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEventoActionPerformed
        btnEditarEvento.setEnabled(false);
        btnEliminarEvento.setEnabled(false);
        EventoDatos evento = new EventoDatos();        
        //Principal.desktop.add(evento);///-------------------------------------------------------------------
        evento.setVisible(true);
        try {
            evento.setMaximum(true);
        } catch (PropertyVetoException ex) {
            CMensajes.mostrarExcepcion(ex);
        }
    }//GEN-LAST:event_btnNuevoEventoActionPerformed

    private void btnEditarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEventoActionPerformed
        editar1ActionPerformed(evt);
    }//GEN-LAST:event_btnEditarEventoActionPerformed

    private void btnEliminarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEventoActionPerformed
        borrar1ActionPerformed(evt);
    }//GEN-LAST:event_btnEliminarEventoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dlgEditarEvento.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String descripcion = txtDescripcion.getText();
        if (modo == 2) {
            if (eventoCda.getIdEstado().getId() == 2) {
                CMensajes.mensajeAdvertencia("Ya se cerro este evento por favor cree uno nuevo");
                return;
            }
            eventoCda.setDescripcion(descripcion);
            try {
                crud.edit(eventoCda);
                CMensajes.mensajeCorrecto("Se logro editar la informacion");
            } catch (Exception e) {
                CMensajes.mostrarExcepcion(e);
            }
        } else if (modo == 3) {
            crud = new EventoCdaJpaController();
            eventoCda.setAccion(descripcion);
            eventoCda.setFfinal(new java.util.Date());
            eventoCda.setIdEstado(new EstadosEvento(2));
            
            try {
                crud.edit(eventoCda);
                CMensajes.mensajeCorrecto("Se logro cerrar el evento");
            } catch (Exception e) {
                CMensajes.mostrarExcepcion(e);
            }
        }

        dlgEditarEvento.dispose();
        txarea_descripcion.setText("");
        btn_busquedaActionPerformed(evt);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void dlgEditarEventoWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dlgEditarEventoWindowOpened
        if (idEvento > 0) {
            crud = new EventoCdaJpaController();
            if (modo == 2) {
                eventoCda = crud.findEventoCda(this.idEvento);
                txtDescripcion.setText(eventoCda.getDescripcion());
            } else if (modo == 3) {
                eventoCda = crud.findEventoCda(this.idEvento);
                if (eventoCda.getIdEstado().getId() == 2) {
                    CMensajes.mensajeAdvertencia("Este evento esta cerrado por favor cree uno nuevo");
                    dlgEditarEvento.dispose();
                }
            }
        }
    }//GEN-LAST:event_dlgEditarEventoWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarEvento;
    private javax.swing.JButton btnEliminarEvento;
    private javax.swing.JButton btnNuevoEvento;
    private javax.swing.JButton btn_busqueda;
    private javax.swing.JDialog dlgEditarEvento;
    private org.jdesktop.swingx.JXDatePicker dteFechaFin;
    private org.jdesktop.swingx.JXDatePicker dteFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollTxtArea;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JPanel pnlFiltro;
    private javax.swing.JTable tabla_eventos;
    private javax.swing.JTextArea txarea_accion;
    private javax.swing.JTextArea txarea_descripcion;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}