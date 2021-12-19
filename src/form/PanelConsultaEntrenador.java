/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class PanelConsultaEntrenador extends javax.swing.JPanel {

    DefaultTableModel Tabla;
    
    public PanelConsultaEntrenador() {
        initComponents();
        Tabla=( DefaultTableModel)this.jTable1.getModel();
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
        txtPorNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Consultar = new javax.swing.JButton();
        txtPorNombre1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        txtPorNombre.setBackground(new java.awt.Color(0, 0, 0));
        txtPorNombre.setFont(new java.awt.Font("Californian FB", 0, 18)); // NOI18N
        txtPorNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtPorNombre.setText("Consulta De Entrenador");
        txtPorNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(txtPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 50));

        jLabel1.setText("Por Nombre");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 600, 10));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Telefono", "Correo Electronico"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 600, 220));

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });
        add(Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 30));

        txtPorNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPorNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorNombre1ActionPerformed(evt);
            }
        });
        add(txtPorNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 210, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        Tabla.setRowCount(0);
        String ID,Nombre, Apellido,Telefono,CorreoElectronico;
        File arch= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoEntrenador.txt");

        try
        {
            if(arch.exists())
            {

                String linea;

                Scanner s = new Scanner(arch);
                while (s.hasNextLine())
                {
                    linea = s.nextLine();
                    Scanner k = new Scanner(linea);
                    k.useDelimiter("\\s*;\\s*");
                    ID=k.next();
                    Nombre=k.next();
                    Apellido=k.next();
                    Telefono=k.next();
                    CorreoElectronico=k.next();
                    Tabla.addRow(new Object [] {ID,Nombre,Apellido,Telefono,CorreoElectronico});

                }//FIN while

                s.close();
            }
        }
        catch(Exception x)
        {
            System.out.println(x);
        }
    }//GEN-LAST:event_ConsultarActionPerformed

    private void txtPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPorNombreActionPerformed
        Tabla.setRowCount(0);

        String ID,Nombre, Apellido,Telefono,CorreoElectronico;
        String nomb=txtPorNombre.getText();

        File arch= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoEntrenador.txt");

        try
        {
            if(arch.exists())
            {
                String linea;
                Scanner s = new Scanner(arch);
                while (s.hasNextLine())

                {
                    linea = s.nextLine();
                    Scanner k = new Scanner(linea);
                    k.useDelimiter("\\s*;\\s*");
                   
                    
                    ID=k.next();
                    Nombre=k.next();
                    Apellido=k.next();
                    Telefono=k.next();
                    CorreoElectronico=k.next();
                    

                    if (linea.contains(nomb))
                    {
                        Tabla.addRow(new Object [] {ID,Nombre,Apellido,Telefono,CorreoElectronico});

                    }

                }// fin While
                s.close();
            }
        }
        catch(FileNotFoundException x)
        {
            System.out.println(x);
        }
    }//GEN-LAST:event_txtPorNombreActionPerformed

    private void txtPorNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPorNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPorNombre1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtPorNombre;
    private javax.swing.JTextField txtPorNombre1;
    // End of variables declaration//GEN-END:variables
}
