/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import Main.Main;
import Placeholder.TextPrompt;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Marte
 */
public class PanelSalas extends javax.swing.JPanel {

    /**
     * Creates new form PanelSalas
     */
    public PanelSalas() {
        initComponents();
        TextPrompt placeholderIdSalas= new TextPrompt("Obligatorio",idSalasTxt);
        TextPrompt placeholderNombreSala= new TextPrompt("Obligatorio",nombreSalaTxt);
        TextPrompt placeholderDescripcionSala= new TextPrompt("Obligatorio",descripcionSalaTxt);
        TextPrompt placeholderIdLocSala= new TextPrompt("Obligatorio",idLocSalaTxt);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblAgregar = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreSalaTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        descripcionSalaTxt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        idLocSalaTxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblDinamico = new javax.swing.JLabel();
        idSalasTxt = new javax.swing.JTextField();

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR");
        jLabel1.setOpaque(true);

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgregar.setBackground(new java.awt.Color(0, 0, 0));
        lblAgregar.setFont(new java.awt.Font("Californian FB", 0, 18)); // NOI18N
        lblAgregar.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregar.setText("AGREGAR");
        lblAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregar.setOpaque(true);
        lblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarMouseClicked(evt);
            }
        });
        add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 130, 40));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 10, 340));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Registrar nueva Sala");
        jLabel10.setOpaque(true);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("ID Salas:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        nombreSalaTxt.setBackground(new java.awt.Color(255, 255, 255));
        nombreSalaTxt.setBorder(null);
        add(nombreSalaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 233, 17));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 233, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nombre Sala:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 218, 233, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Descripcion Sala:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 20));

        descripcionSalaTxt.setBackground(new java.awt.Color(255, 255, 255));
        descripcionSalaTxt.setBorder(null);
        add(descripcionSalaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 233, 20));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 230, 10));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("ID Localizacion Sala:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 79, -1, -1));

        idLocSalaTxt.setBackground(new java.awt.Color(255, 255, 255));
        idLocSalaTxt.setBorder(null);
        add(idLocSalaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 99, 233, 20));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 230, 10));

        lblDinamico.setEnabled(false);
        add(lblDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 80, 20));

        idSalasTxt.setBackground(new java.awt.Color(255, 255, 255));
        idSalasTxt.setBorder(null);
        idSalasTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idSalasTxtActionPerformed(evt);
            }
        });
        add(idSalasTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 233, 17));
    }// </editor-fold>//GEN-END:initComponents

    
    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
        boolean vacio=true;
        boolean encontrado=false;
        if(idSalasTxt.getText().equals("")||nombreSalaTxt.getText().equals("")||descripcionSalaTxt.getText().equals("")
            ||idLocSalaTxt.getText().equals(""))
            vacio=false;
       
        if(!vacio)
            JOptionPane.showMessageDialog(null,"Hay campos obligatorios sin completar","Campos vacíos",JOptionPane.ERROR_MESSAGE);
        else
        {
            File archivoSalas= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoSalas.txt");
            try {                           
                if(!archivoSalas.exists())
                    archivoSalas.createNewFile();;
                
                BufferedWriter bw=new BufferedWriter(new FileWriter(archivoSalas));

                bw.write(idSalasTxt.getText()+";"+nombreSalaTxt.getText()+";"+descripcionSalaTxt.getText()+";"+idLocSalaTxt.getText());
                bw.newLine();
                bw.flush();
               
            } 
            catch (FileNotFoundException e)
            {
                JOptionPane.showMessageDialog(null, "Archivo de texto no encontrado");
            } catch (IOException ex) 
            {
                ex.printStackTrace();
            }
            
            
            JOptionPane.showMessageDialog(null, "Sala agregada correctamente");
            idSalasTxt.setText("");
            nombreSalaTxt.setText("");
            descripcionSalaTxt.setText("");
            idLocSalaTxt.setText("");
        }
    }//GEN-LAST:event_lblAgregarMouseClicked

    private void idSalasTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idSalasTxtActionPerformed
        int cod;
        cod=Integer.parseInt(idSalasTxt.getText());
        boolean encontrado=false;
        File archivoSalas= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoSalas.txt");
        Scanner s;    
            try {
                s= new Scanner(archivoSalas);
                if(!archivoSalas.exists())
                {
                    archivoSalas.createNewFile();
                }
                while(s.hasNext()&&!encontrado)
                {
                    String linea=s.nextLine();
                    Scanner sl= new Scanner(linea);
                    sl.useDelimiter("\\s*;\\s*");
                    if(cod==Integer.parseInt(sl.next())){
                        nombreSalaTxt.setText(sl.next());
                        descripcionSalaTxt.setText(sl.next());
                        idLocSalaTxt.setText(sl.next());
                        lblDinamico.setText("Modificando");
                        encontrado=true;
                    }
                    else{
                        lblDinamico.setText("Creando");
                        nombreSalaTxt.setText("");
                        descripcionSalaTxt.setText("");
                        idLocSalaTxt.setText("");
                    }
                }
                s.close();
               
            } 
            catch (FileNotFoundException e)
            {
                JOptionPane.showMessageDialog(null, "Archivo de texto no encontrado");
            } catch (IOException ex) 
            {
                ex.printStackTrace();
            }
    }//GEN-LAST:event_idSalasTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField descripcionSalaTxt;
    private javax.swing.JTextField idLocSalaTxt;
    private javax.swing.JTextField idSalasTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblDinamico;
    private javax.swing.JTextField nombreSalaTxt;
    // End of variables declaration//GEN-END:variables
}
