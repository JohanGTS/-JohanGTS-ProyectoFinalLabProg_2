/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import Placeholder.TextPrompt;
import Tablas.Usuarios;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.security.spec.NamedParameterSpec;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Johan Tavera
 */
public class PanelUsuario extends javax.swing.JPanel {

    public static String sAntiguaLinea="";
    public static String sNuevaLinea="";
    public static boolean crear;
    private static Scanner s;
    
    /**
     * Creates new form Panel1
     */
    public PanelUsuario() {
        initComponents();
        grupoNivelAcceso.add(nivel0);
        grupoNivelAcceso.add(nivel1);
        TextPrompt placeholderUsuario= new TextPrompt("Obligatorio",loginUsuarioTxt);
        TextPrompt placeholderNombre= new TextPrompt("Obligatorio",nombreTxt);
        TextPrompt placeholderApellidos= new TextPrompt("Obligatorio",apellidosTxt);
        TextPrompt placeholderContrasena= new TextPrompt("Obligatorio",contrasenaPassFl);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoNivelAcceso = new javax.swing.ButtonGroup();
        lblAgregar = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        correoElectronicoTxt = new javax.swing.JTextField();
        apellidosTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblDinamico = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        loginUsuarioTxt = new javax.swing.JTextField();
        contrasenaPassFl = new javax.swing.JPasswordField();
        nivel0 = new javax.swing.JCheckBox();
        nivel1 = new javax.swing.JCheckBox();

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
        add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 130, 40));

        nombreTxt.setBorder(null);
        add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 233, 20));

        correoElectronicoTxt.setBorder(null);
        add(correoElectronicoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 233, 20));

        apellidosTxt.setBorder(null);
        add(apellidosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 233, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Login Usuario:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nivel Acceso:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nombre:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Apellidos:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Correo Electrico:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, 24));

        lblDinamico.setText("Modificaion:");
        add(lblDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 80, 20));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 250, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 218, 250, -1));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 250, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 230, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 230, 10));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Registrar nuevo Usuario");
        jLabel10.setOpaque(true);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, 40));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 10, 340));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 230, 10));

        loginUsuarioTxt.setBorder(null);
        loginUsuarioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsuarioTxtActionPerformed(evt);
            }
        });
        add(loginUsuarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 233, 20));

        contrasenaPassFl.setBorder(null);
        add(contrasenaPassFl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 230, 30));

        nivel0.setBackground(new java.awt.Color(255, 255, 255));
        nivel0.setText("0");
        nivel0.setActionCommand("");
        nivel0.setBorder(null);
        add(nivel0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        nivel1.setBackground(new java.awt.Color(255, 255, 255));
        nivel1.setSelected(true);
        nivel1.setText("1");
        nivel1.setActionCommand("");
        nivel1.setBorder(null);
        add(nivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
        String log="";
        String pass="";
        int nivel=1;
        String nomb="";
        String app="";
        String correo="";
        
        log=loginUsuarioTxt.getText();
        pass= new String(contrasenaPassFl.getPassword());
        if(nivel0.isSelected())
            nivel=0;
        nomb=nombreTxt.getText();
        app=apellidosTxt.getText();
        correo=correoElectronicoTxt.getText();
        
        try {
            if(!crear)
                guardarDatos(log, pass, nivel, nomb, app, correo);
            else
            {
                sNuevaLinea=(log+";"+pass+";"+nivel+";"+nomb+";"+app+";"+correo);
                modificar(sAntiguaLinea,sNuevaLinea);
            }
            loginUsuarioTxt.setText("");
            contrasenaPassFl.setText("");
            nivel0.setSelected(false);
            nivel1.setSelected(true);
            nombreTxt.setText("");
            apellidosTxt.setText("");
            correoElectronicoTxt.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lblAgregarMouseClicked

    private void loginUsuarioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUsuarioTxtActionPerformed
        String cod;
        boolean encontrado=false;
        cod=loginUsuarioTxt.getText();
        Scanner s;
        try 
        {
          File f= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoUsuarios.txt");
          s=new Scanner(f);
          if(!f.exists())
          {
              f.createNewFile();
          }
          else
          {
              while(s.hasNextLine()&&!encontrado)
              {
                  String linea= s.nextLine();
                  Scanner sl= new Scanner(linea);
                  sl.useDelimiter("\\s*;\\s*");
                  try 
                  {
                      if(cod.equals(sl.next()))
                      {
                          contrasenaPassFl.setText(sl.next());
                          if(sl.next().equals(0))
                          {
                              nivel0.setSelected(true);
                              nivel1.setSelected(false);
                          }
                          else
                          {
                              nivel0.setSelected(false);
                              nivel1.setSelected(true);
                          }
                          nombreTxt.setText(sl.next());
                          apellidosTxt.setText(sl.next());
                          correoElectronicoTxt.setText(sl.next());
                          crear=true;
                          lblDinamico.setText("Modificando");
                      }
                      else
                      {
                          contrasenaPassFl.setText("");
                          nombreTxt.setText("");
                          apellidosTxt.setText("");
                          nivel0.setSelected(false);
                          nivel1.setSelected(true);
                          correoElectronicoTxt.setText("");
                          crear=false;
                          lblDinamico.setText("Creando");
                      }
                  } catch (Exception e) {
                      System.out.println("Error al leer el archivo ");
                      e.printStackTrace();
                  }
              }
          }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_loginUsuarioTxtActionPerformed

    public void  guardarDatos(String usuario,String contrasena, int nivelAcceso,String nombre,String apellidos, String correoElectronico){
        try
        {
           FileWriter F1=new FileWriter("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoUsuarios.txt",true);
           PrintWriter pw= new PrintWriter(F1);
           pw.println(usuario+";"+contrasena+";"+nivelAcceso+";"+nombre+";"+apellidos+";"+correoElectronico);
           pw.close();
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al grabar el archivo");
        }
    }
    
    public static  void modificar(String lineaAntigua, String nuevaLinea){ 
       
       File fAntiguo= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoUsuarios.txt");
       File fNuevo= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\temporal.txt");
       String aCadena=lineaAntigua;
       String nCadena=nuevaLinea;
       
       BufferedReader br;
        try {
            if(fAntiguo.exists())
            {
                br=new BufferedReader(new FileReader(fAntiguo));
                String linea;
                while((linea=br.readLine()) != null)
                {
                    if(linea.equals(aCadena))
                        escribir(fNuevo, nCadena);
                    else
                        escribir(fNuevo, linea);
                }
                br.close();
                String nAntiguo=fAntiguo.getName();
                borrar(fAntiguo);
                fNuevo.renameTo(fAntiguo);
            }
            else
                System.out.println("Ficho no existe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
            
   
    
    public static void escribir(File Ffichero,String cadena)
    {
        BufferedWriter bw;
        try 
        {
            if(!Ffichero.exists())
                Ffichero.createNewFile();
            bw= new BufferedWriter(new FileWriter(Ffichero,true));
            bw.write(cadena+"\r\n");
            bw.close();
        }
        catch (Exception ex) {
              ex.printStackTrace();
           } 
    }
    public static  void borrar(File Ffichero){
        try {

            if(Ffichero.exists())
            {
               Ffichero.delete(); 
               System.out.println("Fichero Borrado con Exito");
            }
            } 
           catch (Exception ex) { 
             System.out.println(ex.getMessage());
        }
} 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidosTxt;
    private javax.swing.JPasswordField contrasenaPassFl;
    private javax.swing.JTextField correoElectronicoTxt;
    private javax.swing.ButtonGroup grupoNivelAcceso;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblDinamico;
    private javax.swing.JTextField loginUsuarioTxt;
    private javax.swing.JCheckBox nivel0;
    private javax.swing.JCheckBox nivel1;
    private javax.swing.JTextField nombreTxt;
    // End of variables declaration//GEN-END:variables
}
