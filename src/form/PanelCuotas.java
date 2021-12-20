
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PanelCuotas extends javax.swing.JPanel {
    public static String sAntiguaLinea="";
    public static String sNuevaLinea="";
    public static boolean crear;
    private static Scanner s;
    private static Date fecha;
    private static String balanc="";
    /**
     * Creates new form PanelLocalizacion
     */
    public PanelCuotas() {
        initComponents();
        TextPrompt placeholderIdCuota= new TextPrompt("Obligatorio, debe contener 8 dígitos",idCuotaTxt);
        TextPrompt placeholderIdCliente= new TextPrompt("Obligatorio, debe contener 8 dígitos",idCliente);
        TextPrompt placeholerFecha= new TextPrompt("Autogenerada",fechaCuotaTxt);
         TextPrompt placeholerCobro= new TextPrompt("Obligatorio",cobroTxt);
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
        idCuotaTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        cobroTxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lblDinamico = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fechaCuotaTxt = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        idCliente = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();

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
        add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 130, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("ID cuota");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 79, -1, -1));

        idCuotaTxt.setBorder(null);
        idCuotaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCuotaTxtActionPerformed(evt);
            }
        });
        add(idCuotaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 233, 20));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 233, 10));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Valor de cobro");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        cobroTxt.setBorder(null);
        add(cobroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 233, 20));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 230, 10));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Movimiento cuotas");
        jLabel10.setOpaque(true);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, 40));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 10, 170));
        add(lblDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 80, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Fecha");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        fechaCuotaTxt.setEditable(false);
        fechaCuotaTxt.setBorder(null);
        add(fechaCuotaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 233, 20));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 230, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("ID cuota");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 79, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 233, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("ID cliente");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        idCliente.setBorder(null);
        idCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idClienteActionPerformed(evt);
            }
        });
        add(idCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 233, 20));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 233, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 233, 10));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 233, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void idCuotaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCuotaTxtActionPerformed
        String cod;
        
        boolean encontrado=false;
        cod=idCuotaTxt.getText();
        Scanner s;
        Scanner sl = null;
        File f= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\encabezadoCuota.txt");
        try 
        {
            if(!idCuotaTxt.getText().matches("[0-9]{8}"))//.matches taoma una sub region de algo, en este caso números enteros del 0 al 9
            {
                idCuotaTxt.setText("");
                JOptionPane.showMessageDialog(null,"El id de la cuota solo  acepta valores numérios enteros y debe contener 8 de los mismos","Valor incorrecto",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                
              if(!f.exists())
                  f.createNewFile();
                try 
                {
                    s=new Scanner(f);
                    while(s.hasNextLine()&&!encontrado)
                  {
                      String linea= s.nextLine();
                      sl= new Scanner(linea);
                      sl.useDelimiter("\\s*;\\s*");
                      try 
                      {
                          if(cod.equals(sl.next()))
                          {
                              fechaCuotaTxt.setText(sl.next());
                              idCliente.setText(sl.next());
                              cobroTxt.setText(sl.next());
                              crear=true;
                              encontrado=true;
                              sAntiguaLinea=(idCuotaTxt.getText()+";"+idCliente.getText()+";"+fechaCuotaTxt.getText()+";"+cobroTxt.getText());
                              lblDinamico.setText("Modificando");
                          }
                          else
                          {
                              fechaCuotaTxt.setText(fechaActual());
                              crear=false;
                              encontrado=false;
                              lblDinamico.setText("Creando");

                          }
                      } catch (Exception e) {
                          fechaCuotaTxt.setText(fechaActual());
                          crear=false;
                          encontrado=false;
                          lblDinamico.setText("Creando");
                      }
                  }

                      sl.close();
                      s.close();
                } 
                catch (NullPointerException e) {
                    lblDinamico.setText("Creando");
                    fechaCuotaTxt.setText(fechaActual());
                } 
            }
           
          
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_idCuotaTxtActionPerformed

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
        boolean vacio=true;
        if(!idCuotaTxt.getText().matches("[0-9]{8}"))//.matches taoma una sub region de algo, en este caso números enteros del 0 al 9
            {
                vacio=false;
                idCuotaTxt.setText("");
                JOptionPane.showMessageDialog(null,"El id de la cuota solo acepta valores numérios enteros y debe contener 8 de los mismos","Valor incorrecto",JOptionPane.ERROR_MESSAGE);
            }
        if(!idCliente.getText().matches("[0-9]{8}"))//.matches taoma una sub region de algo, en este caso números enteros del 0 al 9
            {
                vacio=false;
                idCliente.setText("");
                JOptionPane.showMessageDialog(null,"El id del cliente solo acepta valores numérios enteros y debe contener 8 de los mismos","Valor incorrecto",JOptionPane.ERROR_MESSAGE);
            }
        if(idCuotaTxt.getText().isEmpty()||idCliente.getText().isEmpty())
        {
            vacio=false;
        }
        if(Double.parseDouble(cobroTxt.getText())<=0||cobroTxt.getText().isEmpty())
        {
            vacio=false;
            cobroTxt.setText("");
            JOptionPane.showMessageDialog(null,"El valor de cobro solo acepta valores numéricos enteros positivos","Valor incorrecto",JOptionPane.ERROR_MESSAGE);

        }
        if(!vacio)
            JOptionPane.showMessageDialog(null,"Hay campos obligatorios sin completar","Campos vacíos",JOptionPane.ERROR_MESSAGE);
        else
        {
            File f= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\encabezadoCuota.txt");
            if(!crear&&!revisarEnArchivo(f, fechaCuotaTxt.getText()))
            {
                guardarDatos(idCuotaTxt.getText(),fechaCuotaTxt.getText(),idCliente.getText(),balanc);
            }
            else
            {
                String sNuevalinea=idCuotaTxt.getText()+";"+fechaCuotaTxt.getText()+";"+idCliente.getText()+";"+balanc;
                modificar(sAntiguaLinea, sNuevalinea);
            }
                try {
                    File f2 =new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\detallesCuota.txt");
                    f =new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoCobros.txt");
                    if(!f.exists())
                        f.createNewFile();
                    if(!f2.exists())
                        f2.createNewFile();
                    Scanner s= new Scanner(f);
                    Scanner sl=null;
                    int i=1;
                    while(s.hasNext())
                    {
                        String linea= s.nextLine();
                        sl= new Scanner(linea);
                        sl.useDelimiter("\\s*;\\s*");
                        String idCobro=sl.next();
                        String fecha=sl.next();
                        String idCliente=sl.next();
                        if(idCliente.equals(this.idCliente.getText()))
                        {
                         String cuota=sl.next();
                         String concepto=sl.next();
                            guardarDatos2(idCuotaTxt.getText(),fecha, concepto, cuota, idCobro);
                            i++;
                        }
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            idCuotaTxt.setText("");
            fechaCuotaTxt.setText("");
            idCliente.setText("");
            cobroTxt.setText("");
            JOptionPane.showMessageDialog(null, "Movimiento agregado correctamente");
        }
        
        
    }//GEN-LAST:event_lblAgregarMouseClicked

    private void idClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idClienteActionPerformed
    if(!idCliente.getText().matches("[0-9]{8}"))
    {

        idCliente.setText("");
        JOptionPane.showMessageDialog(null,"El id del cliente solo acepta valores númerios enteros con 8 de longitud","Valor incorrecto",JOptionPane.ERROR_MESSAGE);
    }
    else
    {
        File archId= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoClientes.txt");
        if (!archId.exists()) 
        {
            JOptionPane.showMessageDialog(null,"El archivo del id no existe, cree una el id en el respectivo mantenimiento","Archivo inexistente",JOptionPane.ERROR_MESSAGE);

        }
        else
        {
            String cod;
            cod=idCliente.getText();
            if(!revisarEnArchivo2(archId, cod))
            {
                idCliente.setText("");
                JOptionPane.showMessageDialog(null,"El archivo del id no existe, cree una el id en el respectivo mantenimiento","Archivo inexistente",JOptionPane.ERROR_MESSAGE);

            }
        }
    }        
    }//GEN-LAST:event_idClienteActionPerformed

    public void  guardarDatos2(String idCuota,String sec,String concepto,String cuota,String idCobro){
        try
        {
           FileWriter F1=new FileWriter("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\detallesCuota.txt",true);
           PrintWriter pw= new PrintWriter(F1);
           pw.println(sec+";"+idCuota+";"+cuota+";"+concepto+";"+idCobro);
           pw.close();
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al grabar el archivo");
        }
    }
    
    public void  guardarDatos(String id,String fecha,String idCliente,String balance){
        try
        {
           FileWriter F1=new FileWriter("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\encabezadoCuota.txt",true);
           PrintWriter pw= new PrintWriter(F1);
           pw.println(id+";"+fecha+";"+idCliente+";"+balance);
           pw.close();
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al grabar el archivo");
        }
    }
    
     public String fechaActual()
    {
        Date fechaA= new Date();
        SimpleDateFormat formato= new SimpleDateFormat("dd/MM/YYYY");
        return formato.format(fechaA);
    }
    
     public boolean revisarEnArchivo(File archivo, String id)
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
                  if(linea.contains(id))
                  {
                    sl.next();
                    return true;
                  }
                      
                } 
            }
            catch (FileNotFoundException ex) {
                ex.printStackTrace();
                return false;
            }
        }
        
        return false;
    }
     
    public boolean revisarEnArchivo2(File archivo, String id)
    {
        if (!archivo.exists()) {
            return false;
        }
        else
        {
            try 
            {
                Scanner sca=new Scanner(archivo);
                Scanner sca2 = null;
                while(sca.hasNextLine())
                {
                  String linea= sca.nextLine();
                  if(linea.contains(id))
                  {
                        sca2= new Scanner(linea);
                        sca2.useDelimiter("\\s*;\\s*");
                        for (int i = 0; i < 9; i++) 
                        {
                            sca2.next();
                        }
                        String estatus=sca2.next();
                        String tipo=sca2.next();
                        System.out.println(tipo);
                        System.out.println(estatus);
                        sca2.next();
                        balanc=sca2.next();
                        if(estatus.equals("activo")&&tipo.equals("activo"))
                          return true;

                      else
                      {
                          JOptionPane.showMessageDialog(null,"El estatus y tipo del"
                                  + " cliente no son los correctos, cambie en mantenimiento","Estatus y tipo incorrecto",JOptionPane.ERROR_MESSAGE);
                          return false;
                      }
                  }
                  
                } 
            }
            catch (FileNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null,"El estatus y tipo del"
                              + " cliente no son los correctos, cambie en mantenimiento","Estatus y tipo incorrecto",JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
     

    
    public static  void modificar(String lineaAntigua, String nuevaLinea){ 
       
       File fAntiguo= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\encabezadoCuota.txt");
       File fNuevo= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\temporal.txt");
       
       BufferedReader br;
        try {
            if(fAntiguo.exists())
            {
                br=new BufferedReader(new FileReader(fAntiguo));
                String linea;
                while((linea=br.readLine()) != null)
                {
                    
                    if(linea.equals(lineaAntigua)){
                        escribir(fNuevo, nuevaLinea);
                    }
                        
                    else{
                        escribir(fNuevo, linea);
                    }
                        
                }
                br.close();
                File auxiliar= new File(fAntiguo.getAbsolutePath());
                borrar(fAntiguo);
                System.out.println(fNuevo.renameTo(auxiliar));
            }
            else
                System.out.println("El archivo no existe");
        } catch (Exception e) 
        {
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
    private javax.swing.JTextField cobroTxt;
    private javax.swing.JTextField fechaCuotaTxt;
    private javax.swing.JTextField idCliente;
    private javax.swing.JTextField idCuotaTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblDinamico;
    // End of variables declaration//GEN-END:variables
}
