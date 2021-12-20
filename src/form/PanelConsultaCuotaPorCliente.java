
package form;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class PanelConsultaCuotaPorCliente extends javax.swing.JPanel {

    DefaultTableModel Tabla;
    
    public PanelConsultaCuotaPorCliente() {
        initComponents();
        Tabla=( DefaultTableModel)this.jTable1.getModel();
        jTable1.setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Consultar = new javax.swing.JButton();
        txtPorNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        txtPorNombre1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });
        add(Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 30));

        txtPorNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorNombreActionPerformed(evt);
            }
        });
        add(txtPorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 210, 30));

        jLabel1.setText("Por Nombre");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id cliente", "Cuota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 600, 190));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 600, 10));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        txtPorNombre1.setEditable(false);
        txtPorNombre1.setBackground(new java.awt.Color(0, 0, 0));
        txtPorNombre1.setFont(new java.awt.Font("Californian FB", 0, 18)); // NOI18N
        txtPorNombre1.setForeground(new java.awt.Color(255, 255, 255));
        txtPorNombre1.setText("Consulta de Cuota Por Cliente");
        txtPorNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(txtPorNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPorNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        Tabla.setRowCount(0);
        String id,cuota;
        File arch= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\detallesCuota.txt");

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
                    k.next();
                    id=k.next(); 
                    cuota=k.next();
                    
                        Tabla.addRow(new Object [] {id,cuota});

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

        String id, cuota;
        String nomb=txtPorNombre.getText();

        File arch= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\detallesCuota.txt");

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
                    k.next();
                    id=k.next(); 
                    cuota=k.next();
                    if (linea.contains(nomb))
                    {
                        Tabla.addRow(new Object [] {id,cuota});
                    }
                }
                s.close();
            }
        }
        catch(FileNotFoundException x)
        {
            System.out.println(x);
        }
    }//GEN-LAST:event_txtPorNombreActionPerformed


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
