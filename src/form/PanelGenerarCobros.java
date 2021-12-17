/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import Placeholder.TextPrompt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Marte
 */
public class PanelGenerarCobros extends javax.swing.JPanel {
    
    /**
     * Creates new form PanelHorarioActividades
     */
    public PanelGenerarCobros() {
        initComponents();
        TextPrompt placeholderDiaActividad= new TextPrompt("Obligatorio     MM/AAAA",diaActividadTxt);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        diaActividadTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        lblAgregar = new javax.swing.JLabel();
        lblDinamico = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Generar cobro");
        jLabel10.setOpaque(true);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 40));

        diaActividadTxt.setBorder(null);
        add(diaActividadTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 233, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Fecha cobro");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 250, -1));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 10, 340));

        lblAgregar.setBackground(new java.awt.Color(0, 0, 0));
        lblAgregar.setFont(new java.awt.Font("Californian FB", 0, 18)); // NOI18N
        lblAgregar.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregar.setText("Generar");
        lblAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregar.setOpaque(true);
        lblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarMouseClicked(evt);
            }
        });
        add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 130, 40));
        add(lblDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 80, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
        
        boolean vacio=true;
        
        String fechaBruta="";
        try {
            
            if(diaActividadTxt.getText().equals(""))
                vacio=false;
            
            if(!diaActividadTxt.getText().isEmpty())
            {
                String auxiliar="30/";
                fechaBruta=auxiliar+diaActividadTxt.getText();
                String[] separada=fechaBruta.split("/");
                try {
                    if(Integer.parseInt(separada[1])>0&&Integer.parseInt(separada[1])<13&&
                        Integer.parseInt(separada[2])>1900)
                    {
                        System.out.println("Dia correcto");
                    }
                else
                    {
                        JOptionPane.showMessageDialog(null,"Formato de día incorrecto","Formato de fecha incorrecto",JOptionPane.ERROR_MESSAGE);
                        diaActividadTxt.setText("");
                        vacio=false;
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Solo se pueden poner números del 0 al 9","Formato de fecha incorrecto",JOptionPane.ERROR_MESSAGE);
                    diaActividadTxt.setText("");
                    vacio=false;
                }
            }
            
            if(!vacio)
                JOptionPane.showMessageDialog(null,"Hay campos obligatorios sin completar","Campos vacíos",JOptionPane.ERROR_MESSAGE);
            else
            {   
                Scanner s;
                Scanner sl=null;
                File f= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoCobros.txt");
                if(!f.exists())
                    f.createNewFile();
                
                if(!revisarEnArchivo(f, fechaBruta))
                {
                    guardarDatos(fechaBruta, "false");
                    File f2= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoClientes.txt");
                    s= new Scanner(f2);
                    while(s.hasNext())
                    {
                        String nuevaLinea="";
                        String linea=s.nextLine();
                        String antiguaLinea=linea;
                        sl= new Scanner(linea);
                        sl.useDelimiter("\\s*;\\s*");
                        for (int i = 0; i < 10; i++) 
                        {
                            nuevaLinea+=sl.next()+";";
                        }
                        String status=sl.next();
                        String tipo=sl.next();
                        nuevaLinea+=status+";"+tipo+";";
                        
                        if(status.equals("activo"))
                        {
                            Double balance = Double.parseDouble(sl.next());
                            Double cuota=Double.parseDouble(sl.next());
                            balance+=cuota;
                            nuevaLinea+=balance+";"+cuota;
                        }
                        System.out.println(nuevaLinea);
                        sl.close();
                        System.out.println("******************");
                        modificar(antiguaLinea,nuevaLinea );
                    }
                    s.close();
                    JOptionPane.showMessageDialog(null, "Cobro generado");
                    diaActividadTxt.setText("");
                    File fAntiguo= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoClientes.txt");
                    File fNuevo= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\temporal.txt");
                     File auxiliar= new File(fAntiguo.getAbsolutePath());
                    borrar(fAntiguo);
                    System.out.println(fNuevo.renameTo(auxiliar));
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Cobro ya realizado anteriormetne", "Cobro realizado anteriormetne",JOptionPane.ERROR_MESSAGE);
                    diaActividadTxt.setText("");
                }
                
                
            }
            
        } catch (FileNotFoundException ex) {   
            Logger.getLogger(PanelGenerarCobros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PanelGenerarCobros.class.getName()).log(Level.SEVERE, null, ex);
        }   
                
            
        
    }//GEN-LAST:event_lblAgregarMouseClicked
public void  guardarDatos(String id,String tipo){
        try
        {
           FileWriter F1=new FileWriter("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoCobros.txt",true);
           PrintWriter pw= new PrintWriter(F1);
           pw.println(id+";"+tipo);
           pw.close();
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al grabar el archivo");
        }
    }
    
public static boolean revisarEnArchivo(File archivo, String id)
    {
        if (!archivo.exists()) {
            return false;
        }
        else
        {
            try 
            {
                Scanner s=new Scanner(archivo);
                Scanner sl = null;
                while(s.hasNextLine())
                {
                  String linea= s.nextLine();
                  sl= new Scanner(linea);
                  sl.useDelimiter("\\s*;\\s*");
                    try {
                        if(id.equals(sl.next()))
                        return true;
                    else
                        return false;
                    } catch (Exception e) {
                        return false;
                    }
                  
                } 
            }
            catch (Exception ex) {
                Logger.getLogger(PanelSalas.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        return false;
    }    

    public static  void modificar(String lineaAntigua, String nuevaLinea) throws IOException{ 
       
       File fAntiguo= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoClientes.txt");
       File fNuevo= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\temporal.txt");
       fAntiguo.createNewFile();
       String aCadena=lineaAntigua;
       String nCadena=nuevaLinea;
       
       BufferedReader br;
        try {
            if(fAntiguo.exists())
            {
                br=new BufferedReader(new FileReader(fAntiguo));
                String linea;
                String id[]= lineaAntigua.split(";");
                while((linea=br.readLine()) != null)
                {
                    if(!linea.contains(id[0])){
                        escribir(fNuevo, nCadena);
                        System.out.println("no");
                    }
                        
                }
                br.close();
                String nAntiguo=fAntiguo.getName();
                File auxiliar= new File(fAntiguo.getAbsolutePath());
                borrar(fAntiguo);
                System.out.println(fNuevo.renameTo(auxiliar));
            }
            else
                System.out.println("El archivo no existe");
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
                System.out.println(Ffichero.delete());
            }
            } 
           catch (Exception ex) { 
             System.out.println(ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diaActividadTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblDinamico;
    // End of variables declaration//GEN-END:variables
}
