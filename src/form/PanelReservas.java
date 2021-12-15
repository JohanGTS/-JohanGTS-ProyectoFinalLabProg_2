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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Marte
 */
public class PanelReservas extends javax.swing.JPanel {
    public static String sAntiguaLinea="";
    public static String sNuevaLinea="";
    public static boolean crear;
    public static Date fecha;
    public static final SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Creates new form PanelReservas
     */
    public PanelReservas() {
        initComponents();
        TextPrompt placeholderIdReserva= new TextPrompt("Obligatorio, debe contener 8 dígitos",idReservaTxt);
        TextPrompt placeholderIdSalaReserva= new TextPrompt("Obligatorio, debe contener 8 dígitos",idSalaReservaTxt);
        TextPrompt placeholderIdClienteReserva= new TextPrompt("Obligatorio, debe contener 8 dígitos",idClienteReservaTxt);
        TextPrompt placeholderHorarioReserva= new TextPrompt("Obligatorio",horarioReservaTxt);
        TextPrompt placeholderFechaReserva= new TextPrompt("Obligatorio     DD/MM/AAAA",fechaReservaTxt);
        grupoEstado.add(reservado);
        grupoEstado.add(noReservado);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoEstado = new javax.swing.ButtonGroup();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idSalaReservaTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        idClienteReservaTxt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        fechaReservaTxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblAgregar = new javax.swing.JLabel();
        lblDinamico = new javax.swing.JLabel();
        idReservaTxt = new javax.swing.JTextField();
        horarioReservaTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        reservado = new javax.swing.JCheckBox();
        noReservado = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Registrar nueva Reserva");
        jLabel10.setOpaque(true);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 250, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("ID Reserva");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        idSalaReservaTxt.setBorder(null);
        add(idSalaReservaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 233, 20));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 250, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("ID Sala Reserva");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 218, 250, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("ID Cliente Reserva");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 20));

        idClienteReservaTxt.setBorder(null);
        add(idClienteReservaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 233, 20));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 250, 10));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 10, 340));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Fecha Reserva");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 79, -1, -1));

        fechaReservaTxt.setBorder(null);
        add(fechaReservaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 233, 20));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 230, 10));

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
        add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 130, 40));
        add(lblDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 80, 20));

        idReservaTxt.setBorder(null);
        idReservaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idReservaTxtActionPerformed(evt);
            }
        });
        add(idReservaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 233, 20));

        horarioReservaTxt.setBorder(null);
        add(horarioReservaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 233, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Horario de reserva");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 250, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Estado de reserva");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 250, -1));

        reservado.setText("Reservado");
        add(reservado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        noReservado.setSelected(true);
        noReservado.setText("No reservado");
        add(noReservado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void idReservaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idReservaTxtActionPerformed
        int cod;
        String estado="";
        cod=Integer.parseInt(idReservaTxt.getText());
        boolean encontrado=false;
        File archivoReservas= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoReservas.txt");
        Scanner s;    
            try {
                s= new Scanner(archivoReservas);
                if(!archivoReservas.exists())
                {
                    archivoReservas.createNewFile();
                }
                while(s.hasNext()&&!encontrado)
                {
                    String linea=s.nextLine();
                    Scanner sl= new Scanner(linea);
                    sl.useDelimiter("\\s*;\\s*");
                    if(cod==Integer.parseInt(sl.next())){
                        idSalaReservaTxt.setText(sl.next());
                        idClienteReservaTxt.setText(sl.next());
                        fechaReservaTxt.setText(sl.next());
                        horarioReservaTxt.setText(sl.next());
                        if(sl.next().equals("reservado"))
                        {
                            estado="reservado";
                            reservado.setSelected(true);
                            noReservado.setSelected(false);
                        }
                        else
                        {
                            estado="no reservado";
                            reservado.setSelected(false);
                            noReservado.setSelected(true);
                        }
                            
                        lblDinamico.setText("Modificando");
                        sAntiguaLinea=(idReservaTxt.getText()+";"+idSalaReservaTxt.getText()+";"+idClienteReservaTxt.getText()+";"+
                                fechaReservaTxt.getText()+";"+horarioReservaTxt.getText()+";"+estado);
                        encontrado=true;
                        crear=true;
                    }
                    else{
                        lblDinamico.setText("Creando");
                        idSalaReservaTxt.setText("");
                        idClienteReservaTxt.setText("");
                        fechaReservaTxt.setText("");
                        horarioReservaTxt.setText("");
                        reservado.setSelected(false);
                        noReservado.setSelected(true);
                        crear=false;
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
    }//GEN-LAST:event_idReservaTxtActionPerformed

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
        
        boolean vacio=true;
        
        
        try {
            if(idReservaTxt.getText().equals("")||idClienteReservaTxt.getText().equals("")||idSalaReservaTxt.getText().equals("")||
            fechaReservaTxt.getText().equals("")||horarioReservaTxt.getText().equals(""))
                vacio=false;
            
            if(!idReservaTxt.getText().matches("[0-9]{8}"))
            {
                vacio=false;
                idReservaTxt.setText("");
                JOptionPane.showMessageDialog(null,"El id de reserva solo acepta valores númerios enteros","Valor incorrecto",JOptionPane.ERROR_MESSAGE);
            }
            if(!idSalaReservaTxt.getText().matches("[0-9]{8}"))
            {
                vacio=false;
                idSalaReservaTxt.setText("");
                JOptionPane.showMessageDialog(null,"El id de la sala de reserva solo acepta valores númerios enteros","Valor incorrecto",JOptionPane.ERROR_MESSAGE);
            }
            if(!idClienteReservaTxt.getText().matches("[0-9]{8}"))
            {
                vacio=false;
                idClienteReservaTxt.setText("");
                JOptionPane.showMessageDialog(null,"El id deL cliente que reserva solo acepta valores númerios enteros","Valor incorrecto",JOptionPane.ERROR_MESSAGE);
            }
            if(!fechaReservaTxt.getText().isEmpty())
            {
                
                String fechaBruta=fechaReservaTxt.getText();
                String[] separada=fechaBruta.split("/");
                try {
                    if(Integer.parseInt(separada[0])>0&&Integer.parseInt(separada[0])<32&&
                        Integer.parseInt(separada[1])>0&&Integer.parseInt(separada[1])<13&&
                        Integer.parseInt(separada[2])>2000)
                    {
                        try 
                        {
                            fecha=formato.parse((fechaBruta));
                            System.out.println(formato.format(fecha));
                        } 
                        catch (ParseException ex) {
                            ex.printStackTrace();
                        }
                    }
                else
                    {
                        JOptionPane.showMessageDialog(null,"Formato de fecha incorrecto","Formato de fecha incorrecto",JOptionPane.ERROR_MESSAGE);
                        fechaReservaTxt.setText("");
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Solo se pueden poner números del 0 al 9","Formato de fecha incorrecto",JOptionPane.ERROR_MESSAGE);
                    fechaReservaTxt.setText("");
                }
            }
            
            
            if(!vacio)
                JOptionPane.showMessageDialog(null,"Hay campos obligatorios sin completar","Campos vacíos",JOptionPane.ERROR_MESSAGE);
            
            else
            {
                int idReserva=Integer.parseInt(idReservaTxt.getText());
                int idSala=Integer.parseInt(idSalaReservaTxt.getText());
                int idCliente=Integer.parseInt(idClienteReservaTxt.getText());
                Date fechas=fecha;
                String horario=horarioReservaTxt.getText();
                String estado="no reservado";
                if(reservado.isSelected())
                    estado="reservado";
                if(!crear)
                    guardarDatos(idReserva, idSala, idCliente, fechas, horario, estado);
                else
                {
                    sNuevaLinea=(idReserva+";"+idSala+";"+idCliente+";"+formato.format(fechas)+";"+horario+";"+estado);
                    modificar(sAntiguaLinea,sNuevaLinea);
                }
                JOptionPane.showMessageDialog(null, "Reserva agregada correctamente");
                idClienteReservaTxt.setText("");
                idReservaTxt.setText("");
                reservado.setSelected(false);
                noReservado.setSelected(true);
                idSalaReservaTxt.setText("");
                fechaReservaTxt.setText("");
                horarioReservaTxt.setText("");
                }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lblAgregarMouseClicked
public void  guardarDatos(int idReserva,int idSalaReserva, int idClienteReserva,Date reserva,String horario, String estado){
        try
        {
           FileWriter F1=new FileWriter("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoReservas.txt",true);
           PrintWriter pw= new PrintWriter(F1);
           pw.println(idReserva+";"+idSalaReserva+";"+idClienteReserva+";"+formato.format(reserva)+";"+horario+";"+estado);
           pw.close();
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al grabar el archivo");
        }
    }
    
    public static  void modificar(String lineaAntigua, String nuevaLinea){ 
       
       File fAntiguo= new File("C:\\-JohanGTS-ProyectoFinalLabProg_2\\src\\ArchivosDeTexto\\archivoReservas.txt");
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
                        escribir(fNuevo, linea);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fechaReservaTxt;
    private javax.swing.ButtonGroup grupoEstado;
    private javax.swing.JTextField horarioReservaTxt;
    private javax.swing.JTextField idClienteReservaTxt;
    private javax.swing.JTextField idReservaTxt;
    private javax.swing.JTextField idSalaReservaTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblDinamico;
    private javax.swing.JCheckBox noReservado;
    private javax.swing.JCheckBox reservado;
    // End of variables declaration//GEN-END:variables
}
