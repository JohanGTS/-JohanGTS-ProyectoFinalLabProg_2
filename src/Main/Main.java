/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import form.PanelActividades;
import form.PanelClientes;
import form.PanelCuotas;
import form.PanelEntrenador;
import form.PanelEstadoReserva;
import form.PanelHorarioActividades;
import form.PanelLocalizacion;
import form.PanelReservaActividades;
import form.PanelReservas;
import form.PanelSalas;
import form.PanelUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import menu.MenuItem;
import Login.Login;

/**
 *
 * @
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    int nivelAcceso;
    public Main() {
        initComponents();
        nivelAcceso=Login.nivelAccesoLogin;
        execute();
    }

    private void execute() {
        ImageIcon iconMantenimiento = new ImageIcon(getClass().getResource("/menu/mantenimiento.png"));
        ImageIcon iconMovimiento = new ImageIcon(getClass().getResource("/menu/motion.png"));
        ImageIcon iconProcesos = new ImageIcon(getClass().getResource("/menu/process.png"));
        ImageIcon iconConsultas = new ImageIcon(getClass().getResource("/menu/survey.png"));
        ImageIcon iconSalir = new ImageIcon(getClass().getResource("/menu/salida.png"));
        ImageIcon iconMessage = new ImageIcon(getClass().getResource("/menu/message.png"));
        ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("/menu/subMenu.png"));
        ImageIcon iconNext = new ImageIcon(getClass().getResource("/menu/next.png"));
        
        
        //  subMenu del Mantenimiento
        MenuItem menuUsuario = new MenuItem(iconSubMenu, "Usuario", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(nivelAcceso==0){
                panelBody.removeAll();
                panelBody.add(new PanelUsuario());
                panelBody.repaint();
                panelBody.revalidate();
                }
            }
        });
        MenuItem menuEntrenador = new MenuItem(iconSubMenu, "Entrenador",new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
                panelBody.add(new PanelEntrenador());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });     
        MenuItem menuLocalizacion = new MenuItem(iconSubMenu, "Localizacion", new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
                panelBody.add(new PanelLocalizacion());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        MenuItem menuSalas = new MenuItem(iconSubMenu, "Salas", new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
                panelBody.add(new PanelSalas());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        MenuItem menuActividad = new MenuItem(iconSubMenu, "Actividad", new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
                panelBody.add(new PanelActividades());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        MenuItem menuHorarioActividad = new MenuItem(iconSubMenu, "Horario Actividad", new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
                panelBody.add(new PanelHorarioActividades());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        MenuItem menuClientes = new MenuItem(iconSubMenu, "Clientes", new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
                panelBody.add(new PanelClientes());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        MenuItem menuEstadoReserva = new MenuItem(iconSubMenu, "Estado Reservas", new ActionListener(){
          @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
                panelBody.add(new PanelEstadoReserva());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        MenuItem menuReserva = new MenuItem(iconSubMenu, "Reserva", new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
                panelBody.add(new PanelReservas());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        MenuItem menuReservasActividades = new MenuItem(iconSubMenu, "Reservas Actividades", new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
                panelBody.add(new PanelReservaActividades());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });

        //  SubMenu del Movimiento 
        MenuItem menuCuotas = new MenuItem(iconSubMenu, "Cuotas", new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
                panelBody.add(new PanelCuotas());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
       
        
        //  SubMenu del Procesos 
        MenuItem menuGenerarCobro = new MenuItem(iconSubMenu, "Generar Cobro", null);
        MenuItem menuReservarCobro = new MenuItem(iconSubMenu, "Reservar Cobro", null);
        MenuItem menuActualizarCuotas = new MenuItem(iconSubMenu, "Actualizar Cuotas", null);
       
        


        //  SubMenu del Consultas
        MenuItem menuusuario = new MenuItem(iconSubMenu, "Usuario", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
                panelBody.add(new PanelUsuario());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        
        
        MenuItem menuentrenador = new MenuItem(iconSubMenu, "Entrenador", null);
        MenuItem menulocalizacion = new MenuItem(iconSubMenu, "Localizacion", null);
        MenuItem menusalas = new MenuItem(iconSubMenu, "Salas", null);
        MenuItem menuactividad = new MenuItem(iconSubMenu, "Actividad", null);
        MenuItem menuhorarioactividad = new MenuItem(iconSubMenu, "Horario Actividad", null);
        MenuItem menuCobroFecha = new MenuItem(iconSubMenu, "Cobro por Rango de Fecha", null);
        MenuItem menuCobroCliente = new MenuItem(iconSubMenu, "Cobro por Clientes", null);
        MenuItem menuCuotaFecha = new MenuItem(iconSubMenu, "Cuota por Fecha", null);
        MenuItem menuCuotaClientes = new MenuItem(iconSubMenu, "Cuota por Clientes", null);
        MenuItem menuClientesBalance = new MenuItem(iconSubMenu, "Clienets con Balance Pendiente", null);
        
        

        MenuItem menuMantenimiento = new MenuItem(iconMantenimiento, "Mantenimiento", null, menuUsuario, menuEntrenador, menuLocalizacion,menuSalas,menuActividad,menuHorarioActividad,menuClientes,menuEstadoReserva,menuReserva,menuReservasActividades);
        MenuItem menuMovimiento = new MenuItem(iconMovimiento, "Movimientos", null, menuCuotas);
        MenuItem menuproceso = new MenuItem(iconProcesos, "Procesos", null,menuGenerarCobro,menuReservarCobro,menuActualizarCuotas);
        MenuItem menuConsultas = new MenuItem(iconConsultas, "Consultas", null, menuusuario,menuentrenador,menulocalizacion,menusalas,menuactividad,menuhorarioactividad,menuCobroFecha,menuCobroCliente,menuCuotaFecha,menuCuotaClientes,menuClientesBalance);
        MenuItem menuSalir = new MenuItem(iconSalir, "Salir", new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            } 
            
        });
        addMenu(menuMantenimiento, menuMovimiento, menuproceso,menuConsultas,menuSalir);
    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        menus.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        panelHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelBody = new javax.swing.JPanel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(0, 0, 0));
        panelHeader.setPreferredSize(new java.awt.Dimension(561, 50));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Californian FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GOLD GYM");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 37));

        panelMenu.setBackground(new java.awt.Color(115, 120, 230));
        panelMenu.setPreferredSize(new java.awt.Dimension(250, 384));

        jScrollPane1.setBorder(null);

        menus.setBackground(new java.awt.Color(255, 255, 255));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );

        getContentPane().add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 34, -1, 700));

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.setLayout(new javax.swing.BoxLayout(panelBody, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane2.setViewportView(panelBody);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 95, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 590, 740));

        setSize(new java.awt.Dimension(836, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
