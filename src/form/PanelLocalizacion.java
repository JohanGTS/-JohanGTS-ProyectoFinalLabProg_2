
package form;

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
public class PanelLocalizacion extends javax.swing.JPanel {

    /**
     * Creates new form PanelLocalizacion
     */
    public PanelLocalizacion() {
        initComponents();
        TextPrompt placeholderId= new TextPrompt("Obligatorio",idTxt);
        TextPrompt placeholderTipo= new TextPrompt("Obligatorio",tipoTxt);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAgregar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        tipoTxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lblDinamico = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
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
        add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 130, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 79, -1, -1));

        idTxt.setBorder(null);
        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });
        add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 233, 20));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 233, 10));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tipo:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 79, -1, -1));

        tipoTxt.setBorder(null);
        add(tipoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 233, 20));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 230, 10));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Registrar nueva Localizacion");
        jLabel10.setOpaque(true);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, 40));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 10, 170));
        add(lblDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 80, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
        int cod;
        cod=Integer.parseInt(idTxt.getText());
        boolean encontrado=false;
        File archivoLocalizacion= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoLocalizacion.txt");
        Scanner s;    
            try {
                s= new Scanner(archivoLocalizacion);
                if(!archivoLocalizacion.exists())
                {
                    archivoLocalizacion.createNewFile();
                }
                while(s.hasNext()&&!encontrado)
                {
                    String linea=s.nextLine();
                    Scanner sl= new Scanner(linea);
                    sl.useDelimiter("\\s*;\\s*");
                    if(cod==Integer.parseInt(sl.next())){
                        tipoTxt.setText(sl.next());
                        lblDinamico.setText("Modificando");
                        encontrado=true;
                    }
                    else{
                        lblDinamico.setText("Creando");
                        tipoTxt.setText("");
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
    }//GEN-LAST:event_idTxtActionPerformed

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
        boolean vacio=true;
        if(idTxt.getText().equals("")||tipoTxt.getText().equals(""))
            vacio=false;
       
        if(!vacio)
            JOptionPane.showMessageDialog(null,"Hay campos obligatorios sin completar","Campos vacíos",JOptionPane.ERROR_MESSAGE);
        else
        {
            File archivoLocalizacion= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoLocalizacion.txt");
            try 
            {
                if(!archivoLocalizacion.exists())
                    archivoLocalizacion.createNewFile();
                BufferedWriter bw=new BufferedWriter(new FileWriter(archivoLocalizacion));
                
                bw.write(idTxt.getText()+";"+tipoTxt.getText());
                bw.newLine();
                bw.flush();
            } 
            catch (FileNotFoundException e) 
            {
                JOptionPane.showMessageDialog(null, "Archivo de texto no encontrado");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            
            JOptionPane.showMessageDialog(null, "Localización agregada correctamente");
            idTxt.setText("");
            tipoTxt.setText("");
        }
            
    }//GEN-LAST:event_lblAgregarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblDinamico;
    private javax.swing.JTextField tipoTxt;
    // End of variables declaration//GEN-END:variables
}
