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
public class PanelHorarioActividades extends javax.swing.JPanel {
    public static String sAntiguaLinea="";
    public static String sNuevaLinea="";
    public static boolean crear;
    private static Scanner s;
    /**
     * Creates new form PanelHorarioActividades
     */
    public PanelHorarioActividades() {
        initComponents();
        TextPrompt placeholderIdHorarioAct= new TextPrompt("Obligatorio, debe contener 8 dígitos",idHorarioActividadTxt);
        TextPrompt placeholderDiaActividad= new TextPrompt("Obligatorio     DD/MM/AAAA",diaActividadTxt);
        TextPrompt placeholderHoraActividad= new TextPrompt("Obligatorio    HH:MM en formato 24 horas",horaActividadTxt);
        TextPrompt placeholderIdActividad= new TextPrompt("Obligatorio, debe contener 8 dígitos",idActividadTxt);
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
        jLabel2 = new javax.swing.JLabel();
        diaActividadTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        horaActividadTxt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        idActividadTxt = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lblAgregar = new javax.swing.JLabel();
        lblDinamico = new javax.swing.JLabel();
        idHorarioActividadTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Registrar nuevo Horario Actividad");
        jLabel10.setOpaque(true);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("ID Horario Actividad");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        diaActividadTxt.setBorder(null);
        add(diaActividadTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 233, 20));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 250, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Dia Actividad");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 218, 250, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Hora Actividad");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 20));

        horaActividadTxt.setBorder(null);
        add(horaActividadTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 233, 20));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 250, 10));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 10, 340));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("ID Actividad");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        idActividadTxt.setBorder(null);
        add(idActividadTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 233, 20));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 230, 10));

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
        add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 130, 40));
        add(lblDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 80, 20));

        idHorarioActividadTxt.setBorder(null);
        idHorarioActividadTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idHorarioActividadTxtActionPerformed(evt);
            }
        });
        add(idHorarioActividadTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 233, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void idHorarioActividadTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idHorarioActividadTxtActionPerformed
        int cod;
        cod=Integer.parseInt(idHorarioActividadTxt.getText());
        boolean encontrado=false;
        File f= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoHorarioActividades.txt");
        Scanner s;  
        Scanner sl=null;
            try {
                
                if(!f.exists())
                    f.createNewFile();
                try
                {
                   s= new Scanner(f);
                while(s.hasNext()&&!encontrado)
                {
                    String linea=s.nextLine();
                    sl= new Scanner(linea);
                    sl.useDelimiter("\\s*;\\s*");
                    if(cod==Integer.parseInt(sl.next())){
                        diaActividadTxt.setText(sl.next());
                        horaActividadTxt.setText(sl.next());
                        idActividadTxt.setText(sl.next());
                            
                        lblDinamico.setText("Modificando");
                        sAntiguaLinea=(idHorarioActividadTxt.getText()+";"+diaActividadTxt.getText()+";"+horaActividadTxt.getText()+";"+
                                idActividadTxt.getText());
                        encontrado=true;
                        crear=true;
                    }
                    else{
                        lblDinamico.setText("Creando");
                        idActividadTxt.setText("");
                        diaActividadTxt.setText("");
                        horaActividadTxt.setText("");
                        crear=false;
                    }
                }
                s.close();
                sl.close();
                } catch (NullPointerException e) {
                    lblDinamico.setText("Creando");
                }
               
            } 
            catch (FileNotFoundException e)
            {
                JOptionPane.showMessageDialog(null, "Archivo de texto no encontrado");
            } catch (IOException ex) 
            {
                ex.printStackTrace();
            }
    }//GEN-LAST:event_idHorarioActividadTxtActionPerformed

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
        
        boolean vacio=true;
        File f= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoHorarioActividades.txt");
        
        try {
            if(!f.exists())
                f.createNewFile();
            
            if(idActividadTxt.getText().equals("")||idHorarioActividadTxt.getText().equals("")||horaActividadTxt.getText().equals("")||
            diaActividadTxt.getText().equals(""))
                vacio=false;
            if(!idActividadTxt.getText().matches("[0-9]{8}"))
            {
                vacio=false;
                idActividadTxt.setText("");
                JOptionPane.showMessageDialog(null,"El id de la actividad solo acepta valores númerios enteros","Valor incorrecto",JOptionPane.ERROR_MESSAGE);
            }
            else 
            {
                File archId= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoActividades.txt");
                if (!archId.exists()) 
                {
                    JOptionPane.showMessageDialog(null,"El archivo del id no existe, cree una el id en el respectivo mantenimiento","Archivo inexistente",JOptionPane.ERROR_MESSAGE);
                    vacio=false;
                }
                else
                {
                    int cod;
                    cod=Integer.parseInt(idActividadTxt.getText());
                    if(!revisarEnArchivo(archId, cod))
                    {
                        idActividadTxt.setText("");
                        JOptionPane.showMessageDialog(null,"El archivo del id no existe, cree una el id en el respectivo mantenimiento","Archivo inexistente",JOptionPane.ERROR_MESSAGE);
                        vacio=false;
                    }
                }
            }
            
            if(!idHorarioActividadTxt.getText().matches("[0-9]{8}"))
            {
                vacio=false;
                idHorarioActividadTxt.setText("");
                JOptionPane.showMessageDialog(null,"El id del horario la actividad solo acepta valores númerios enteros","Valor incorrecto",JOptionPane.ERROR_MESSAGE);
            }
            if(!diaActividadTxt.getText().isEmpty())
            {
                
                String fechaBruta=diaActividadTxt.getText();
                String[] separada=fechaBruta.split("/");
                try {
                    if(Integer.parseInt(separada[0])>0&&Integer.parseInt(separada[0])<32&&
                        Integer.parseInt(separada[1])>0&&Integer.parseInt(separada[1])<13&&
                        Integer.parseInt(separada[2])>2000)
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
            if(!horaActividadTxt.getText().isEmpty())
            {
                
                String horaBruta=horaActividadTxt.getText();
                String[] separada=horaBruta.split(":");
                try {
                    if(Integer.parseInt(separada[0])>=0&&Integer.parseInt(separada[0])<24&&
                        Integer.parseInt(separada[1])>=0&&Integer.parseInt(separada[1])<60)
                    {
                        System.out.println("hora correcta");
                    }
                else
                    {
                        JOptionPane.showMessageDialog(null,"Formato de hora incorrecto","Formato de fecha incorrecto",JOptionPane.ERROR_MESSAGE);
                        horaActividadTxt.setText("");
                        vacio=false;
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Solo se pueden poner números del 0 al 9","Formato de fecha incorrecto",JOptionPane.ERROR_MESSAGE);
                    horaActividadTxt.setText("");
                    vacio=false;
                }
            }
            
            if(!vacio)
                JOptionPane.showMessageDialog(null,"Hay campos obligatorios sin completar","Campos vacíos",JOptionPane.ERROR_MESSAGE);
            else
            {   
                int idHorario=Integer.parseInt(idHorarioActividadTxt.getText());
                String dia=diaActividadTxt.getText();
                String hora=horaActividadTxt.getText();
                int idActividad=Integer.parseInt(idActividadTxt.getText());
                
                if(!crear)
                    guardarDatos(idHorario, dia, hora, idActividad);
                else
                {
                    sNuevaLinea=(idHorario+";"+dia+";"+hora+";"+idActividad);
                    modificar(sAntiguaLinea,sNuevaLinea);
                }
                JOptionPane.showMessageDialog(null, "Reserva agregada correctamente");
                idActividadTxt.setText("");
                idHorarioActividadTxt.setText("");
                horaActividadTxt.setText("");
                diaActividadTxt.setText("");
                }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lblAgregarMouseClicked
public void  guardarDatos(int idHorario,String dia,String hora,int idActividad){
        try
        {
           FileWriter F1=new FileWriter("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoHorarioActividades.txt",true);
           PrintWriter pw= new PrintWriter(F1);
           pw.println(idHorario+";"+dia+";"+hora+";"+idActividad);
           pw.close();
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al grabar el archivo");
        }
    }
    
    public static  void modificar(String lineaAntigua, String nuevaLinea){ 
       
       File fAntiguo= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoHorarioActividades.txt");
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
                    if(linea.equals(aCadena)){
                        escribir(fNuevo, nCadena);
                    }
                        
                    else{
                        System.out.println("c");
                    }
                        
                }
                br.close();
                String nAntiguo=fAntiguo.getName();
                File auxiliar= new File(fAntiguo.getAbsolutePath());
                borrar(fAntiguo);
                System.out.println(fNuevo.renameTo(auxiliar));
            }
            else
                System.out.println("Archivo no existe");
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
    public boolean revisarEnArchivo(File archivo, int id)
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
                  if(id==Integer.parseInt(sl.next()))
                      return true;
                  else
                      return false;
                } 
            }
            catch (FileNotFoundException ex) {
                Logger.getLogger(PanelSalas.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diaActividadTxt;
    private javax.swing.JTextField horaActividadTxt;
    private javax.swing.JTextField idActividadTxt;
    private javax.swing.JTextField idHorarioActividadTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblDinamico;
    // End of variables declaration//GEN-END:variables
}
