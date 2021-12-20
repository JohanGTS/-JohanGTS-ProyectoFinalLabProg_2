
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

public class PanelGenerarCobros extends javax.swing.JPanel {
    public static double cuota;
    public static int aux=0;
    /**
     * Creates new form PanelHorarioActividades
     */
    public PanelGenerarCobros() {
        initComponents();
        TextPrompt placeholderDiaActividad= new TextPrompt("Obligatorio     MM/AAAA",diaActividadTxt);
        TextPrompt placeholderConcepto= new TextPrompt("Obligatorio",conceptoCobrotxt);
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
        conceptoCobrotxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

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

        conceptoCobrotxt.setBorder(null);
        add(conceptoCobrotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 233, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Concepto");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 250, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
        
        boolean vacio=true;
        
        String fechaBruta="";
        try {
            
            if(diaActividadTxt.getText().isEmpty())
                vacio=false;
            if(conceptoCobrotxt.getText().isEmpty()||conceptoCobrotxt.getText().length()<4)
            {
                vacio=false;
                JOptionPane.showMessageDialog(null,"El concepto debe tener al menos cuatro letras","Longitud insuficiente",JOptionPane.ERROR_MESSAGE);
            }
            
            else
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
                    File f2= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoClientes.txt");
                    s= new Scanner(f2);
                    while(s.hasNext())
                    {
                        String nuevaLinea="";
                        String linea=s.nextLine();
                        String antiguaLinea=linea;
                        sl= new Scanner(linea);
                        sl.useDelimiter("\\s*;\\s*");
                        String idCliente=sl.next();
                        nuevaLinea+=idCliente+";";
                        for (int i = 0; i < 9; i++) 
                        {
                            System.out.println(i);
                            nuevaLinea+=sl.next()+";";
                        }
                        String status=sl.next();
                        String tipo=sl.next();
                        nuevaLinea+=status+";"+tipo+";";
                        
                        if(status.equals("activo"))
                        {
                            Double balance = Double.parseDouble(sl.next());
                            cuota=Double.parseDouble(sl.next());
                            balance+=cuota;
                            nuevaLinea+=balance+";"+cuota;
                            int id=generarIdCobro(f);
                            String linea2=id+";"+fechaBruta+";"+idCliente+";"+cuota+";"+conceptoCobrotxt.getText();
                            guardarDatos(id,fechaBruta,idCliente,cuota,conceptoCobrotxt.getText());
                            guardarDatos2(linea2, idCliente, fechaBruta);
                        }
                        sl.close();
                        modificar(antiguaLinea,nuevaLinea );
                        
                    }
                    s.close();
                    
                    diaActividadTxt.setText("");
                    conceptoCobrotxt.setText("");
                    File fAntiguo= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoClientes.txt");
                    File fNuevo= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\temporal.txt");
                    File auxiliar= new File(fAntiguo.getAbsolutePath());
                    borrar(fAntiguo);
                    System.out.println(fNuevo.renameTo(auxiliar));
                    JOptionPane.showMessageDialog(null, "Cobro generado");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Cobro ya realizado anteriormente", "Cobro realizado anteriormente",JOptionPane.ERROR_MESSAGE);
                    diaActividadTxt.setText("");
                }
            }
            
        } catch (FileNotFoundException ex) {   
            Logger.getLogger(PanelGenerarCobros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PanelGenerarCobros.class.getName()).log(Level.SEVERE, null, ex);
        }   
                
            
        
    }//GEN-LAST:event_lblAgregarMouseClicked
    public void  guardarDatos2(String linea,String idCliente,String fechaCuota){
        try
        {
           File pdf= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\Pdf\\pdf"+idCliente+".txt");
           pdf.createNewFile();
           FileWriter F1=new FileWriter("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\Pdf\\pdf"+idCliente+".txt",true);
           PrintWriter pw= new PrintWriter(F1);
           pw.println(linea);
           pw.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error gDatos2");
        }
    }
    
    public void  guardarDatos(int id,String fecha,String idCliente,Double valorCuota, String conceptoC){
        try
        {
           FileWriter F1=new FileWriter("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoCobros.txt",true);
           PrintWriter pw= new PrintWriter(F1);
           pw.println(id+";"+fecha+";"+idCliente+";"+valorCuota+";"+conceptoC+";"+"false");
           pw.close();
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al grabar el archivo");
        }
    }

public static int generarIdCobro(File f)
{
        return (int)(Math.random()*80000000+1);
}
    
public static boolean revisarEnArchivo(File archivo, String id) throws FileNotFoundException
    {
        Scanner s=new Scanner(archivo);
        if (!archivo.exists()) {
            s.close();
            return false;
        }
        else
        {
            try 
            {
                Scanner sl = null;
                while(s.hasNextLine())
                {
                  String linea= s.nextLine();
                  sl= new Scanner(linea);
                  sl.useDelimiter("\\s*;\\s*");
                    try {
                        System.out.println(sl.next());
                        if(id.equals(sl.next()))
                        {
                            s.close();
                            return true;
                        }
                        else{
                            s.close();
                            return false;
                        }
                    } catch (Exception e) {
                        s.close();
                        return false;
                    }
                  
                } 
            }
            catch (Exception ex) {
                Logger.getLogger(PanelSalas.class.getName()).log(Level.SEVERE, null, ex);
                s.close();
                return false;
            }
        }
        s.close();
        return false;
    }    

    public static  void modificar(String lineaAntigua, String nuevaLinea) throws IOException{ 
       
       File fAntiguo= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoClientes.txt");
       File fNuevo= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\temporal.txt");
       fAntiguo.createNewFile();
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
                    }
                        
                }
                br.close();
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
    private javax.swing.JTextField conceptoCobrotxt;
    private javax.swing.JTextField diaActividadTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblDinamico;
    // End of variables declaration//GEN-END:variables
}
